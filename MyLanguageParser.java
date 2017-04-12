// Generated from MyLanguage.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		COMMENT=18, WS=19, PIZQ=20, PDER=21, NEG=22, POT=23, MULT=24, ADD=25, 
		REL=26, EQUAL=27, DIF=28, AND=29, OR=30, PYC=31, COMMA=32, SUFN=33, SUF=34, 
		TYPE=35, INTEGER=36, LONG=37, SINGLE=38, DOUBLE=39, STRING=40, ID=41;
	public static final int
		RULE_qb64 = 0, RULE_instr = 1, RULE_decl = 2, RULE_dim = 3, RULE_shared = 4, 
		RULE_sufdecl = 5, RULE_idn = 6, RULE_suf = 7, RULE_par = 8, RULE_pos = 9, 
		RULE_print = 10, RULE_toprintfst = 11, RULE_toprint = 12, RULE_input = 13, 
		RULE_inpara = 14, RULE_inpn = 15, RULE_ifc = 16, RULE_ifter = 17, RULE_forc = 18, 
		RULE_forexpr = 19, RULE_forsuf = 20, RULE_tothis = 21, RULE_tofor = 22, 
		RULE_step = 23, RULE_selectc = 24, RULE_cases = 25, RULE_caselse = 26, 
		RULE_expr = 27, RULE_equdi = 28, RULE_valuev = 29, RULE_value = 30;
	public static final String[] ruleNames = {
		"qb64", "instr", "decl", "dim", "shared", "sufdecl", "idn", "suf", "par", 
		"pos", "print", "toprintfst", "toprint", "input", "inpara", "inpn", "ifc", 
		"ifter", "forc", "forexpr", "forsuf", "tothis", "tofor", "step", "selectc", 
		"cases", "caselse", "expr", "equdi", "valuev", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'dim'", "'as'", "'shared'", "'print'", "'input'", "'if'", 
		"'then'", "'elseif'", "'else'", "'end'", "'for'", "'next'", "'to'", "'step'", 
		"'select'", "'case'", null, null, "'('", "')'", "'not'", "'^'", null, 
		null, null, "'='", "'<>'", null, null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMMENT", "WS", "PIZQ", "PDER", "NEG", 
		"POT", "MULT", "ADD", "REL", "EQUAL", "DIF", "AND", "OR", "PYC", "COMMA", 
		"SUFN", "SUF", "TYPE", "INTEGER", "LONG", "SINGLE", "DOUBLE", "STRING", 
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

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Qb64Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyLanguageParser.EOF, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Qb64Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qb64; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterQb64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitQb64(this);
		}
	}

	public final Qb64Context qb64() throws RecognitionException {
		Qb64Context _localctx = new Qb64Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_qb64);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(62);
				instr();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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

	public static class InstrContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public IfcContext ifc() {
			return getRuleContext(IfcContext.class,0);
		}
		public ForcContext forc() {
			return getRuleContext(ForcContext.class,0);
		}
		public SelectcContext selectc() {
			return getRuleContext(SelectcContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instr);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				decl();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				print();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				input();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				ifc();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				forc();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				selectc();
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

	public static class DeclContext extends ParserRuleContext {
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public SufdeclContext sufdecl() {
			return getRuleContext(SufdeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				dim();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__0);
				setState(80);
				sufdecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				sufdecl();
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

	public static class DimContext extends ParserRuleContext {
		public SharedContext shared() {
			return getRuleContext(SharedContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(MyLanguageParser.TYPE, 0); }
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDim(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__1);
			setState(85);
			shared();
			setState(86);
			match(ID);
			setState(87);
			par();
			setState(88);
			match(T__2);
			setState(89);
			match(TYPE);
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

	public static class SharedContext extends ParserRuleContext {
		public SharedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterShared(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitShared(this);
		}
	}

	public final SharedContext shared() throws RecognitionException {
		SharedContext _localctx = new SharedContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shared);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__3);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SufdeclContext extends ParserRuleContext {
		public IdnContext idn() {
			return getRuleContext(IdnContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyLanguageParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SufdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sufdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSufdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSufdecl(this);
		}
	}

	public final SufdeclContext sufdecl() throws RecognitionException {
		SufdeclContext _localctx = new SufdeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sufdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			idn();
			setState(96);
			match(EQUAL);
			setState(97);
			expr(0);
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

	public static class IdnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public SufContext suf() {
			return getRuleContext(SufContext.class,0);
		}
		public IdnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIdn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIdn(this);
		}
	}

	public final IdnContext idn() throws RecognitionException {
		IdnContext _localctx = new IdnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			suf();
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

	public static class SufContext extends ParserRuleContext {
		public TerminalNode SUF() { return getToken(MyLanguageParser.SUF, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public SufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSuf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSuf(this);
		}
	}

	public final SufContext suf() throws RecognitionException {
		SufContext _localctx = new SufContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_suf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(102);
				match(SUF);
				}
				break;
			case 2:
				{
				}
				break;
			}
			{
			setState(106);
			par();
			}
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

	public static class ParContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyLanguageParser.PIZQ, 0); }
		public List<PosContext> pos() {
			return getRuleContexts(PosContext.class);
		}
		public PosContext pos(int i) {
			return getRuleContext(PosContext.class,i);
		}
		public TerminalNode PDER() { return getToken(MyLanguageParser.PDER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParser.COMMA, i);
		}
		public ParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPar(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_par);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(108);
				match(PIZQ);
				setState(109);
				pos();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(110);
					match(COMMA);
					setState(111);
					pos();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(PDER);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PosContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPos(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			expr(0);
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

	public static class PrintContext extends ParserRuleContext {
		public ToprintfstContext toprintfst() {
			return getRuleContext(ToprintfstContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__4);
			setState(125);
			toprintfst();
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

	public static class ToprintfstContext extends ParserRuleContext {
		public List<ToprintContext> toprint() {
			return getRuleContexts(ToprintContext.class);
		}
		public ToprintContext toprint(int i) {
			return getRuleContext(ToprintContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToprintfstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toprintfst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterToprintfst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitToprintfst(this);
		}
	}

	public final ToprintfstContext toprintfst() throws RecognitionException {
		ToprintfstContext _localctx = new ToprintfstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_toprintfst);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PYC) {
					{
					{
					setState(127);
					toprint();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				expr(0);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PYC) {
					{
					{
					setState(134);
					toprint();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ToprintContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(MyLanguageParser.PYC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToprintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toprint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterToprint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitToprint(this);
		}
	}

	public final ToprintContext toprint() throws RecognitionException {
		ToprintContext _localctx = new ToprintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_toprint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(PYC);
			setState(143);
			expr(0);
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

	public static class InputContext extends ParserRuleContext {
		public InparaContext inpara() {
			return getRuleContext(InparaContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__5);
			setState(146);
			inpara();
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

	public static class InparaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public IdnContext idn() {
			return getRuleContext(IdnContext.class,0);
		}
		public List<InpnContext> inpn() {
			return getRuleContexts(InpnContext.class);
		}
		public InpnContext inpn(int i) {
			return getRuleContext(InpnContext.class,i);
		}
		public InparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterInpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitInpara(this);
		}
	}

	public final InparaContext inpara() throws RecognitionException {
		InparaContext _localctx = new InparaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(148);
				match(STRING);
				setState(149);
				match(COMMA);
				setState(150);
				idn();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					inpn();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				{
				setState(157);
				idn();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					inpn();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class InpnContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public IdnContext idn() {
			return getRuleContext(IdnContext.class,0);
		}
		public InpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inpn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterInpn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitInpn(this);
		}
	}

	public final InpnContext inpn() throws RecognitionException {
		InpnContext _localctx = new InpnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inpn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(COMMA);
			setState(167);
			idn();
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

	public static class IfcContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfterContext ifter() {
			return getRuleContext(IfterContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public IfcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIfc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIfc(this);
		}
	}

	public final IfcContext ifc() throws RecognitionException {
		IfcContext _localctx = new IfcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__6);
			setState(170);
			expr(0);
			setState(171);
			match(T__7);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(172);
				instr();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			ifter();
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

	public static class IfterContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfterContext ifter() {
			return getRuleContext(IfterContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public IfterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIfter(this);
		}
	}

	public final IfterContext ifter() throws RecognitionException {
		IfterContext _localctx = new IfterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifter);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__8);
				setState(181);
				expr(0);
				setState(182);
				match(T__7);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << ID))) != 0)) {
					{
					{
					setState(183);
					instr();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				ifter();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__9);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << ID))) != 0)) {
					{
					{
					setState(192);
					instr();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(T__10);
				setState(199);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__10);
				setState(201);
				match(T__6);
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

	public static class ForcContext extends ParserRuleContext {
		public ForexprContext forexpr() {
			return getRuleContext(ForexprContext.class,0);
		}
		public ToforContext tofor() {
			return getRuleContext(ToforContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public ForcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterForc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitForc(this);
		}
	}

	public final ForcContext forc() throws RecognitionException {
		ForcContext _localctx = new ForcContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__11);
			setState(205);
			forexpr();
			setState(206);
			tofor();
			setState(207);
			step();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(208);
				instr();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(T__12);
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

	public static class ForexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ForsufContext forsuf() {
			return getRuleContext(ForsufContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyLanguageParser.EQUAL, 0); }
		public TothisContext tothis() {
			return getRuleContext(TothisContext.class,0);
		}
		public ForexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterForexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitForexpr(this);
		}
	}

	public final ForexprContext forexpr() throws RecognitionException {
		ForexprContext _localctx = new ForexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ID);
			setState(217);
			forsuf();
			setState(218);
			match(EQUAL);
			setState(219);
			tothis();
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

	public static class ForsufContext extends ParserRuleContext {
		public TerminalNode SUFN() { return getToken(MyLanguageParser.SUFN, 0); }
		public ForsufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forsuf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterForsuf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitForsuf(this);
		}
	}

	public final ForsufContext forsuf() throws RecognitionException {
		ForsufContext _localctx = new ForsufContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forsuf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUFN:
				{
				setState(221);
				match(SUFN);
				}
				break;
			case EQUAL:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class TothisContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public SufContext suf() {
			return getRuleContext(SufContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TothisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tothis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterTothis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitTothis(this);
		}
	}

	public final TothisContext tothis() throws RecognitionException {
		TothisContext _localctx = new TothisContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tothis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(225);
				match(ID);
				setState(226);
				suf();
				}
				break;
			case 2:
				{
				setState(227);
				value();
				}
				break;
			}
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

	public static class ToforContext extends ParserRuleContext {
		public TothisContext tothis() {
			return getRuleContext(TothisContext.class,0);
		}
		public ToforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tofor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterTofor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitTofor(this);
		}
	}

	public final ToforContext tofor() throws RecognitionException {
		ToforContext _localctx = new ToforContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__13);
			setState(231);
			tothis();
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

	public static class StepContext extends ParserRuleContext {
		public TothisContext tothis() {
			return getRuleContext(TothisContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(233);
				match(T__14);
				setState(234);
				tothis();
				}
				break;
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__11:
			case T__12:
			case T__15:
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class SelectcContext extends ParserRuleContext {
		public IdnContext idn() {
			return getRuleContext(IdnContext.class,0);
		}
		public CaselseContext caselse() {
			return getRuleContext(CaselseContext.class,0);
		}
		public List<CasesContext> cases() {
			return getRuleContexts(CasesContext.class);
		}
		public CasesContext cases(int i) {
			return getRuleContext(CasesContext.class,i);
		}
		public SelectcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSelectc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSelectc(this);
		}
	}

	public final SelectcContext selectc() throws RecognitionException {
		SelectcContext _localctx = new SelectcContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selectc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__15);
			setState(239);
			match(T__16);
			setState(240);
			idn();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					cases();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(247);
			caselse();
			setState(248);
			match(T__10);
			setState(249);
			match(T__15);
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

	public static class CasesContext extends ParserRuleContext {
		public ValuevContext valuev() {
			return getRuleContext(ValuevContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__16);
			setState(252);
			valuev();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(253);
				instr();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class CaselseContext extends ParserRuleContext {
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public CaselseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caselse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCaselse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCaselse(this);
		}
	}

	public final CaselseContext caselse() throws RecognitionException {
		CaselseContext _localctx = new CaselseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caselse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(259);
				match(T__16);
				setState(260);
				match(T__9);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << ID))) != 0)) {
					{
					{
					setState(261);
					instr();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyLanguageParser.PIZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PDER() { return getToken(MyLanguageParser.PDER, 0); }
		public TerminalNode NEG() { return getToken(MyLanguageParser.NEG, 0); }
		public TerminalNode POT() { return getToken(MyLanguageParser.POT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode MULT() { return getToken(MyLanguageParser.MULT, 0); }
		public TerminalNode ADD() { return getToken(MyLanguageParser.ADD, 0); }
		public TerminalNode REL() { return getToken(MyLanguageParser.REL, 0); }
		public EqudiContext equdi() {
			return getRuleContext(EqudiContext.class,0);
		}
		public TerminalNode AND() { return getToken(MyLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(MyLanguageParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(271);
				match(PIZQ);
				setState(272);
				expr(0);
				setState(273);
				match(PDER);
				}
				break;
			case NEG:
				{
				setState(275);
				match(NEG);
				setState(276);
				expr(9);
				}
				break;
			case POT:
				{
				setState(277);
				match(POT);
				setState(278);
				expr(8);
				}
				break;
			case INTEGER:
			case LONG:
			case SINGLE:
			case DOUBLE:
			case STRING:
			case ID:
				{
				setState(279);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(283);
						match(MULT);
						setState(284);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(286);
						match(ADD);
						setState(287);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(289);
						match(REL);
						setState(290);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(292);
						equdi();
						setState(293);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(296);
						match(AND);
						setState(297);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(299);
						match(OR);
						setState(300);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqudiContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(MyLanguageParser.EQUAL, 0); }
		public TerminalNode DIF() { return getToken(MyLanguageParser.DIF, 0); }
		public EqudiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equdi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterEqudi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitEqudi(this);
		}
	}

	public final EqudiContext equdi() throws RecognitionException {
		EqudiContext _localctx = new EqudiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_equdi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==DIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ValuevContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(MyLanguageParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(MyLanguageParser.INTEGER, i);
		}
		public TerminalNode LONG() { return getToken(MyLanguageParser.LONG, 0); }
		public TerminalNode DOUBLE() { return getToken(MyLanguageParser.DOUBLE, 0); }
		public TerminalNode SINGLE() { return getToken(MyLanguageParser.SINGLE, 0); }
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public ValuevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterValuev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitValuev(this);
		}
	}

	public final ValuevContext valuev() throws RecognitionException {
		ValuevContext _localctx = new ValuevContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valuev);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LONG) | (1L << SINGLE) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ValueContext extends ParserRuleContext {
		public ValuevContext valuev() {
			return getRuleContext(ValuevContext.class,0);
		}
		public IdnContext idn() {
			return getRuleContext(IdnContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case LONG:
			case SINGLE:
			case DOUBLE:
			case STRING:
				{
				setState(310);
				valuev();
				}
				break;
			case ID:
				{
				setState(311);
				idn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4"+
		"\3\4\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6`\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\tk\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n"+
		"s\n\n\f\n\16\nv\13\n\3\n\3\n\3\n\5\n{\n\n\3\13\3\13\3\f\3\f\3\f\3\r\7"+
		"\r\u0083\n\r\f\r\16\r\u0086\13\r\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d"+
		"\13\r\5\r\u008f\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\7\20\u009b\n\20\f\20\16\20\u009e\13\20\3\20\3\20\7\20\u00a2\n\20\f\20"+
		"\16\20\u00a5\13\20\5\20\u00a7\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u00b0\n\22\f\22\16\22\u00b3\13\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23\u00bb\n\23\f\23\16\23\u00be\13\23\3\23\3\23\3\23\3\23\7\23\u00c4"+
		"\n\23\f\23\16\23\u00c7\13\23\3\23\3\23\3\23\3\23\5\23\u00cd\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u00d4\n\24\f\24\16\24\u00d7\13\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00e2\n\26\3\27\3\27\3\27\5\27"+
		"\u00e7\n\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u00ef\n\31\3\32\3\32\3"+
		"\32\3\32\7\32\u00f5\n\32\f\32\16\32\u00f8\13\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\7\33\u0101\n\33\f\33\16\33\u0104\13\33\3\34\3\34\3\34\7"+
		"\34\u0109\n\34\f\34\16\34\u010c\13\34\3\34\5\34\u010f\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u011b\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u0130\n\35\f\35\16\35\u0133\13\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \5 \u013b\n \3 \2\38!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>\2\4\3\2\35\36\3\2&*\u0146\2C\3\2\2\2\4N\3\2\2\2"+
		"\6T\3\2\2\2\bV\3\2\2\2\n_\3\2\2\2\fa\3\2\2\2\16e\3\2\2\2\20j\3\2\2\2\22"+
		"z\3\2\2\2\24|\3\2\2\2\26~\3\2\2\2\30\u008e\3\2\2\2\32\u0090\3\2\2\2\34"+
		"\u0093\3\2\2\2\36\u00a6\3\2\2\2 \u00a8\3\2\2\2\"\u00ab\3\2\2\2$\u00cc"+
		"\3\2\2\2&\u00ce\3\2\2\2(\u00da\3\2\2\2*\u00e1\3\2\2\2,\u00e6\3\2\2\2."+
		"\u00e8\3\2\2\2\60\u00ee\3\2\2\2\62\u00f0\3\2\2\2\64\u00fd\3\2\2\2\66\u010e"+
		"\3\2\2\28\u011a\3\2\2\2:\u0134\3\2\2\2<\u0136\3\2\2\2>\u013a\3\2\2\2@"+
		"B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2"+
		"FG\7\2\2\3G\3\3\2\2\2HO\5\6\4\2IO\5\26\f\2JO\5\34\17\2KO\5\"\22\2LO\5"+
		"&\24\2MO\5\62\32\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2N"+
		"M\3\2\2\2O\5\3\2\2\2PU\5\b\5\2QR\7\3\2\2RU\5\f\7\2SU\5\f\7\2TP\3\2\2\2"+
		"TQ\3\2\2\2TS\3\2\2\2U\7\3\2\2\2VW\7\4\2\2WX\5\n\6\2XY\7+\2\2YZ\5\22\n"+
		"\2Z[\7\5\2\2[\\\7%\2\2\\\t\3\2\2\2]`\7\6\2\2^`\3\2\2\2_]\3\2\2\2_^\3\2"+
		"\2\2`\13\3\2\2\2ab\5\16\b\2bc\7\35\2\2cd\58\35\2d\r\3\2\2\2ef\7+\2\2f"+
		"g\5\20\t\2g\17\3\2\2\2hk\7$\2\2ik\3\2\2\2jh\3\2\2\2ji\3\2\2\2kl\3\2\2"+
		"\2lm\5\22\n\2m\21\3\2\2\2no\7\26\2\2ot\5\24\13\2pq\7\"\2\2qs\5\24\13\2"+
		"rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\27\2"+
		"\2x{\3\2\2\2y{\3\2\2\2zn\3\2\2\2zy\3\2\2\2{\23\3\2\2\2|}\58\35\2}\25\3"+
		"\2\2\2~\177\7\7\2\2\177\u0080\5\30\r\2\u0080\27\3\2\2\2\u0081\u0083\5"+
		"\32\16\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u008f\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b\58"+
		"\35\2\u0088\u008a\5\32\16\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0084\3\2\2\2\u008e\u0087\3\2\2\2\u008f\31\3\2\2\2\u0090\u0091"+
		"\7!\2\2\u0091\u0092\58\35\2\u0092\33\3\2\2\2\u0093\u0094\7\b\2\2\u0094"+
		"\u0095\5\36\20\2\u0095\35\3\2\2\2\u0096\u0097\7*\2\2\u0097\u0098\7\"\2"+
		"\2\u0098\u009c\5\16\b\2\u0099\u009b\5 \21\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a7\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a3\5\16\b\2\u00a0\u00a2\5 \21\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u0096\3\2\2\2\u00a6"+
		"\u009f\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\5\16\b"+
		"\2\u00aa!\3\2\2\2\u00ab\u00ac\7\t\2\2\u00ac\u00ad\58\35\2\u00ad\u00b1"+
		"\7\n\2\2\u00ae\u00b0\5\4\3\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\5$\23\2\u00b5#\3\2\2\2\u00b6\u00b7\7\13\2\2\u00b7\u00b8"+
		"\58\35\2\u00b8\u00bc\7\n\2\2\u00b9\u00bb\5\4\3\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\5$\23\2\u00c0\u00cd\3\2\2\2\u00c1"+
		"\u00c5\7\f\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00cd\7\t\2\2\u00ca\u00cb\7\r"+
		"\2\2\u00cb\u00cd\7\t\2\2\u00cc\u00b6\3\2\2\2\u00cc\u00c1\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cf\7\16\2\2\u00cf\u00d0\5(\25\2"+
		"\u00d0\u00d1\5.\30\2\u00d1\u00d5\5\60\31\2\u00d2\u00d4\5\4\3\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\17\2\2\u00d9\'\3\2\2"+
		"\2\u00da\u00db\7+\2\2\u00db\u00dc\5*\26\2\u00dc\u00dd\7\35\2\2\u00dd\u00de"+
		"\5,\27\2\u00de)\3\2\2\2\u00df\u00e2\7#\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2+\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4\u00e7"+
		"\5\20\t\2\u00e5\u00e7\5> \2\u00e6\u00e3\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"-\3\2\2\2\u00e8\u00e9\7\20\2\2\u00e9\u00ea\5,\27\2\u00ea/\3\2\2\2\u00eb"+
		"\u00ec\7\21\2\2\u00ec\u00ef\5,\27\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3"+
		"\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\61\3\2\2\2\u00f0\u00f1\7\22\2\2\u00f1"+
		"\u00f2\7\23\2\2\u00f2\u00f6\5\16\b\2\u00f3\u00f5\5\64\33\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\5\66\34\2\u00fa\u00fb\7"+
		"\r\2\2\u00fb\u00fc\7\22\2\2\u00fc\63\3\2\2\2\u00fd\u00fe\7\23\2\2\u00fe"+
		"\u0102\5<\37\2\u00ff\u0101\5\4\3\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\65\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0106\7\23\2\2\u0106\u010a\7\f\2\2\u0107\u0109\5\4\3\2"+
		"\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010f\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0105\3\2\2\2\u010e\u010d\3\2\2\2\u010f\67\3\2\2\2\u0110\u0111\b\35\1"+
		"\2\u0111\u0112\7\26\2\2\u0112\u0113\58\35\2\u0113\u0114\7\27\2\2\u0114"+
		"\u011b\3\2\2\2\u0115\u0116\7\30\2\2\u0116\u011b\58\35\13\u0117\u0118\7"+
		"\31\2\2\u0118\u011b\58\35\n\u0119\u011b\5> \2\u011a\u0110\3\2\2\2\u011a"+
		"\u0115\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u0131\3\2"+
		"\2\2\u011c\u011d\f\t\2\2\u011d\u011e\7\32\2\2\u011e\u0130\58\35\n\u011f"+
		"\u0120\f\b\2\2\u0120\u0121\7\33\2\2\u0121\u0130\58\35\t\u0122\u0123\f"+
		"\7\2\2\u0123\u0124\7\34\2\2\u0124\u0130\58\35\b\u0125\u0126\f\6\2\2\u0126"+
		"\u0127\5:\36\2\u0127\u0128\58\35\7\u0128\u0130\3\2\2\2\u0129\u012a\f\5"+
		"\2\2\u012a\u012b\7\37\2\2\u012b\u0130\58\35\6\u012c\u012d\f\4\2\2\u012d"+
		"\u012e\7 \2\2\u012e\u0130\58\35\5\u012f\u011c\3\2\2\2\u012f\u011f\3\2"+
		"\2\2\u012f\u0122\3\2\2\2\u012f\u0125\3\2\2\2\u012f\u0129\3\2\2\2\u012f"+
		"\u012c\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u01329\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\t\2\2\2\u0135;\3\2"+
		"\2\2\u0136\u0137\t\3\2\2\u0137=\3\2\2\2\u0138\u013b\5<\37\2\u0139\u013b"+
		"\5\16\b\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b?\3\2\2\2\37CN"+
		"T_jtz\u0084\u008b\u008e\u009c\u00a3\u00a6\u00b1\u00bc\u00c5\u00cc\u00d5"+
		"\u00e1\u00e6\u00ee\u00f6\u0102\u010a\u010e\u011a\u012f\u0131\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}