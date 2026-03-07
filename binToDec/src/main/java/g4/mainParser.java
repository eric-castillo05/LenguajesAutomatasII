// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/binToDec/src/main/java/g4/main.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, WS=3;
	public static final int
		RULE_s = 0, RULE_c = 1, RULE_nb = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "c", "nb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS"
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
		public int v;
		public NbContext n;
		public CContext c;
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public NbContext nb() {
			return getRuleContext(NbContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			((SContext)_localctx).n = nb();
			setState(7);
			((SContext)_localctx).c = c(((SContext)_localctx).n.val);

			        ((SContext)_localctx).v =  ((SContext)_localctx).c.v;
			        System.out.println("El valor en decimal es: " + _localctx.v);
			    
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
	public static class CContext extends ParserRuleContext {
		public int h;
		public int v;
		public NbContext n;
		public CContext c;
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public NbContext nb() {
			return getRuleContext(NbContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CContext(ParserRuleContext parent, int invokingState, int h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c(int h) throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState(), h);
		enterRule(_localctx, 2, RULE_c);
		try {
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				((CContext)_localctx).n = nb();
				setState(11);
				((CContext)_localctx).c = c((_localctx.h * 2) + ((CContext)_localctx).n.val);

				        ((CContext)_localctx).v =  ((CContext)_localctx).c.v; // Subimos el valor final sintetizado
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				((CContext)_localctx).n = nb();

				        ((CContext)_localctx).v =  (_localctx.h * 2) + ((CContext)_localctx).n.val; // Caso base: calculamos el valor final y lo empezamos a subir
				    
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
	public static class NbContext extends ParserRuleContext {
		public int val;
		public NbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterNb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitNb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitNb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NbContext nb() throws RecognitionException {
		NbContext _localctx = new NbContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nb);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__0);
				 ((NbContext)_localctx).val =  0; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__1);
				 ((NbContext)_localctx).val =  1; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\u0003\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0018\b\u0002\u0001\u0002\u0000\u0000\u0003\u0000"+
		"\u0002\u0004\u0000\u0000\u0018\u0000\u0006\u0001\u0000\u0000\u0000\u0002"+
		"\u0011\u0001\u0000\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006"+
		"\u0007\u0003\u0004\u0002\u0000\u0007\b\u0003\u0002\u0001\u0000\b\t\u0006"+
		"\u0000\uffff\uffff\u0000\t\u0001\u0001\u0000\u0000\u0000\n\u000b\u0003"+
		"\u0004\u0002\u0000\u000b\f\u0003\u0002\u0001\u0000\f\r\u0006\u0001\uffff"+
		"\uffff\u0000\r\u0012\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0004\u0002"+
		"\u0000\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010\u0012\u0001\u0000"+
		"\u0000\u0000\u0011\n\u0001\u0000\u0000\u0000\u0011\u000e\u0001\u0000\u0000"+
		"\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0001\u0000"+
		"\u0000\u0014\u0018\u0006\u0002\uffff\uffff\u0000\u0015\u0016\u0005\u0002"+
		"\u0000\u0000\u0016\u0018\u0006\u0002\uffff\uffff\u0000\u0017\u0013\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0005\u0001"+
		"\u0000\u0000\u0000\u0002\u0011\u0017";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}