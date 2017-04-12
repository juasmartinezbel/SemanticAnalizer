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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, COMMENT=12, WS=13, PIZQ=14, PDER=15, NEG=16, POT=17, 
		MULT=18, ADD=19, REL=20, EQUAL=21, DIF=22, AND=23, OR=24, PYC=25, COMMA=26, 
		SUF=27, TYPE=28, INTEGER=29, LONG=30, SINGLE=31, DOUBLE=32, STRING=33, 
		ID=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "COMMENT", "WS", "PIZQ", "PDER", "NEG", "POT", "MULT", 
		"ADD", "REL", "EQUAL", "DIF", "AND", "OR", "PYC", "COMMA", "SUF", "TYPE", 
		"INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'dim'", "'as'", "'shared'", "'print'", "'input'", "'if'", 
		"'then'", "'elseif'", "'else'", "'end'", null, null, "'('", "')'", "'not'", 
		"'^'", null, null, null, "'='", "'<>'", null, null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"COMMENT", "WS", "PIZQ", "PDER", "NEG", "POT", "MULT", "ADD", "REL", "EQUAL", 
		"DIF", "AND", "OR", "PYC", "COMMA", "SUF", "TYPE", "INTEGER", "LONG", 
		"SINGLE", "DOUBLE", "STRING", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0126\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u0082\n\r\f\r\16\r\u0085"+
		"\13\r\3\r\3\r\3\16\6\16\u008a\n\16\r\16\16\16\u008b\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u009e"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00a8\n\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00b8"+
		"\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00dd\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00ee"+
		"\n\36\3\37\6\37\u00f1\n\37\r\37\16\37\u00f2\3 \6 \u00f6\n \r \16 \u00f7"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u010a\n \3!\6!\u010d"+
		"\n!\r!\16!\u010e\3!\3!\6!\u0113\n!\r!\16!\u0114\3\"\3\"\7\"\u0119\n\""+
		"\f\"\16\"\u011c\13\"\3\"\3\"\3#\3#\7#\u0122\n#\f#\16#\u0125\13#\2\2$\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$\3\2\17\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2,,\61\61\4\2--/"+
		"/\4\2##%(\3\2\62;\3\2\62\65\3\2\62\64\3\2\629\3\2\628\3\2\60\60\4\2C\\"+
		"c|\6\2\62;C\\aac|\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\3G\3\2\2\2\5M\3\2\2\2\7Q\3\2\2\2\tT\3\2\2\2\13[\3\2\2\2"+
		"\ra\3\2\2\2\17g\3\2\2\2\21j\3\2\2\2\23o\3\2\2\2\25v\3\2\2\2\27{\3\2\2"+
		"\2\31\177\3\2\2\2\33\u0089\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!"+
		"\u0093\3\2\2\2#\u0097\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a7\3"+
		"\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ae\3\2\2\2\61\u00b7\3\2\2\2\63"+
		"\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00dc\3\2\2\2;\u00ed"+
		"\3\2\2\2=\u00f0\3\2\2\2?\u00f5\3\2\2\2A\u010c\3\2\2\2C\u0116\3\2\2\2E"+
		"\u011f\3\2\2\2GH\7e\2\2HI\7q\2\2IJ\7p\2\2JK\7u\2\2KL\7v\2\2L\4\3\2\2\2"+
		"MN\7f\2\2NO\7k\2\2OP\7o\2\2P\6\3\2\2\2QR\7c\2\2RS\7u\2\2S\b\3\2\2\2TU"+
		"\7u\2\2UV\7j\2\2VW\7c\2\2WX\7t\2\2XY\7g\2\2YZ\7f\2\2Z\n\3\2\2\2[\\\7r"+
		"\2\2\\]\7t\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`\f\3\2\2\2ab\7k\2\2bc\7p\2\2"+
		"cd\7r\2\2de\7w\2\2ef\7v\2\2f\16\3\2\2\2gh\7k\2\2hi\7h\2\2i\20\3\2\2\2"+
		"jk\7v\2\2kl\7j\2\2lm\7g\2\2mn\7p\2\2n\22\3\2\2\2op\7g\2\2pq\7n\2\2qr\7"+
		"u\2\2rs\7g\2\2st\7k\2\2tu\7h\2\2u\24\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2"+
		"\2yz\7g\2\2z\26\3\2\2\2{|\7g\2\2|}\7p\2\2}~\7f\2\2~\30\3\2\2\2\177\u0083"+
		"\7)\2\2\u0080\u0082\n\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\b\r\2\2\u0087\32\3\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\b\16\2\2\u008e\34\3\2\2\2\u008f\u0090\7*\2"+
		"\2\u0090\36\3\2\2\2\u0091\u0092\7+\2\2\u0092 \3\2\2\2\u0093\u0094\7p\2"+
		"\2\u0094\u0095\7q\2\2\u0095\u0096\7v\2\2\u0096\"\3\2\2\2\u0097\u0098\7"+
		"`\2\2\u0098$\3\2\2\2\u0099\u009e\t\4\2\2\u009a\u009b\7o\2\2\u009b\u009c"+
		"\7q\2\2\u009c\u009e\7f\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009e"+
		"&\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0(\3\2\2\2\u00a1\u00a8\7>\2\2\u00a2"+
		"\u00a3\7>\2\2\u00a3\u00a8\7?\2\2\u00a4\u00a8\7@\2\2\u00a5\u00a6\7@\2\2"+
		"\u00a6\u00a8\7?\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a4"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa,"+
		"\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7@\2\2\u00ad.\3\2\2\2\u00ae\u00af"+
		"\7c\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b1\60\3\2\2\2\u00b2\u00b3"+
		"\7q\2\2\u00b3\u00b8\7t\2\2\u00b4\u00b5\7z\2\2\u00b5\u00b6\7q\2\2\u00b6"+
		"\u00b8\7t\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\62\3\2\2\2"+
		"\u00b9\u00ba\7=\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\66\3\2\2"+
		"\2\u00bd\u00be\t\6\2\2\u00be8\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7"+
		"v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00dd"+
		"\7i\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7d\2\2\u00c9\u00ca\7n\2\2\u00ca\u00dd\7g\2\2\u00cb\u00cc\7u\2\2"+
		"\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00dd\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7p\2\2\u00d4\u00dd\7i\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7p\2\2"+
		"\u00d7\u00d8\7v\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7i\2\2\u00da\u00db"+
		"\7g\2\2\u00db\u00dd\7t\2\2\u00dc\u00bf\3\2\2\2\u00dc\u00c5\3\2\2\2\u00dc"+
		"\u00cb\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dd:\3\2\2\2"+
		"\u00de\u00ee\t\7\2\2\u00df\u00e0\t\7\2\2\u00e0\u00ee\t\7\2\2\u00e1\u00e2"+
		"\t\7\2\2\u00e2\u00e3\t\7\2\2\u00e3\u00ee\t\7\2\2\u00e4\u00e5\t\7\2\2\u00e5"+
		"\u00e6\t\7\2\2\u00e6\u00e7\t\7\2\2\u00e7\u00ee\t\7\2\2\u00e8\u00e9\t\b"+
		"\2\2\u00e9\u00ea\t\t\2\2\u00ea\u00eb\t\n\2\2\u00eb\u00ec\t\13\2\2\u00ec"+
		"\u00ee\t\n\2\2\u00ed\u00de\3\2\2\2\u00ed\u00df\3\2\2\2\u00ed\u00e1\3\2"+
		"\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee<\3\2\2\2\u00ef\u00f1"+
		"\t\7\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3>\3\2\2\2\u00f4\u00f6\t\7\2\2\u00f5\u00f4\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u0109\t\f\2\2\u00fa\u010a\t\7\2\2\u00fb\u00fc\t\7\2\2\u00fc"+
		"\u010a\t\7\2\2\u00fd\u00fe\t\7\2\2\u00fe\u00ff\t\7\2\2\u00ff\u010a\t\7"+
		"\2\2\u0100\u0101\t\7\2\2\u0101\u0102\t\7\2\2\u0102\u0103\t\7\2\2\u0103"+
		"\u010a\t\7\2\2\u0104\u0105\t\7\2\2\u0105\u0106\t\7\2\2\u0106\u0107\t\7"+
		"\2\2\u0107\u0108\t\7\2\2\u0108\u010a\t\7\2\2\u0109\u00fa\3\2\2\2\u0109"+
		"\u00fb\3\2\2\2\u0109\u00fd\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0104\3\2"+
		"\2\2\u010a@\3\2\2\2\u010b\u010d\t\7\2\2\u010c\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\t\f\2\2\u0111\u0113\t\7\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115B\3\2\2\2\u0116\u011a"+
		"\7$\2\2\u0117\u0119\n\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u011e\7$\2\2\u011eD\3\2\2\2\u011f\u0123\t\r\2\2\u0120\u0122"+
		"\t\16\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124F\3\2\2\2\u0125\u0123\3\2\2\2\21\2\u0083\u008b"+
		"\u009d\u00a7\u00b7\u00dc\u00ed\u00f2\u00f7\u0109\u010e\u0114\u011a\u0123"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}