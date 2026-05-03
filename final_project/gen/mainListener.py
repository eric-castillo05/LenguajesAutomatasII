# Generated from main.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .mainParser import mainParser
else:
    from mainParser import mainParser

# This class defines a complete listener for a parse tree produced by mainParser.
class mainListener(ParseTreeListener):

    # Enter a parse tree produced by mainParser#s.
    def enterS(self, ctx:mainParser.SContext):
        pass

    # Exit a parse tree produced by mainParser#s.
    def exitS(self, ctx:mainParser.SContext):
        pass


    # Enter a parse tree produced by mainParser#expr.
    def enterExpr(self, ctx:mainParser.ExprContext):
        pass

    # Exit a parse tree produced by mainParser#expr.
    def exitExpr(self, ctx:mainParser.ExprContext):
        pass



del mainParser