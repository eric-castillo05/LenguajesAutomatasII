// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej5_atributos/src/main/java/g4/main.g4 by ANTLR 4.13.2
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
		LET=1, COM=2, TERM=3, WS=4;
	public static final int
		RULE_s = 0, RULE_let = 1, RULE_com = 2, RULE_term = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "let", "com", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "COM", "TERM", "WS"
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
		public int c;
		public List<LetContext> let() {
			return getRuleContexts(LetContext.class);
		}
		public LetContext let(int i) {
			return getRuleContext(LetContext.class,i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mainParser.EOF, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
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
		((SContext)_localctx).c =  0;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			let();
			_localctx.c++;
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(10);
				com();
				setState(11);
				let();
				_localctx.c++;
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			term();
			setState(20);
			match(EOF);
			System.out.println(_localctx.c);
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
	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(mainParser.LET, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(LET);
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
	public static class ComContext extends ParserRuleContext {
		public TerminalNode COM() { return getToken(mainParser.COM, 0); }
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(COM);
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
	public static class TermContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(mainParser.TERM, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(TERM);
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
		"\u0004\u0001\u0004\u001e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000"+
		"\n\u0000\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000"+
		"\u001a\u0000\b\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000"+
		"\u0004\u0019\u0001\u0000\u0000\u0000\u0006\u001b\u0001\u0000\u0000\u0000"+
		"\b\t\u0003\u0002\u0001\u0000\t\u0010\u0006\u0000\uffff\uffff\u0000\n\u000b"+
		"\u0003\u0004\u0002\u0000\u000b\f\u0003\u0002\u0001\u0000\f\r\u0006\u0000"+
		"\uffff\uffff\u0000\r\u000f\u0001\u0000\u0000\u0000\u000e\n\u0001\u0000"+
		"\u0000\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0013\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0006"+
		"\u0003\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0016\u0006\u0000"+
		"\uffff\uffff\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"\u0001\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"\u0002\u0000\u0000\u001a\u0005\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"\u0003\u0000\u0000\u001c\u0007\u0001\u0000\u0000\u0000\u0001\u0010";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}