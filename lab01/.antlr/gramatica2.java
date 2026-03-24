// Generated from /home/rtgomes/Documents/compilers/lab01/gramatica2.g by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramatica2 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, GAG=2, OLD=3, YAG=4, BETA=5, CRU=6, PERIOT=7, COMMA=8, EXCLAM=9, 
		DIGITO=10, DEZENA=11, CENTENA=12, MILHAR=13, MILHAO=14, IF=15, ELSE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "GAG", "OLD", "YAG", "BETA", "CRU", "PERIOT", "COMMA", "EXCLAM", 
			"DIGITO", "DEZENA", "CENTENA", "MILHAR", "MILHAO", "IF", "ELSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'gag'", "'old'", "'yag'", "'beta'", "'cru'", "'.'", "','", 
			"'!'", null, null, null, null, null, "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "GAG", "OLD", "YAG", "BETA", "CRU", "PERIOT", "COMMA", "EXCLAM", 
			"DIGITO", "DEZENA", "CENTENA", "MILHAR", "MILHAO", "IF", "ELSE"
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


	public gramatica2(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica2.g"; }

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
		"\u0004\u0000\u0010Y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0002\u0002\u0000\t\n  \u0001\u0000"+
		"09Y\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"\"\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u0005,\u0001"+
		"\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000"+
		"\u0000\u000b9\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000\u000f"+
		"?\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013C\u0001"+
		"\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000"+
		"\u0000\u0019K\u0001\u0000\u0000\u0000\u001bN\u0001\u0000\u0000\u0000\u001d"+
		"Q\u0001\u0000\u0000\u0000\u001fT\u0001\u0000\u0000\u0000!#\u0007\u0000"+
		"\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\'\u0006\u0000\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005g\u0000"+
		"\u0000)*\u0005a\u0000\u0000*+\u0005g\u0000\u0000+\u0004\u0001\u0000\u0000"+
		"\u0000,-\u0005o\u0000\u0000-.\u0005l\u0000\u0000./\u0005d\u0000\u0000"+
		"/\u0006\u0001\u0000\u0000\u000001\u0005y\u0000\u000012\u0005a\u0000\u0000"+
		"23\u0005g\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005b\u0000\u0000"+
		"56\u0005e\u0000\u000067\u0005t\u0000\u000078\u0005a\u0000\u00008\n\u0001"+
		"\u0000\u0000\u00009:\u0005c\u0000\u0000:;\u0005r\u0000\u0000;<\u0005u"+
		"\u0000\u0000<\f\u0001\u0000\u0000\u0000=>\u0005.\u0000\u0000>\u000e\u0001"+
		"\u0000\u0000\u0000?@\u0005,\u0000\u0000@\u0010\u0001\u0000\u0000\u0000"+
		"AB\u0005!\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CD\u0007\u0001\u0000"+
		"\u0000D\u0014\u0001\u0000\u0000\u0000EF\u0003\u0013\t\u0000FG\u0003\u0013"+
		"\t\u0000G\u0016\u0001\u0000\u0000\u0000HI\u0003\u0015\n\u0000IJ\u0003"+
		"\u0013\t\u0000J\u0018\u0001\u0000\u0000\u0000KL\u0003\u0017\u000b\u0000"+
		"LM\u0003\u0013\t\u0000M\u001a\u0001\u0000\u0000\u0000NO\u0003\u0019\f"+
		"\u0000OP\u0003\u0013\t\u0000P\u001c\u0001\u0000\u0000\u0000QR\u0005i\u0000"+
		"\u0000RS\u0005f\u0000\u0000S\u001e\u0001\u0000\u0000\u0000TU\u0005e\u0000"+
		"\u0000UV\u0005l\u0000\u0000VW\u0005s\u0000\u0000WX\u0005e\u0000\u0000"+
		"X \u0001\u0000\u0000\u0000\u0002\u0000$\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}