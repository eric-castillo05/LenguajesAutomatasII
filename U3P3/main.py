import sys, os, subprocess
from antlr4 import *
from llvmlite import ir, binding as llvm

sys.path.append(os.path.join(os.path.dirname(__file__), 'gen'))
from gen.mainLexer import mainLexer
from gen.mainParser import mainParser
from gen.mainVisitor import mainVisitor

class CustomVisitor(mainVisitor):
    def __init__(self):
        self.module = ir.Module(name="llvm")
        self.i32 = ir.IntType(32)
        self.i8 = ir.IntType(8)
        self.i8p = ir.PointerType(self.i8)
        self.i8pp = ir.PointerType(self.i8p)

        # declarar atoi
        atoi_ty = ir.FunctionType(self.i32, [self.i8p])
        self.atoi = ir.Function(self.module, atoi_ty, name="atoi")

        # declarar printf
        printf_ty = ir.FunctionType(self.i32, [self.i8p], var_arg=True)
        self.printf = ir.Function(self.module, printf_ty, name="printf")

        # main(int argc, char** argv)
        func_type = ir.FunctionType(self.i32, [self.i32, self.i8pp])
        self.main_func = ir.Function(self.module, func_type, name="main")
        self.argc = self.main_func.args[0]
        self.argv = self.main_func.args[1]

        self.entry_block = self.main_func.append_basic_block(name="entry")
        self.builder = ir.IRBuilder(self.entry_block)
        self.variables = {}
        self.contador = 0
        self.arg_index = 1

    def new_tmp(self):
        name = f"t{self.contador}"
        self.contador += 1
        return name

    def visitS(self, ctx):
        result = self.visit(ctx.expr())

        fmt = "%d\n\0"
        c_fmt = ir.Constant(ir.ArrayType(self.i8, len(fmt)),
                            bytearray(fmt.encode("utf8")))
        global_fmt = ir.GlobalVariable(self.module, c_fmt.type, name="fmt")
        global_fmt.linkage = 'internal'
        global_fmt.global_constant = True
        global_fmt.initializer = c_fmt
        fmt_ptr = self.builder.bitcast(global_fmt, self.i8p)
        self.builder.call(self.printf, [fmt_ptr, result])

        self.builder.ret(result)
        return str(self.module)

    def visitExpr(self, ctx):
        if ctx.getChildCount() == 3:
            izq = self.visit(ctx.expr())
            der = self.visit(ctx.md())
            op = ctx.getChild(1).getText()
            tmp = self.new_tmp()
            return self.builder.add(izq, der, name=tmp) if op == '+' \
                   else self.builder.sub(izq, der, name=tmp)
        return self.visit(ctx.md())

    def visitMd(self, ctx):
        if ctx.getChildCount() == 3:
            izq = self.visit(ctx.md())
            der = self.visit(ctx.pl())
            op = ctx.getChild(1).getText()
            tmp = self.new_tmp()
            return self.builder.mul(izq, der, name=tmp) if op == '*' \
                   else self.builder.sdiv(izq, der, name=tmp)
        return self.visit(ctx.pl())

    def visitPl(self, ctx):
        if ctx.expr():
            return self.visit(ctx.expr())

        nombre = ctx.LETTER().getText()
        if nombre not in self.variables:
            idx = ir.Constant(self.i32, self.arg_index)
            self.arg_index += 1

            arg_ptr = self.builder.gep(self.argv, [idx], name=f"ptr_{nombre}")
            arg_val = self.builder.load(arg_ptr, name=f"str_{nombre}")
            int_val = self.builder.call(self.atoi, [arg_val], name=f"int_{nombre}")

            ptr = self.builder.alloca(self.i32, name=nombre)
            self.builder.store(int_val, ptr)
            self.variables[nombre] = ptr

        return self.builder.load(self.variables[nombre], name=f"load_{nombre}")

def generar_codigo_maquina(llvm_ir: str):
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

    llvm.set_option("", "--passes=default<O3>")

    asm = target_machine.emit_assembly(mod)
    obj = target_machine.emit_object(mod)

    with open("output.s", "w") as f:
        f.write(asm)
    print("\n--- ENSAMBLADOR OPTIMIZADO (output.s) ---")
    print(asm[:800])

    with open("output.o", "wb") as f:
        f.write(obj)

    subprocess.run(["clang", "output.o", "-o", "programa"], check=True)
    print("\nCompilación OK → ./programa")

def ejecutar(input_str: str):
    input_stream = InputStream(input_str)
    lexer  = mainLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = mainParser(tokens)
    tree   = parser.s()

    visitor = CustomVisitor()
    llvm_ir = visitor.visit(tree)

    print("\n--- LLVM IR (sin optimizar) ---")
    print(llvm_ir)
    with open("salida.ll", "w") as f:
        f.write(llvm_ir)

    generar_codigo_maquina(llvm_ir)

if __name__ == "__main__":
    expr = "x * d"
    ejecutar(expr)