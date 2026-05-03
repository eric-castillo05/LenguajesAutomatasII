# Generated from main.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,4,19,2,0,7,0,2,1,7,1,1,0,4,0,6,8,0,11,0,12,0,7,1,0,1,0,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,2,0,2,0,0,17,0,5,1,0,0,0,2,11,1,0,
        0,0,4,6,3,2,1,0,5,4,1,0,0,0,6,7,1,0,0,0,7,5,1,0,0,0,7,8,1,0,0,0,
        8,9,1,0,0,0,9,10,5,0,0,1,10,1,1,0,0,0,11,12,5,1,0,0,12,13,5,2,0,
        0,13,14,5,3,0,0,14,15,5,3,0,0,15,16,5,3,0,0,16,17,5,3,0,0,17,3,1,
        0,0,0,1,7
    ]

class mainParser ( Parser ):

    grammarFileName = "main.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'Orden'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "LETTER", "NUMBER", "WS" ]

    RULE_s = 0
    RULE_expr = 1

    ruleNames =  [ "s", "expr" ]

    EOF = Token.EOF
    T__0=1
    LETTER=2
    NUMBER=3
    WS=4

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class SContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(mainParser.EOF, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(mainParser.ExprContext)
            else:
                return self.getTypedRuleContext(mainParser.ExprContext,i)


        def getRuleIndex(self):
            return mainParser.RULE_s

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterS" ):
                listener.enterS(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitS" ):
                listener.exitS(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitS" ):
                return visitor.visitS(self)
            else:
                return visitor.visitChildren(self)




    def s(self):

        localctx = mainParser.SContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_s)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 5 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 4
                self.expr()
                self.state = 7 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1):
                    break

            self.state = 9
            self.match(mainParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.name = None # Token
            self.preparation_time = None # Token
            self.deliver_time = None # Token
            self.max_deliver_time = None # Token
            self.penalization = None # Token

        def LETTER(self):
            return self.getToken(mainParser.LETTER, 0)

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(mainParser.NUMBER)
            else:
                return self.getToken(mainParser.NUMBER, i)

        def getRuleIndex(self):
            return mainParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)




    def expr(self):

        localctx = mainParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            self.match(mainParser.T__0)
            self.state = 12
            localctx.name = self.match(mainParser.LETTER)
            self.state = 13
            localctx.preparation_time = self.match(mainParser.NUMBER)
            self.state = 14
            localctx.deliver_time = self.match(mainParser.NUMBER)
            self.state = 15
            localctx.max_deliver_time = self.match(mainParser.NUMBER)
            self.state = 16
            localctx.penalization = self.match(mainParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





