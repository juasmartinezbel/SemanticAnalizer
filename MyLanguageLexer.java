// Generated from MyLanguage.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, COMMENT=6, WS=7, PIZQ=8, PDER=9, 
		NEG=10, POT=11, MULT=12, ADD=13, REL=14, EQUAL=15, DIF=16, AND=17, OR=18, 
		PYC=19, COMMA=20, SUF=21, TYPE=22, INTEGER=23, LONG=24, SINGLE=25, DOUBLE=26, 
		STRING=27, ID=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "COMMENT", "WS", "PIZQ", "PDER", 
		"NEG", "POT", "MULT", "ADD", "REL", "EQUAL", "DIF", "AND", "OR", "PYC", 
		"COMMA", "SUF", "TYPE", "INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", 
		"ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'dim'", "'as'", "'shared'", "'print'", null, null, "'('", 
		"')'", "'not'", "'^'", null, null, null, "'='", "'<>'", null, null, "';'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "COMMENT", "WS", "PIZQ", "PDER", "NEG", 
		"POT", "MULT", "ADD", "REL", "EQUAL", "DIF", "AND", "OR", "PYC", "COMMA", 
		"SUF", "TYPE", "INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", "ID"
	};
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\b\6\b`\n\b\r\b\16"+
		"\ba\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\5\rt\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17~\n\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u008e"+
		"\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00b3\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c4"+
		"\n\30\3\31\6\31\u00c7\n\31\r\31\16\31\u00c8\3\32\6\32\u00cc\n\32\r\32"+
		"\16\32\u00cd\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u00e0\n\32\3\33\6\33\u00e3\n\33\r\33\16\33"+
		"\u00e4\3\33\3\33\6\33\u00e9\n\33\r\33\16\33\u00ea\3\34\3\34\7\34\u00ef"+
		"\n\34\f\34\16\34\u00f2\13\34\3\34\3\34\3\35\3\35\7\35\u00f8\n\35\f\35"+
		"\16\35\u00fb\13\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36\3\2\17\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2,,\61"+
		"\61\4\2--//\4\2##%(\3\2\62;\3\2\62\65\3\2\62\64\3\2\629\3\2\628\3\2\60"+
		"\60\4\2C\\c|\6\2\62;C\\aac|\u0114\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5A\3\2\2\2\7E\3\2\2\2\tH\3\2\2"+
		"\2\13O\3\2\2\2\rU\3\2\2\2\17_\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2"+
		"\2\2\27m\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35}\3\2\2\2\37\177\3\2\2\2!\u0081"+
		"\3\2\2\2#\u0084\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2"+
		"+\u0093\3\2\2\2-\u00b2\3\2\2\2/\u00c3\3\2\2\2\61\u00c6\3\2\2\2\63\u00cb"+
		"\3\2\2\2\65\u00e2\3\2\2\2\67\u00ec\3\2\2\29\u00f5\3\2\2\2;<\7e\2\2<=\7"+
		"q\2\2=>\7p\2\2>?\7u\2\2?@\7v\2\2@\4\3\2\2\2AB\7f\2\2BC\7k\2\2CD\7o\2\2"+
		"D\6\3\2\2\2EF\7c\2\2FG\7u\2\2G\b\3\2\2\2HI\7u\2\2IJ\7j\2\2JK\7c\2\2KL"+
		"\7t\2\2LM\7g\2\2MN\7f\2\2N\n\3\2\2\2OP\7r\2\2PQ\7t\2\2QR\7k\2\2RS\7p\2"+
		"\2ST\7v\2\2T\f\3\2\2\2UY\7)\2\2VX\n\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2"+
		"\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\b\7\2\2]\16\3\2\2\2^`\t\3\2\2_^\3"+
		"\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\b\2\2d\20\3\2\2\2e"+
		"f\7*\2\2f\22\3\2\2\2gh\7+\2\2h\24\3\2\2\2ij\7p\2\2jk\7q\2\2kl\7v\2\2l"+
		"\26\3\2\2\2mn\7`\2\2n\30\3\2\2\2ot\t\4\2\2pq\7o\2\2qr\7q\2\2rt\7f\2\2"+
		"so\3\2\2\2sp\3\2\2\2t\32\3\2\2\2uv\t\5\2\2v\34\3\2\2\2w~\7>\2\2xy\7>\2"+
		"\2y~\7?\2\2z~\7@\2\2{|\7@\2\2|~\7?\2\2}w\3\2\2\2}x\3\2\2\2}z\3\2\2\2}"+
		"{\3\2\2\2~\36\3\2\2\2\177\u0080\7?\2\2\u0080 \3\2\2\2\u0081\u0082\7>\2"+
		"\2\u0082\u0083\7@\2\2\u0083\"\3\2\2\2\u0084\u0085\7c\2\2\u0085\u0086\7"+
		"p\2\2\u0086\u0087\7f\2\2\u0087$\3\2\2\2\u0088\u0089\7q\2\2\u0089\u008e"+
		"\7t\2\2\u008a\u008b\7z\2\2\u008b\u008c\7q\2\2\u008c\u008e\7t\2\2\u008d"+
		"\u0088\3\2\2\2\u008d\u008a\3\2\2\2\u008e&\3\2\2\2\u008f\u0090\7=\2\2\u0090"+
		"(\3\2\2\2\u0091\u0092\7.\2\2\u0092*\3\2\2\2\u0093\u0094\t\6\2\2\u0094"+
		",\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7v\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u00b3\7i\2\2\u009b\u009c\7f\2\2"+
		"\u009c\u009d\7q\2\2\u009d\u009e\7w\2\2\u009e\u009f\7d\2\2\u009f\u00a0"+
		"\7n\2\2\u00a0\u00b3\7g\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7n\2\2\u00a6\u00b3\7g\2\2"+
		"\u00a7\u00a8\7n\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7p\2\2\u00aa\u00b3"+
		"\7i\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b3\7t\2\2"+
		"\u00b2\u0095\3\2\2\2\u00b2\u009b\3\2\2\2\u00b2\u00a1\3\2\2\2\u00b2\u00a7"+
		"\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b3.\3\2\2\2\u00b4\u00c4\t\7\2\2\u00b5"+
		"\u00b6\t\7\2\2\u00b6\u00c4\t\7\2\2\u00b7\u00b8\t\7\2\2\u00b8\u00b9\t\7"+
		"\2\2\u00b9\u00c4\t\7\2\2\u00ba\u00bb\t\7\2\2\u00bb\u00bc\t\7\2\2\u00bc"+
		"\u00bd\t\7\2\2\u00bd\u00c4\t\7\2\2\u00be\u00bf\t\b\2\2\u00bf\u00c0\t\t"+
		"\2\2\u00c0\u00c1\t\n\2\2\u00c1\u00c2\t\13\2\2\u00c2\u00c4\t\n\2\2\u00c3"+
		"\u00b4\3\2\2\2\u00c3\u00b5\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2"+
		"\2\2\u00c3\u00be\3\2\2\2\u00c4\60\3\2\2\2\u00c5\u00c7\t\7\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\62\3\2\2\2\u00ca\u00cc\t\7\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00df"+
		"\t\f\2\2\u00d0\u00e0\t\7\2\2\u00d1\u00d2\t\7\2\2\u00d2\u00e0\t\7\2\2\u00d3"+
		"\u00d4\t\7\2\2\u00d4\u00d5\t\7\2\2\u00d5\u00e0\t\7\2\2\u00d6\u00d7\t\7"+
		"\2\2\u00d7\u00d8\t\7\2\2\u00d8\u00d9\t\7\2\2\u00d9\u00e0\t\7\2\2\u00da"+
		"\u00db\t\7\2\2\u00db\u00dc\t\7\2\2\u00dc\u00dd\t\7\2\2\u00dd\u00de\t\7"+
		"\2\2\u00de\u00e0\t\7\2\2\u00df\u00d0\3\2\2\2\u00df\u00d1\3\2\2\2\u00df"+
		"\u00d3\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00da\3\2\2\2\u00e0\64\3\2\2"+
		"\2\u00e1\u00e3\t\7\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\t\f\2\2\u00e7"+
		"\u00e9\t\7\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\66\3\2\2\2\u00ec\u00f0\7$\2\2\u00ed\u00ef"+
		"\n\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7$"+
		"\2\2\u00f48\3\2\2\2\u00f5\u00f9\t\r\2\2\u00f6\u00f8\t\16\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		":\3\2\2\2\u00fb\u00f9\3\2\2\2\21\2Yas}\u008d\u00b2\u00c3\u00c8\u00cd\u00df"+
		"\u00e4\u00ea\u00f0\u00f9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}