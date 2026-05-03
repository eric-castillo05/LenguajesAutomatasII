import json
import sys
import os
from antlr4 import *
from llvmlite import ir

sys.path.append(os.path.join(os.path.dirname(__file__), 'gen'))

from gen.mainLexer import mainLexer
from gen.mainParser import mainParser
from gen.mainVisitor import mainVisitor


class CustomVisitor(mainVisitor):
    def __init__(self):
        self.module = ir.Module(name="llvm")

        self.i32 = ir.IntType(32)
        self.i8 = ir.IntType(8)
        self.voidptr_ty = self.i8.as_pointer()

        func_type = ir.FunctionType(self.i32, [])
        self.main_func = ir.Function(self.module, func_type, name="main")

        block = self.main_func.append_basic_block(name="entry")
        self.builder = ir.IRBuilder(block)

        self.triplos = []
        self.contador = 0

    def visitS(self, ctx):
        resultado_final = self.visit(ctx.expr())

        self.builder.ret(resultado_final)

        return str(self.module)

    def visitExpr(self, ctx):
        if ctx.getChildCount() == 3:
            izq = self.visit(ctx.expr())
            der = self.visit(ctx.md())
            operador = ctx.getChild(1).getText()

            if operador == '+':
                res = self.builder.add(izq, der, name=f"t{self.contador}")
            else:
                res = self.builder.sub(izq, der, name=f"t{self.contador}")

            self._registrar_triplo(operador, izq, der)
            return res
        else:
            return self.visit(ctx.md())

    def visitMd(self, ctx):
        if ctx.getChildCount() == 3:
            izq = self.visit(ctx.md())
            der = self.visit(ctx.pl())
            operador = ctx.getChild(1).getText()

            if operador == '*':
                res = self.builder.mul(izq, der, name=f"t{self.contador}")
            else:
                res = self.builder.sdiv(izq, der, name=f"t{self.contador}")

            self._registrar_triplo(operador, izq, der)
            return res
        else:
            return self.visit(ctx.pl())

    def visitPl(self, ctx):
        if ctx.expr():
            return self.visit(ctx.expr())
        else:
            nombre_var = ctx.LETTER().getText()
            valor_numerico = ord(nombre_var)
            return ir.Constant(self.i32, valor_numerico)

    def _registrar_triplo(self, op, izq, der):
        self.triplos.append((f"({self.contador})", op, str(izq), str(der)))
        self.contador += 1

    def imprimir_tabla(self):
        print("\n--- Tabla de Tríplos ---")
        for idx, op, arg1, arg2 in self.triplos:
            print(f"{idx}: {op} {arg1} {arg2}")


def ejecutar_compilador(input_str):
    input_stream = InputStream(input_str)
    lexer = mainLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = mainParser(token_stream)

    tree = parser.s()

    visitor = CustomVisitor()
    codigo_llvm = visitor.visit(tree)

    visitor.imprimir_tabla()
    print("\n--- LLVM IR ---")
    print(codigo_llvm)

    with open("salida.ll", "w") as f:
        f.write(codigo_llvm)
    print("\nArchivo 'salida.ll' generado exitosamente.")


if __name__ == "__main__":
    expr_prueba = "(a * b + c) / y * (h + i)"
    ejecutar_compilador(expr_prueba)