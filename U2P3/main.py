import sys
import os
from antlr4 import *

sys.path.append(os.path.join(os.path.dirname(__file__), 'gen'))

from gen.mainLexer import mainLexer
from gen.mainParser import mainParser
from gen.mainVisitor import mainVisitor


class CustomVisitor(mainVisitor):
    def __init__(self):
        self.triplos = []
        self.contador = 0

    def visitS(self, ctx):
        return self.visit(ctx.expr())

    def visitExpr(self, ctx):
        if ctx.md() and ctx.expr():
            operador = ctx.getChild(1).getText()
            izq = self.visit(ctx.expr())
            der = self.visit(ctx.md())
            return self._nuevo_triplo(operador, izq, der)
        else:
            return self.visit(ctx.md())

    def visitMd(self, ctx):
        if ctx.pl() and ctx.md():
            operador = ctx.getChild(1).getText()
            izq = self.visit(ctx.md())
            der = self.visit(ctx.pl())
            return self._nuevo_triplo(operador, izq, der)
        else:
            return self.visit(ctx.pl())

    def visitPl(self, ctx):
        if ctx.expr():
            return self.visit(ctx.expr())
        else:
            return ctx.LETTER().getText()

    def _nuevo_triplo(self, operador, izq, der):
        indice = f"({self.contador})"
        self.triplos.append((indice, operador, izq, der))
        self.contador += 1
        return indice

    def imprimir_tabla(self):
        print("\n--- Tabla de Código Intermedio (Tríplos) ---")
        for idx, op, arg1, arg2 in self.triplos:
            print(f"{idx}:  {op} {arg1} {arg2}")

def parse_expression(input_str):
    input_stream = InputStream(input_str)
    lexer = mainLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = mainParser(token_stream)

    tree = parser.s()

    visitor = CustomVisitor()
    visitor.visit(tree)

    visitor.imprimir_tabla()


if __name__ == "__main__":
    try:
        if os.path.exists("input.txt"):
            with open("input.txt", "r") as f:
                expr = f.read().strip()
        else:
            expr = "a * b + c"

        print(f"Entrada detectada: {expr}")
        parse_expression(expr)

    except Exception as e:
        print(f"Ocurrió un error: {e}")