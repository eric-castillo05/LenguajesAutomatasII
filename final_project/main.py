import subprocess
from typing import List
from itertools import permutations
from antlr4 import *
from gen.mainLexer import mainLexer
from gen.mainParser import mainParser
from gen.mainVisitor import mainVisitor
from llvmlite import ir, binding as llvm

class Order:
    def __init__(self, name: str, preparation_time: int, deliver_time: int, max_deliver_time: int, penalization: int):
        self.name = name
        self.preparation_time = preparation_time
        self.deliver_time = deliver_time
        self.max_deliver_time = max_deliver_time
        self.penalization = penalization


class CustomVisitor(mainVisitor):
    def __init__(self):
        self.orders = []
        self.module = ir.Module(name="llvm")
        self.i32 = ir.IntType(32)
        self.i8 = ir.IntType(8)
        self.i8p = ir.PointerType(self.i8)
        self.i8pp = ir.PointerType(self.i8p)

    def visitS(self, ctx):
        for expr_ctx in ctx.expr():
            self.visit(expr_ctx)
        return self.orders

    def visitExpr(self, ctx):
        self.orders.append(Order(
            name=ctx.name.text,
            preparation_time=int(ctx.preparation_time.text),
            deliver_time=int(ctx.deliver_time.text),
            max_deliver_time=int(ctx.max_deliver_time.text),
            penalization=int(ctx.penalization.text),
        ))



def validate(orders: List[Order]):
    seen = set()
    for o in orders:
        assert o.preparation_time > 0, f"{o.name}: prep<=0"
        assert o.name not in seen, f"{o.name}: duplicado"
        seen.add(o.name)


def _solve(orders: List[Order]) -> None:
    best_penalty = float('inf')
    best_result = []

    for p in permutations(orders):
        time = 0
        total_penalty = 0
        current_result = []

        for o in p:
            time += o.preparation_time + o.deliver_time
            late = max(0, time - o.max_deliver_time)
            penalty = late * o.penalization
            total_penalty += penalty

            current_result.append({
                'order': o.name,
                'finish': time,
                'late': late,
                'penalty': penalty
            })

        if total_penalty < best_penalty:
            best_penalty = total_penalty
            best_result = current_result

    return best_result, best_penalty

def build_llvm(orders, schedule_result, total_penalty):
    module = ir.Module(name="scheduler")
    i32    = ir.IntType(32)
    i8p    = ir.PointerType(ir.IntType(8))

    printf_ty = ir.FunctionType(i32, [i8p], var_arg=True)
    printf    = ir.Function(module, printf_ty, name="printf")

    main_fn = ir.Function(module, ir.FunctionType(i32, []), name="main")
    block   = main_fn.append_basic_block("entry")
    b       = ir.IRBuilder(block)

    def make_str(s, gname):
        s += "\0"
        c = ir.Constant(ir.ArrayType(ir.IntType(8), len(s)), bytearray(s.encode()))
        g = ir.GlobalVariable(module, c.type, name=gname)
        g.linkage = 'internal'
        g.global_constant = True
        g.initializer = c
        return b.bitcast(g, i8p)

    # header
    header_ptr = make_str("Secuencia optima de ordenes:\n", "fmt_header")
    b.call(printf, [header_ptr])

    # fmt para cada orden: "Paso N: Orden X | finish=F | late=L | penalty=P\n"
    row_fmt_ptr = make_str("Paso %d: Orden %s | finish=%d | late=%d | penalty=%d\n", "fmt_row")

    for i, r in enumerate(schedule_result):
        # nombre de orden como string global
        name_ptr = make_str(r['order'], f"name_{r['order']}")

        b.call(printf, [
            row_fmt_ptr,
            ir.Constant(i32, i + 1),
            name_ptr,
            ir.Constant(i32, r['finish']),
            ir.Constant(i32, r['late']),
            ir.Constant(i32, r['penalty']),
        ])

    # total
    total_fmt_ptr = make_str("\nPenalizacion total: %d\n", "fmt_total")
    acc = ir.Constant(i32, 0)
    for r in schedule_result:
        acc = b.add(acc, ir.Constant(i32, r['penalty']), name=f"p_{r['order']}")
    b.call(printf, [total_fmt_ptr, acc])

    b.ret(ir.Constant(i32, 0))
    return str(module)

def generate_machine_code(llvm_ir: str):
    llvm.initialize_native_target()
    llvm.initialize_native_asmprinter()

    mod = llvm.parse_assembly(llvm_ir)
    mod.verify()

    triple = llvm.get_default_triple()
    target = llvm.Target.from_triple(triple)
    target_machine = target.create_target_machine(
        codemodel='default',
        reloc='pic',
        opt=3
    )

    asm = target_machine.emit_assembly(mod)
    obj = target_machine.emit_object(mod)

    with open("output.s", "w") as f:
        f.write(asm)
    print("\n--- ENSAMBLADOR (output.s) ---")
    print(asm[:800])

    with open("output.o", "wb") as f:
        f.write(obj)

    subprocess.run(["clang", "output.o", "-o", "main"], check=True)
    print("\nCompilación OK → ./main")

if __name__ == '__main__':
    stream  = FileStream('input.txt')
    lexer   = mainLexer(stream)
    tokens  = CommonTokenStream(lexer)
    parser  = mainParser(tokens)
    tree    = parser.s()

    visitor = CustomVisitor()
    visitor.visit(tree)
    orders  = visitor.orders

    validate(orders)

    result, total = _solve(orders)
    for r in result:
        print(r)
    print(f"Total penalización: {total}")

    llvm_ir = build_llvm(orders, result, total)
    with open("salida.ll", "w") as f:
        f.write(llvm_ir)
    print(llvm_ir)
    generate_machine_code(llvm_ir)