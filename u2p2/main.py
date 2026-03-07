import sys
import os
from wsgiref.types import InputStream

from antlr4 import *

sys.path.append(os.path.join(os.path.dirname(__file__), 'gen'))

from gen.mainLexer import mainLexer
from gen.mainParser import mainParser
from gen.mainVisitor import mainVisitor


class CustomVisitor(mainVisitor):
    def visitArchivo(self, ctx):
        return self.visit(ctx.lista_calificaciones())

    def visitLista_calificaciones(self, ctx):
        calificaciones = [int(n.getText()) for n in ctx.NUMERO()]

        if not calificaciones:
            print("No se encontraron calificaciones.")
            return 0

        promedio = sum(calificaciones) / len(calificaciones)

        print("\n--- Reporte de Calificaciones ---")
        print(f"Lista: {calificaciones}")
        print(f"Promedio: {promedio:.2f}")
        return promedio


def parse_expression(input_str):
    lexer = mainLexer(InputStream(input_str))
    stream = CommonTokenStream(lexer)
    parser = mainParser(stream)

    tree = parser.archivo()

    visitor = CustomVisitor()
    return visitor.visit(tree)


if __name__ == "__main__":
    try:
        # Leer el archivo input.txt
        with open("input.txt", "r") as f:
            expr = f.read().strip()

        print("Entrada detectada:")
        print(expr)

        parse_expression(expr)

    except FileNotFoundError:
        print("Error: El archivo 'input.txt' no existe.")
    except Exception as e:
        print(f"Ocurrió un error: {e}")