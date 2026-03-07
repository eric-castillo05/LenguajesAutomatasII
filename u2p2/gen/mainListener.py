# Generated from main.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .mainParser import mainParser
else:
    from mainParser import mainParser

# This class defines a complete listener for a parse tree produced by mainParser.
class mainListener(ParseTreeListener):

    # Enter a parse tree produced by mainParser#archivo.
    def enterArchivo(self, ctx:mainParser.ArchivoContext):
        pass

    # Exit a parse tree produced by mainParser#archivo.
    def exitArchivo(self, ctx:mainParser.ArchivoContext):
        pass


    # Enter a parse tree produced by mainParser#lista_calificaciones.
    def enterLista_calificaciones(self, ctx:mainParser.Lista_calificacionesContext):
        pass

    # Exit a parse tree produced by mainParser#lista_calificaciones.
    def exitLista_calificaciones(self, ctx:mainParser.Lista_calificacionesContext):
        pass



del mainParser