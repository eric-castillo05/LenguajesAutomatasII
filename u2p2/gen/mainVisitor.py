# Generated from main.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .mainParser import mainParser
else:
    from mainParser import mainParser

# This class defines a complete generic visitor for a parse tree produced by mainParser.

class mainVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by mainParser#archivo.
    def visitArchivo(self, ctx:mainParser.ArchivoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mainParser#lista_calificaciones.
    def visitLista_calificaciones(self, ctx:mainParser.Lista_calificacionesContext):
        return self.visitChildren(ctx)



del mainParser