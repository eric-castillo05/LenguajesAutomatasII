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
        4,1,3,18,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,3,1,10,8,1,1,1,5,1,
        13,8,1,10,1,12,1,16,9,1,1,1,0,0,2,0,2,0,0,17,0,4,1,0,0,0,2,7,1,0,
        0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,14,5,2,0,0,8,10,5,1,0,
        0,9,8,1,0,0,0,9,10,1,0,0,0,10,11,1,0,0,0,11,13,5,2,0,0,12,9,1,0,
        0,0,13,16,1,0,0,0,14,12,1,0,0,0,14,15,1,0,0,0,15,3,1,0,0,0,16,14,
        1,0,0,0,2,9,14
    ]

class mainParser ( Parser ):

    grammarFileName = "main.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "','" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "NUMERO", "WS" ]

    RULE_archivo = 0
    RULE_lista_calificaciones = 1

    ruleNames =  [ "archivo", "lista_calificaciones" ]

    EOF = Token.EOF
    T__0=1
    NUMERO=2
    WS=3

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ArchivoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def lista_calificaciones(self):
            return self.getTypedRuleContext(mainParser.Lista_calificacionesContext,0)


        def EOF(self):
            return self.getToken(mainParser.EOF, 0)

        def getRuleIndex(self):
            return mainParser.RULE_archivo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArchivo" ):
                listener.enterArchivo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArchivo" ):
                listener.exitArchivo(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArchivo" ):
                return visitor.visitArchivo(self)
            else:
                return visitor.visitChildren(self)




    def archivo(self):

        localctx = mainParser.ArchivoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_archivo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.lista_calificaciones()
            self.state = 5
            self.match(mainParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Lista_calificacionesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMERO(self, i:int=None):
            if i is None:
                return self.getTokens(mainParser.NUMERO)
            else:
                return self.getToken(mainParser.NUMERO, i)

        def getRuleIndex(self):
            return mainParser.RULE_lista_calificaciones

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLista_calificaciones" ):
                listener.enterLista_calificaciones(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLista_calificaciones" ):
                listener.exitLista_calificaciones(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLista_calificaciones" ):
                return visitor.visitLista_calificaciones(self)
            else:
                return visitor.visitChildren(self)




    def lista_calificaciones(self):

        localctx = mainParser.Lista_calificacionesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_lista_calificaciones)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(mainParser.NUMERO)
            self.state = 14
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==1 or _la==2:
                self.state = 9
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==1:
                    self.state = 8
                    self.match(mainParser.T__0)


                self.state = 11
                self.match(mainParser.NUMERO)
                self.state = 16
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





