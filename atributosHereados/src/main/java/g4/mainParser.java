// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/atributosHereados/src/main/java/g4/main.g4 by ANTLR 4.13.2
package g4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class mainParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Num=2;
	public static final int
		RULE_s = 0, RULE_descuento = 1, RULE_precio = 2, RULE_entero = 3, RULE_real = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "descuento", "precio", "entero", "real"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Num"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	 
		public SContext() { }
		public void copyFrom(SContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EXPContext extends SContext {
		public PrecioContext precio() {
			return getRuleContext(PrecioContext.class,0);
		}
		public DescuentoContext descuento() {
			return getRuleContext(DescuentoContext.class,0);
		}
		public EXPContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterEXP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitEXP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitEXP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			_localctx = new EXPContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			precio();
			setState(11);
			descuento();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescuentoContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public DescuentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descuento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterDescuento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitDescuento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitDescuento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescuentoContext descuento() throws RecognitionException {
		DescuentoContext _localctx = new DescuentoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_descuento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			entero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrecioContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public PrecioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterPrecio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitPrecio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitPrecio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecioContext precio() throws RecognitionException {
		PrecioContext _localctx = new PrecioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_precio);
		try {
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				real();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(mainParser.Num, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(Num);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> Num() { return getTokens(mainParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(mainParser.Num, i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(Num);
			setState(22);
			match(T__0);
			setState(23);
			match(Num);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0002\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0012\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0000\u0015\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0002\r\u0001\u0000\u0000\u0000\u0004\u0011\u0001\u0000\u0000\u0000\u0006"+
		"\u0013\u0001\u0000\u0000\u0000\b\u0015\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0003\u0004\u0002\u0000\u000b\f\u0003\u0002\u0001\u0000\f\u0001\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0003\u0006\u0003\u0000\u000e\u0003\u0001\u0000"+
		"\u0000\u0000\u000f\u0012\u0003\u0006\u0003\u0000\u0010\u0012\u0003\b\u0004"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000"+
		"\u0000\u0012\u0005\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0002\u0000"+
		"\u0000\u0014\u0007\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0002\u0000"+
		"\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\u0002\u0000"+
		"\u0000\u0018\t\u0001\u0000\u0000\u0000\u0001\u0011";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}