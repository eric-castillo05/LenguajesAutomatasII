// Generated from U1P1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class U1P1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NC=2, NAME=3, CARRER=4, SEMESTER=5, GENDER=6, AGE=7, AVG=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NC", "NAME", "CARRER", "SEMESTER", "GENDER", "AGE", "AVG", "DIGIT", 
			"WS"
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


	public U1P1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "U1P1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\tJ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0003\u0004\u0003*\b\u0003"+
		"\u000b\u0003\f\u0003+\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"1\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u00069\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0004\tE\b\t\u000b\t\f\tF\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\u0000\u0013\t\u0001\u0000\t\u0001\u0000AZ\u0002\u0000AZaz\u0001"+
		"\u000019\u0001\u000002\u0002\u0000FFMM\u0001\u000089\u0001\u000003\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  M\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001"+
		"\u0000\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000\u0005!\u0001\u0000"+
		"\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000"+
		"\u000b2\u0001\u0000\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f:\u0001"+
		"\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013D\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005,\u0000\u0000\u0016\u0002\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0003\u0011\b\u0000\u0018\u0019\u0003\u0011\b\u0000\u0019"+
		"\u001a\u00050\u0000\u0000\u001a\u001b\u00059\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0003\u0011\b\u0000\u001d\u001e\u0003\u0011"+
		"\b\u0000\u001e\u001f\u0003\u0011\b\u0000\u001f \u0003\u0011\b\u0000 \u0004"+
		"\u0001\u0000\u0000\u0000!%\u0007\u0000\u0000\u0000\"$\u0007\u0001\u0000"+
		"\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0006\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000(*\u0007\u0001\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,\b\u0001\u0000\u0000\u0000-1\u0007\u0002\u0000\u0000./\u0005"+
		"1\u0000\u0000/1\u0007\u0003\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u00001\n\u0001\u0000\u0000\u000023\u0007\u0004\u0000\u0000"+
		"3\f\u0001\u0000\u0000\u000045\u00051\u0000\u000059\u0007\u0005\u0000\u0000"+
		"67\u00052\u0000\u000079\u0007\u0006\u0000\u000084\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u00009\u000e\u0001\u0000\u0000\u0000:;\u0003\u0011"+
		"\b\u0000;<\u0003\u0011\b\u0000<=\u0003\u0011\b\u0000=>\u0005.\u0000\u0000"+
		">?\u0003\u0011\b\u0000?@\u0003\u0011\b\u0000@\u0010\u0001\u0000\u0000"+
		"\u0000AB\u0007\u0007\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CE\u0007"+
		"\b\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HI\u0006\t\u0000\u0000I\u0014\u0001\u0000\u0000\u0000\u0006\u0000%+08"+
		"F\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}