// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej7_int_float/src/main/java/g4/main.g4 by ANTLR 4.13.2
package g4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class mainLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, ID=2, EQUALS=3, NUM=4, INT=5, FLOAT=6, SEMICOLON=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "ID", "EQUALS", "NUM", "INT", "FLOAT", "SEMICOLON", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'='", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "ID", "EQUALS", "NUM", "INT", "FLOAT", "SEMICOLON", "WS"
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


	public mainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "main.g4"; }

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
		"\u0004\u0000\b9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\"\b\u0003\u0001\u0004\u0004\u0004%\b\u0004\u000b\u0004\f\u0004&\u0001"+
		"\u0005\u0004\u0005*\b\u0005\u000b\u0005\f\u0005+\u0001\u0005\u0001\u0005"+
		"\u0004\u00050\b\u0005\u000b\u0005\f\u00051\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  =\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0019"+
		"\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005\u001d"+
		"\u0001\u0000\u0000\u0000\u0007!\u0001\u0000\u0000\u0000\t$\u0001\u0000"+
		"\u0000\u0000\u000b)\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000"+
		"\u000f5\u0001\u0000\u0000\u0000\u0011\u0012\u0005i\u0000\u0000\u0012\u0013"+
		"\u0005n\u0000\u0000\u0013\u001a\u0005t\u0000\u0000\u0014\u0015\u0005f"+
		"\u0000\u0000\u0015\u0016\u0005l\u0000\u0000\u0016\u0017\u0005o\u0000\u0000"+
		"\u0017\u0018\u0005a\u0000\u0000\u0018\u001a\u0005t\u0000\u0000\u0019\u0011"+
		"\u0001\u0000\u0000\u0000\u0019\u0014\u0001\u0000\u0000\u0000\u001a\u0002"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0007\u0000\u0000\u0000\u001c\u0004"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0005=\u0000\u0000\u001e\u0006\u0001"+
		"\u0000\u0000\u0000\u001f\"\u0003\t\u0004\u0000 \"\u0003\u000b\u0005\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"\b\u0001\u0000"+
		"\u0000\u0000#%\u0007\u0001\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'\n\u0001\u0000\u0000\u0000(*\u0007\u0001\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0005.\u0000\u0000.0\u0007\u0001"+
		"\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u00002\f\u0001\u0000\u0000\u0000"+
		"34\u0005;\u0000\u00004\u000e\u0001\u0000\u0000\u000056\u0007\u0002\u0000"+
		"\u000067\u0001\u0000\u0000\u000078\u0006\u0007\u0000\u00008\u0010\u0001"+
		"\u0000\u0000\u0000\u0006\u0000\u0019!&+1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}