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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMMENT=7, WS=8, PIZQ=9, 
		PDER=10, NEG=11, POT=12, MULT=13, ADD=14, REL=15, EQUAL=16, DIF=17, AND=18, 
		OR=19, PYC=20, COMMA=21, SUF=22, TYPE=23, INTEGER=24, LONG=25, SINGLE=26, 
		DOUBLE=27, STRING=28, ID=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "COMMENT", "WS", "PIZQ", 
		"PDER", "NEG", "POT", "MULT", "ADD", "REL", "EQUAL", "DIF", "AND", "OR", 
		"PYC", "COMMA", "SUF", "TYPE", "INTEGER", "LONG", "SINGLE", "DOUBLE", 
		"STRING", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'dim'", "'as'", "'shared'", "'print'", "'input'", null, 
		null, "'('", "')'", "'not'", "'^'", null, null, null, "'='", "'<>'", null, 
		null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "COMMENT", "WS", "PIZQ", "PDER", 
		"NEG", "POT", "MULT", "ADD", "REL", "EQUAL", "DIF", "AND", "OR", "PYC", 
		"COMMA", "SUF", "TYPE", "INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", 
		"ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u0104\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b`\n\b\f\b\16\b"+
		"c\13\b\3\b\3\b\3\t\6\th\n\t\r\t\16\ti\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16|\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0086\n\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0096\n\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00bb\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00cc\n\31\3\32\6\32\u00cf\n"+
		"\32\r\32\16\32\u00d0\3\33\6\33\u00d4\n\33\r\33\16\33\u00d5\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u00e8\n\33\3\34\6\34\u00eb\n\34\r\34\16\34\u00ec\3\34\3\34\6\34\u00f1"+
		"\n\34\r\34\16\34\u00f2\3\35\3\35\7\35\u00f7\n\35\f\35\16\35\u00fa\13\35"+
		"\3\35\3\35\3\36\3\36\7\36\u0100\n\36\f\36\16\36\u0103\13\36\2\2\37\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2"+
		"\17\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2,,\61\61\4\2--//\4\2##%(\3\2\62"+
		";\3\2\62\65\3\2\62\64\3\2\629\3\2\628\3\2\60\60\4\2C\\c|\6\2\62;C\\aa"+
		"c|\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\3=\3\2\2\2\5C\3\2\2\2\7G\3\2\2\2\tJ\3\2\2\2\13Q\3\2\2"+
		"\2\rW\3\2\2\2\17]\3\2\2\2\21g\3\2\2\2\23m\3\2\2\2\25o\3\2\2\2\27q\3\2"+
		"\2\2\31u\3\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37\u0085\3\2\2\2!\u0087\3\2\2"+
		"\2#\u0089\3\2\2\2%\u008c\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+\u0099"+
		"\3\2\2\2-\u009b\3\2\2\2/\u00ba\3\2\2\2\61\u00cb\3\2\2\2\63\u00ce\3\2\2"+
		"\2\65\u00d3\3\2\2\2\67\u00ea\3\2\2\29\u00f4\3\2\2\2;\u00fd\3\2\2\2=>\7"+
		"e\2\2>?\7q\2\2?@\7p\2\2@A\7u\2\2AB\7v\2\2B\4\3\2\2\2CD\7f\2\2DE\7k\2\2"+
		"EF\7o\2\2F\6\3\2\2\2GH\7c\2\2HI\7u\2\2I\b\3\2\2\2JK\7u\2\2KL\7j\2\2LM"+
		"\7c\2\2MN\7t\2\2NO\7g\2\2OP\7f\2\2P\n\3\2\2\2QR\7r\2\2RS\7t\2\2ST\7k\2"+
		"\2TU\7p\2\2UV\7v\2\2V\f\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7r\2\2Z[\7w\2\2[\\"+
		"\7v\2\2\\\16\3\2\2\2]a\7)\2\2^`\n\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\b\b\2\2e\20\3\2\2\2fh\t\3\2\2gf\3\2\2"+
		"\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\t\2\2l\22\3\2\2\2mn\7*"+
		"\2\2n\24\3\2\2\2op\7+\2\2p\26\3\2\2\2qr\7p\2\2rs\7q\2\2st\7v\2\2t\30\3"+
		"\2\2\2uv\7`\2\2v\32\3\2\2\2w|\t\4\2\2xy\7o\2\2yz\7q\2\2z|\7f\2\2{w\3\2"+
		"\2\2{x\3\2\2\2|\34\3\2\2\2}~\t\5\2\2~\36\3\2\2\2\177\u0086\7>\2\2\u0080"+
		"\u0081\7>\2\2\u0081\u0086\7?\2\2\u0082\u0086\7@\2\2\u0083\u0084\7@\2\2"+
		"\u0084\u0086\7?\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0082"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086 \3\2\2\2\u0087\u0088\7?\2\2\u0088\""+
		"\3\2\2\2\u0089\u008a\7>\2\2\u008a\u008b\7@\2\2\u008b$\3\2\2\2\u008c\u008d"+
		"\7c\2\2\u008d\u008e\7p\2\2\u008e\u008f\7f\2\2\u008f&\3\2\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0096\7t\2\2\u0092\u0093\7z\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0096\7t\2\2\u0095\u0090\3\2\2\2\u0095\u0092\3\2\2\2\u0096(\3\2\2\2\u0097"+
		"\u0098\7=\2\2\u0098*\3\2\2\2\u0099\u009a\7.\2\2\u009a,\3\2\2\2\u009b\u009c"+
		"\t\6\2\2\u009c.\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2\u009f\u00a0"+
		"\7t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00bb\7i\2\2\u00a3"+
		"\u00a4\7f\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7d\2\2"+
		"\u00a7\u00a8\7n\2\2\u00a8\u00bb\7g\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab"+
		"\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		"\u00bb\7g\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2"+
		"\u00b2\u00bb\7i\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7i\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\u00bb\7t\2\2\u00ba\u009d\3\2\2\2\u00ba\u00a3\3\2\2\2\u00ba\u00a9\3\2"+
		"\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b3\3\2\2\2\u00bb\60\3\2\2\2\u00bc\u00cc"+
		"\t\7\2\2\u00bd\u00be\t\7\2\2\u00be\u00cc\t\7\2\2\u00bf\u00c0\t\7\2\2\u00c0"+
		"\u00c1\t\7\2\2\u00c1\u00cc\t\7\2\2\u00c2\u00c3\t\7\2\2\u00c3\u00c4\t\7"+
		"\2\2\u00c4\u00c5\t\7\2\2\u00c5\u00cc\t\7\2\2\u00c6\u00c7\t\b\2\2\u00c7"+
		"\u00c8\t\t\2\2\u00c8\u00c9\t\n\2\2\u00c9\u00ca\t\13\2\2\u00ca\u00cc\t"+
		"\n\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb"+
		"\u00c2\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc\62\3\2\2\2\u00cd\u00cf\t\7\2"+
		"\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\64\3\2\2\2\u00d2\u00d4\t\7\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00e7\t\f\2\2\u00d8\u00e8\t\7\2\2\u00d9\u00da\t\7\2\2\u00da"+
		"\u00e8\t\7\2\2\u00db\u00dc\t\7\2\2\u00dc\u00dd\t\7\2\2\u00dd\u00e8\t\7"+
		"\2\2\u00de\u00df\t\7\2\2\u00df\u00e0\t\7\2\2\u00e0\u00e1\t\7\2\2\u00e1"+
		"\u00e8\t\7\2\2\u00e2\u00e3\t\7\2\2\u00e3\u00e4\t\7\2\2\u00e4\u00e5\t\7"+
		"\2\2\u00e5\u00e6\t\7\2\2\u00e6\u00e8\t\7\2\2\u00e7\u00d8\3\2\2\2\u00e7"+
		"\u00d9\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e2\3\2"+
		"\2\2\u00e8\66\3\2\2\2\u00e9\u00eb\t\7\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\t\f\2\2\u00ef\u00f1\t\7\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f38\3\2\2\2\u00f4\u00f8"+
		"\7$\2\2\u00f5\u00f7\n\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7$\2\2\u00fc:\3\2\2\2\u00fd\u0101\t\r\2\2\u00fe\u0100"+
		"\t\16\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102<\3\2\2\2\u0103\u0101\3\2\2\2\21\2ai{\u0085"+
		"\u0095\u00ba\u00cb\u00d0\u00d5\u00e7\u00ec\u00f2\u00f8\u0101\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}