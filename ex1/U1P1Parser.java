// Generated from U1P1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class U1P1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NC=2, NAME=3, CARRER=4, SEMESTER=5, GENDER=6, AGE=7, AVG=8, WS=9;
	public static final int
		RULE_prule = 0, RULE_nc = 1, RULE_name = 2, RULE_carrer = 3, RULE_semester = 4, 
		RULE_gender = 5, RULE_age = 6, RULE_avg = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prule", "nc", "name", "carrer", "semester", "gender", "age", "avg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NC", "NAME", "CARRER", "SEMESTER", "GENDER", "AGE", "AVG", 
			"WS"
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
	public String getGrammarFileName() { return "U1P1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public U1P1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PruleContext extends ParserRuleContext {
		public NcContext nc() {
			return getRuleContext(NcContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CarrerContext carrer() {
			return getRuleContext(CarrerContext.class,0);
		}
		public SemesterContext semester() {
			return getRuleContext(SemesterContext.class,0);
		}
		public GenderContext gender() {
			return getRuleContext(GenderContext.class,0);
		}
		public AgeContext age() {
			return getRuleContext(AgeContext.class,0);
		}
		public AvgContext avg() {
			return getRuleContext(AvgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(U1P1Parser.EOF, 0); }
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).exitPrule(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			nc();
			setState(17);
			match(T__0);
			setState(18);
			name();
			setState(19);
			match(T__0);
			setState(20);
			carrer();
			setState(21);
			match(T__0);
			setState(22);
			semester();
			setState(23);
			match(T__0);
			setState(24);
			gender();
			setState(25);
			match(T__0);
			setState(26);
			age();
			setState(27);
			match(T__0);
			setState(28);
			avg();
			setState(29);
			match(EOF);
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
	public static class NcContext extends ParserRuleContext {
		public TerminalNode NC() { return getToken(U1P1Parser.NC, 0); }
		public NcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).enterNc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).exitNc(this);
		}
	}

	public final NcContext nc() throws RecognitionException {
		NcContext _localctx = new NcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(NC);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(U1P1Parser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(NAME);
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
	public static class CarrerContext extends ParserRuleContext {
		public TerminalNode CARRER() { return getToken(U1P1Parser.CARRER, 0); }
		public CarrerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carrer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).enterCarrer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).exitCarrer(this);
		}
	}

	public final CarrerContext carrer() throws RecognitionException {
		CarrerContext _localctx = new CarrerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_carrer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(CARRER);
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
	public static class SemesterContext extends ParserRuleContext {
		public TerminalNode SEMESTER() { return getToken(U1P1Parser.SEMESTER, 0); }
		public SemesterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semester; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).enterSemester(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).exitSemester(this);
		}
	}

	public final SemesterContext semester() throws RecognitionException {
		SemesterContext _localctx = new SemesterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_semester);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(SEMESTER);
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
	public static class GenderContext extends ParserRuleContext {
		public TerminalNode GENDER() { return getToken(U1P1Parser.GENDER, 0); }
		public GenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gender; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).enterGender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).exitGender(this);
		}
	}

	public final GenderContext gender() throws RecognitionException {
		GenderContext _localctx = new GenderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(GENDER);
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
	public static class AgeContext extends ParserRuleContext {
		public TerminalNode AGE() { return getToken(U1P1Parser.AGE, 0); }
		public AgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_age; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).enterAge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).exitAge(this);
		}
	}

	public final AgeContext age() throws RecognitionException {
		AgeContext _localctx = new AgeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_age);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(AGE);
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
	public static class AvgContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(U1P1Parser.AVG, 0); }
		public AvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).enterAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof U1P1Listener ) ((U1P1Listener)listener).exitAvg(this);
		}
	}

	public final AvgContext avg() throws RecognitionException {
		AvgContext _localctx = new AvgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_avg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(AVG);
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
		"\u0004\u0001\t.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000"+
		"\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000%\u0000\u0010"+
		"\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004!\u0001"+
		"\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b%\u0001\u0000\u0000"+
		"\u0000\n\'\u0001\u0000\u0000\u0000\f)\u0001\u0000\u0000\u0000\u000e+\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0005"+
		"\u0001\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0014\u0005"+
		"\u0001\u0000\u0000\u0014\u0015\u0003\u0006\u0003\u0000\u0015\u0016\u0005"+
		"\u0001\u0000\u0000\u0016\u0017\u0003\b\u0004\u0000\u0017\u0018\u0005\u0001"+
		"\u0000\u0000\u0018\u0019\u0003\n\u0005\u0000\u0019\u001a\u0005\u0001\u0000"+
		"\u0000\u001a\u001b\u0003\f\u0006\u0000\u001b\u001c\u0005\u0001\u0000\u0000"+
		"\u001c\u001d\u0003\u000e\u0007\u0000\u001d\u001e\u0005\u0000\u0000\u0001"+
		"\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0005\u0002\u0000\u0000 \u0003"+
		"\u0001\u0000\u0000\u0000!\"\u0005\u0003\u0000\u0000\"\u0005\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0004\u0000\u0000$\u0007\u0001\u0000\u0000\u0000"+
		"%&\u0005\u0005\u0000\u0000&\t\u0001\u0000\u0000\u0000\'(\u0005\u0006\u0000"+
		"\u0000(\u000b\u0001\u0000\u0000\u0000)*\u0005\u0007\u0000\u0000*\r\u0001"+
		"\u0000\u0000\u0000+,\u0005\b\u0000\u0000,\u000f\u0001\u0000\u0000\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}