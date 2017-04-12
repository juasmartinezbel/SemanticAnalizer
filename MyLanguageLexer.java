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
		NEG=10, POT=11, MULT=12, ADD=13, REL=14, EQUDI=15, AND=16, OR=17, PYC=18, 
		COMMA=19, SUF=20, TYPE=21, INTEGER=22, LONG=23, SINGLE=24, DOUBLE=25, 
		STRING=26, ID=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "COMMENT", "WS", "PIZQ", "PDER", 
		"NEG", "POT", "MULT", "ADD", "REL", "EQUDI", "AND", "OR", "PYC", "COMMA", 
		"SUF", "TYPE", "INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'dim'", "'as'", "'shared'", "'='", null, null, "'('", 
		"')'", "'not'", "'^'", null, null, null, null, null, null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "COMMENT", "WS", "PIZQ", "PDER", "NEG", 
		"POT", "MULT", "ADD", "REL", "EQUDI", "AND", "OR", "PYC", "COMMA", "SUF", 
		"TYPE", "INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00f6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7R\n"+
		"\7\f\7\16\7U\13\7\3\7\3\7\3\b\6\bZ\n\b\r\b\16\b[\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\rn\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17x\n\17\3\20\3\20\3\20\5\20}\n\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0088\n\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00ad\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00be\n\27\3\30\6\30\u00c1"+
		"\n\30\r\30\16\30\u00c2\3\31\6\31\u00c6\n\31\r\31\16\31\u00c7\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00da\n\31\3\32\6\32\u00dd\n\32\r\32\16\32\u00de\3\32\3\32\6\32"+
		"\u00e3\n\32\r\32\16\32\u00e4\3\33\3\33\7\33\u00e9\n\33\f\33\16\33\u00ec"+
		"\13\33\3\33\3\33\3\34\3\34\7\34\u00f2\n\34\f\34\16\34\u00f5\13\34\2\2"+
		"\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2"+
		"\17\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2,,\61\61\4\2--//\4\2##%(\3\2\62"+
		";\3\2\62\65\3\2\62\64\3\2\629\3\2\628\3\2\60\60\4\2C\\c|\6\2\62;C\\aa"+
		"c|\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2"+
		"\2\2\5?\3\2\2\2\7C\3\2\2\2\tF\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Y\3\2\2"+
		"\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27g\3\2\2\2\31m\3\2\2\2\33o\3\2"+
		"\2\2\35w\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'"+
		"\u008b\3\2\2\2)\u008d\3\2\2\2+\u00ac\3\2\2\2-\u00bd\3\2\2\2/\u00c0\3\2"+
		"\2\2\61\u00c5\3\2\2\2\63\u00dc\3\2\2\2\65\u00e6\3\2\2\2\67\u00ef\3\2\2"+
		"\29:\7e\2\2:;\7q\2\2;<\7p\2\2<=\7u\2\2=>\7v\2\2>\4\3\2\2\2?@\7f\2\2@A"+
		"\7k\2\2AB\7o\2\2B\6\3\2\2\2CD\7c\2\2DE\7u\2\2E\b\3\2\2\2FG\7u\2\2GH\7"+
		"j\2\2HI\7c\2\2IJ\7t\2\2JK\7g\2\2KL\7f\2\2L\n\3\2\2\2MN\7?\2\2N\f\3\2\2"+
		"\2OS\7)\2\2PR\n\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2"+
		"\2US\3\2\2\2VW\b\7\2\2W\16\3\2\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\b\2\2^\20\3\2\2\2_`\7*\2\2`\22\3\2\2\2"+
		"ab\7+\2\2b\24\3\2\2\2cd\7p\2\2de\7q\2\2ef\7v\2\2f\26\3\2\2\2gh\7`\2\2"+
		"h\30\3\2\2\2in\t\4\2\2jk\7o\2\2kl\7q\2\2ln\7f\2\2mi\3\2\2\2mj\3\2\2\2"+
		"n\32\3\2\2\2op\t\5\2\2p\34\3\2\2\2qx\7>\2\2rs\7>\2\2sx\7?\2\2tx\7@\2\2"+
		"uv\7@\2\2vx\7?\2\2wq\3\2\2\2wr\3\2\2\2wt\3\2\2\2wu\3\2\2\2x\36\3\2\2\2"+
		"y}\7?\2\2z{\7>\2\2{}\7@\2\2|y\3\2\2\2|z\3\2\2\2} \3\2\2\2~\177\7c\2\2"+
		"\177\u0080\7p\2\2\u0080\u0081\7f\2\2\u0081\"\3\2\2\2\u0082\u0083\7q\2"+
		"\2\u0083\u0088\7t\2\2\u0084\u0085\7z\2\2\u0085\u0086\7q\2\2\u0086\u0088"+
		"\7t\2\2\u0087\u0082\3\2\2\2\u0087\u0084\3\2\2\2\u0088$\3\2\2\2\u0089\u008a"+
		"\7=\2\2\u008a&\3\2\2\2\u008b\u008c\7.\2\2\u008c(\3\2\2\2\u008d\u008e\t"+
		"\6\2\2\u008e*\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2\u0091\u0092"+
		"\7t\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u00ad\7i\2\2\u0095"+
		"\u0096\7f\2\2\u0096\u0097\7q\2\2\u0097\u0098\7w\2\2\u0098\u0099\7d\2\2"+
		"\u0099\u009a\7n\2\2\u009a\u00ad\7g\2\2\u009b\u009c\7u\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7i\2\2\u009f\u00a0\7n\2\2\u00a0"+
		"\u00ad\7g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7p\2\2"+
		"\u00a4\u00ad\7i\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ad\7t\2\2\u00ac\u008f\3\2\2\2\u00ac\u0095\3\2\2\2\u00ac\u009b\3\2"+
		"\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ad,\3\2\2\2\u00ae\u00be"+
		"\t\7\2\2\u00af\u00b0\t\7\2\2\u00b0\u00be\t\7\2\2\u00b1\u00b2\t\7\2\2\u00b2"+
		"\u00b3\t\7\2\2\u00b3\u00be\t\7\2\2\u00b4\u00b5\t\7\2\2\u00b5\u00b6\t\7"+
		"\2\2\u00b6\u00b7\t\7\2\2\u00b7\u00be\t\7\2\2\u00b8\u00b9\t\b\2\2\u00b9"+
		"\u00ba\t\t\2\2\u00ba\u00bb\t\n\2\2\u00bb\u00bc\t\13\2\2\u00bc\u00be\t"+
		"\n\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd"+
		"\u00b4\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be.\3\2\2\2\u00bf\u00c1\t\7\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\60\3\2\2\2\u00c4\u00c6\t\7\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00d9\t\f\2\2\u00ca\u00da\t\7\2\2\u00cb\u00cc\t\7\2\2\u00cc"+
		"\u00da\t\7\2\2\u00cd\u00ce\t\7\2\2\u00ce\u00cf\t\7\2\2\u00cf\u00da\t\7"+
		"\2\2\u00d0\u00d1\t\7\2\2\u00d1\u00d2\t\7\2\2\u00d2\u00d3\t\7\2\2\u00d3"+
		"\u00da\t\7\2\2\u00d4\u00d5\t\7\2\2\u00d5\u00d6\t\7\2\2\u00d6\u00d7\t\7"+
		"\2\2\u00d7\u00d8\t\7\2\2\u00d8\u00da\t\7\2\2\u00d9\u00ca\3\2\2\2\u00d9"+
		"\u00cb\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d4\3\2"+
		"\2\2\u00da\62\3\2\2\2\u00db\u00dd\t\7\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\t\f\2\2\u00e1\u00e3\t\7\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\64\3\2\2\2\u00e6\u00ea"+
		"\7$\2\2\u00e7\u00e9\n\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00ee\7$\2\2\u00ee\66\3\2\2\2\u00ef\u00f3\t\r\2\2\u00f0\u00f2"+
		"\t\16\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f48\3\2\2\2\u00f5\u00f3\3\2\2\2\22\2S[mw|\u0087"+
		"\u00ac\u00bd\u00c2\u00c7\u00d9\u00de\u00e4\u00ea\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}