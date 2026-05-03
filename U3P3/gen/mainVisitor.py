# Generated from main.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .mainParser import mainParser
else:
    from mainParser import mainParser

# This class defines a complete generic visitor for a parse tree produced by mainParser.

class mainVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by mainParser#s.
    def visitS(self, ctx:mainParser.SContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mainParser#expr.
    def visitExpr(self, ctx:mainParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mainParser#md.
    def visitMd(self, ctx:mainParser.MdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mainParser#pl.
    def visitPl(self, ctx:mainParser.PlContext):
        return self.visitChildren(ctx)



del mainParser