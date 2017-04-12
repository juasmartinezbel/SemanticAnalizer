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
		T__9=10, T__10=11, COMMENT=12, WS=13, PIZQ=14, PDER=15, NEG=16, POT=17, 
		MULT=18, ADD=19, REL=20, EQUAL=21, DIF=22, AND=23, OR=24, PYC=25, COMMA=26, 
		SUF=27, TYPE=28, INTEGER=29, LONG=30, SINGLE=31, DOUBLE=32, STRING=33, 
		ID=34;
	public static final int
		RULE_qb64 = 0, RULE_instr = 1, RULE_decl = 2, RULE_dim = 3, RULE_shared = 4, 
		RULE_sufdecl = 5, RULE_idn = 6, RULE_suf = 7, RULE_par = 8, RULE_pos = 9, 
		RULE_print = 10, RULE_toprintfst = 11, RULE_toprint = 12, RULE_input = 13, 
		RULE_inpara = 14, RULE_inpn = 15, RULE_ifc = 16, RULE_ifter = 17, RULE_expr = 18, 
		RULE_equdi = 19, RULE_value = 20;
	public static final String[] ruleNames = {
		"qb64", "instr", "decl", "dim", "shared", "sufdecl", "idn", "suf", "par", 
		"pos", "print", "toprintfst", "toprint", "input", "inpara", "inpn", "ifc", 
		"ifter", "expr", "equdi", "value"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(42);
				instr();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				decl();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				print();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				input();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				ifc();
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				dim();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__0);
				setState(58);
				sufdecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
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
			setState(62);
			match(T__1);
			setState(63);
			shared();
			setState(64);
			match(ID);
			setState(65);
			par();
			setState(66);
			match(T__2);
			setState(67);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
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
			setState(73);
			idn();
			setState(74);
			match(EQUAL);
			setState(75);
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
			setState(77);
			match(ID);
			setState(78);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(80);
				match(SUF);
				}
				break;
			case 2:
				{
				}
				break;
			}
			{
			setState(84);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(86);
				match(PIZQ);
				setState(87);
				pos();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(88);
					match(COMMA);
					setState(89);
					pos();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
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
			setState(100);
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
			setState(102);
			match(T__4);
			setState(103);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PYC) {
					{
					{
					setState(105);
					toprint();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				expr(0);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PYC) {
					{
					{
					setState(112);
					toprint();
					}
					}
					setState(117);
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
			setState(120);
			match(PYC);
			setState(121);
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
			setState(123);
			match(T__5);
			setState(124);
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(126);
				match(STRING);
				setState(127);
				match(COMMA);
				setState(128);
				idn();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(129);
					inpn();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				{
				setState(135);
				idn();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(136);
					inpn();
					}
					}
					setState(141);
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
			setState(144);
			match(COMMA);
			setState(145);
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
			setState(147);
			match(T__6);
			setState(148);
			expr(0);
			setState(149);
			match(T__7);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(150);
				instr();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__8);
				setState(159);
				expr(0);
				setState(160);
				match(T__7);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
					{
					{
					setState(161);
					instr();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				ifter();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__9);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
					{
					{
					setState(170);
					instr();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__10);
				setState(177);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(T__10);
				setState(179);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(183);
				match(PIZQ);
				setState(184);
				expr(0);
				setState(185);
				match(PDER);
				}
				break;
			case NEG:
				{
				setState(187);
				match(NEG);
				setState(188);
				expr(9);
				}
				break;
			case POT:
				{
				setState(189);
				match(POT);
				setState(190);
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
				setState(191);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(195);
						match(MULT);
						setState(196);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(198);
						match(ADD);
						setState(199);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(201);
						match(REL);
						setState(202);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						equdi();
						setState(205);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(AND);
						setState(209);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(OR);
						setState(212);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 38, RULE_equdi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MyLanguageParser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(MyLanguageParser.LONG, 0); }
		public TerminalNode DOUBLE() { return getToken(MyLanguageParser.DOUBLE, 0); }
		public TerminalNode SINGLE() { return getToken(MyLanguageParser.SINGLE, 0); }
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
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
		enterRule(_localctx, 40, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(220);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(221);
				match(LONG);
				}
				break;
			case 3:
				{
				setState(222);
				match(DOUBLE);
				}
				break;
			case 4:
				{
				setState(223);
				match(SINGLE);
				}
				break;
			case 5:
				{
				setState(224);
				match(INTEGER);
				}
				break;
			case 6:
				{
				setState(225);
				match(STRING);
				}
				break;
			case 7:
				{
				setState(226);
				idn();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\5\tU\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\n\3\n\3\n"+
		"\5\ne\n\n\3\13\3\13\3\f\3\f\3\f\3\r\7\rm\n\r\f\r\16\rp\13\r\3\r\3\r\7"+
		"\rt\n\r\f\r\16\rw\13\r\5\ry\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20\u0085\n\20\f\20\16\20\u0088\13\20\3\20\3\20\7\20\u008c"+
		"\n\20\f\20\16\20\u008f\13\20\5\20\u0091\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\7\22\u009a\n\22\f\22\16\22\u009d\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\7\23\u00a5\n\23\f\23\16\23\u00a8\13\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00ae\n\23\f\23\16\23\u00b1\13\23\3\23\3\23\3\23\3\23\5\23\u00b7"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c3\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u00d8\n\24\f\24\16\24\u00db\13\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e6\n\26\3\26\2\3&\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\27\30\u00f6\2/"+
		"\3\2\2\2\48\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16O\3"+
		"\2\2\2\20T\3\2\2\2\22d\3\2\2\2\24f\3\2\2\2\26h\3\2\2\2\30x\3\2\2\2\32"+
		"z\3\2\2\2\34}\3\2\2\2\36\u0090\3\2\2\2 \u0092\3\2\2\2\"\u0095\3\2\2\2"+
		"$\u00b6\3\2\2\2&\u00c2\3\2\2\2(\u00dc\3\2\2\2*\u00e5\3\2\2\2,.\5\4\3\2"+
		"-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2"+
		"\62\63\7\2\2\3\63\3\3\2\2\2\649\5\6\4\2\659\5\26\f\2\669\5\34\17\2\67"+
		"9\5\"\22\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\5\3\2\2\2"+
		":?\5\b\5\2;<\7\3\2\2<?\5\f\7\2=?\5\f\7\2>:\3\2\2\2>;\3\2\2\2>=\3\2\2\2"+
		"?\7\3\2\2\2@A\7\4\2\2AB\5\n\6\2BC\7$\2\2CD\5\22\n\2DE\7\5\2\2EF\7\36\2"+
		"\2F\t\3\2\2\2GJ\7\6\2\2HJ\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\13\3\2\2\2KL\5"+
		"\16\b\2LM\7\27\2\2MN\5&\24\2N\r\3\2\2\2OP\7$\2\2PQ\5\20\t\2Q\17\3\2\2"+
		"\2RU\7\35\2\2SU\3\2\2\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VW\5\22\n\2W\21\3"+
		"\2\2\2XY\7\20\2\2Y^\5\24\13\2Z[\7\34\2\2[]\5\24\13\2\\Z\3\2\2\2]`\3\2"+
		"\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\21\2\2be\3\2\2\2ce\3"+
		"\2\2\2dX\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fg\5&\24\2g\25\3\2\2\2hi\7\7\2\2"+
		"ij\5\30\r\2j\27\3\2\2\2km\5\32\16\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2oy\3\2\2\2pn\3\2\2\2qu\5&\24\2rt\5\32\16\2sr\3\2\2\2tw\3\2\2\2u"+
		"s\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xn\3\2\2\2xq\3\2\2\2y\31\3\2\2"+
		"\2z{\7\33\2\2{|\5&\24\2|\33\3\2\2\2}~\7\b\2\2~\177\5\36\20\2\177\35\3"+
		"\2\2\2\u0080\u0081\7#\2\2\u0081\u0082\7\34\2\2\u0082\u0086\5\16\b\2\u0083"+
		"\u0085\5 \21\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0091\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008d\5\16\b\2\u008a\u008c\5 \21\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0080\3\2\2\2\u0090\u0089\3\2\2\2\u0091\37\3\2\2"+
		"\2\u0092\u0093\7\34\2\2\u0093\u0094\5\16\b\2\u0094!\3\2\2\2\u0095\u0096"+
		"\7\t\2\2\u0096\u0097\5&\24\2\u0097\u009b\7\n\2\2\u0098\u009a\5\4\3\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5$\23\2\u009f"+
		"#\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5&\24\2\u00a2\u00a6\7\n\2\2"+
		"\u00a3\u00a5\5\4\3\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\5$\23\2\u00aa\u00b7\3\2\2\2\u00ab\u00af\7\f\2\2\u00ac\u00ae\5\4"+
		"\3\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\r"+
		"\2\2\u00b3\u00b7\7\t\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00b7\7\t\2\2\u00b6"+
		"\u00a0\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7%\3\2\2\2"+
		"\u00b8\u00b9\b\24\1\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5&\24\2\u00bb\u00bc"+
		"\7\21\2\2\u00bc\u00c3\3\2\2\2\u00bd\u00be\7\22\2\2\u00be\u00c3\5&\24\13"+
		"\u00bf\u00c0\7\23\2\2\u00c0\u00c3\5&\24\n\u00c1\u00c3\5*\26\2\u00c2\u00b8"+
		"\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00d9\3\2\2\2\u00c4\u00c5\f\t\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00d8\5"+
		"&\24\n\u00c7\u00c8\f\b\2\2\u00c8\u00c9\7\25\2\2\u00c9\u00d8\5&\24\t\u00ca"+
		"\u00cb\f\7\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00d8\5&\24\b\u00cd\u00ce\f"+
		"\6\2\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\5&\24\7\u00d0\u00d8\3\2\2\2\u00d1"+
		"\u00d2\f\5\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d8\5&\24\6\u00d4\u00d5\f"+
		"\4\2\2\u00d5\u00d6\7\32\2\2\u00d6\u00d8\5&\24\5\u00d7\u00c4\3\2\2\2\u00d7"+
		"\u00c7\3\2\2\2\u00d7\u00ca\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00d1\3\2"+
		"\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\'\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\t\2\2\2"+
		"\u00dd)\3\2\2\2\u00de\u00e6\7\37\2\2\u00df\u00e6\7 \2\2\u00e0\u00e6\7"+
		"\"\2\2\u00e1\u00e6\7!\2\2\u00e2\u00e6\7\37\2\2\u00e3\u00e6\7#\2\2\u00e4"+
		"\u00e6\5\16\b\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3"+
		"\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6+\3\2\2\2\27/8>IT^dnux\u0086\u008d\u0090\u009b\u00a6"+
		"\u00af\u00b6\u00c2\u00d7\u00d9\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}