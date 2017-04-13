// Generated from MyLanguage.g by ANTLR 4.6
package classes;
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		COMMENT=25, WS=26, PIZQ=27, PDER=28, NEG=29, MINUS=30, POT=31, MULT=32, 
		ADD=33, REL=34, EQUAL=35, DIF=36, AND=37, OR=38, PYC=39, COMMA=40, SUFS=41, 
		SUFN=42, TYPE=43, INTEGER=44, LONG=45, SINGLE=46, DOUBLE=47, STRING=48, 
		ID=49;
	public static final int
		RULE_qb64 = 0, RULE_instr = 1, RULE_functionsub = 2, RULE_decl = 3, RULE_dim = 4, 
		RULE_idim = 5, RULE_idimnext = 6, RULE_shared = 7, RULE_sufdecl = 8, RULE_idn = 9, 
		RULE_suf = 10, RULE_sufix = 11, RULE_par = 12, RULE_postn = 13, RULE_pos = 14, 
		RULE_print = 15, RULE_toprintfst = 16, RULE_toprint = 17, RULE_input = 18, 
		RULE_inpara = 19, RULE_inpn = 20, RULE_ifc = 21, RULE_ifter = 22, RULE_forc = 23, 
		RULE_forexpr = 24, RULE_forsuf = 25, RULE_tothis = 26, RULE_tofor = 27, 
		RULE_step = 28, RULE_selectc = 29, RULE_cases = 30, RULE_caselse = 31, 
		RULE_whilec = 32, RULE_doc = 33, RULE_tdoc = 34, RULE_fun = 35, RULE_funidn = 36, 
		RULE_sub = 37, RULE_subidn = 38, RULE_parfu = 39, RULE_arg = 40, RULE_argpa = 41, 
		RULE_argn = 42, RULE_call = 43, RULE_callarg = 44, RULE_calln = 45, RULE_expr = 46, 
		RULE_equdi = 47, RULE_neg = 48, RULE_addi = 49, RULE_valuev = 50, RULE_value = 51, 
		RULE_idnp = 52;
	public static final String[] ruleNames = {
		"qb64", "instr", "functionsub", "decl", "dim", "idim", "idimnext", "shared", 
		"sufdecl", "idn", "suf", "sufix", "par", "postn", "pos", "print", "toprintfst", 
		"toprint", "input", "inpara", "inpn", "ifc", "ifter", "forc", "forexpr", 
		"forsuf", "tothis", "tofor", "step", "selectc", "cases", "caselse", "whilec", 
		"doc", "tdoc", "fun", "funidn", "sub", "subidn", "parfu", "arg", "argpa", 
		"argn", "call", "callarg", "calln", "expr", "equdi", "neg", "addi", "valuev", 
		"value", "idnp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'dim'", "'as'", "'shared'", "'print'", "'input'", "'if'", 
		"'then'", "'elseif'", "'else'", "'end'", "'for'", "'next'", "'to'", "'step'", 
		"'select'", "'case'", "'while'", "'wend'", "'do'", "'loop'", "'until'", 
		"'function'", "'sub'", null, null, "'('", "')'", "'not'", "'-'", "'^'", 
		null, "'+'", null, "'='", "'<>'", "'and'", null, "';'", "','", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "COMMENT", "WS", "PIZQ", "PDER", "NEG", "MINUS", "POT", "MULT", 
		"ADD", "REL", "EQUAL", "DIF", "AND", "OR", "PYC", "COMMA", "SUFS", "SUFN", 
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

	@Override
	public String getGrammarFileName() { return "MyLanguage.g"; }

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
		public List<FunctionsubContext> functionsub() {
			return getRuleContexts(FunctionsubContext.class);
		}
		public FunctionsubContext functionsub(int i) {
			return getRuleContext(FunctionsubContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitQb64(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qb64Context qb64() throws RecognitionException {
		Qb64Context _localctx = new Qb64Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_qb64);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(106);
				instr();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__23) {
				{
				{
				setState(112);
				functionsub();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
		public WhilecContext whilec() {
			return getRuleContext(WhilecContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instr);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				input();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				ifc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				forc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				selectc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				whilec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				doc();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				call();
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

	public static class FunctionsubContext extends ParserRuleContext {
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public FunctionsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterFunctionsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitFunctionsub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitFunctionsub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsubContext functionsub() throws RecognitionException {
		FunctionsubContext _localctx = new FunctionsubContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionsub);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				fun();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				sub();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				dim();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__0);
				setState(137);
				sufdecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
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
		public IdimContext idim() {
			return getRuleContext(IdimContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__1);
			setState(142);
			shared();
			setState(143);
			idim();
			setState(144);
			match(T__2);
			setState(145);
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

	public static class IdimContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public List<IdimnextContext> idimnext() {
			return getRuleContexts(IdimnextContext.class);
		}
		public IdimnextContext idimnext(int i) {
			return getRuleContext(IdimnextContext.class,i);
		}
		public IdimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIdim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIdim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIdim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdimContext idim() throws RecognitionException {
		IdimContext _localctx = new IdimContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_idim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			par();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				idimnext();
				}
				}
				setState(154);
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

	public static class IdimnextContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public IdimnextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idimnext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIdimnext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIdimnext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIdimnext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdimnextContext idimnext() throws RecognitionException {
		IdimnextContext _localctx = new IdimnextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idimnext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(COMMA);
			setState(156);
			match(ID);
			setState(157);
			par();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitShared(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedContext shared() throws RecognitionException {
		SharedContext _localctx = new SharedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_shared);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSufdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SufdeclContext sufdecl() throws RecognitionException {
		SufdeclContext _localctx = new SufdeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sufdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			idn();
			setState(164);
			match(EQUAL);
			setState(165);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIdn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdnContext idn() throws RecognitionException {
		IdnContext _localctx = new IdnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
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
		public SufixContext sufix() {
			return getRuleContext(SufixContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSuf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SufContext suf() throws RecognitionException {
		SufContext _localctx = new SufContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_suf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			sufix();
			{
			setState(171);
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

	public static class SufixContext extends ParserRuleContext {
		public TerminalNode SUFN() { return getToken(MyLanguageParser.SUFN, 0); }
		public TerminalNode SUFS() { return getToken(MyLanguageParser.SUFS, 0); }
		public SufixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sufix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSufix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSufix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSufix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SufixContext sufix() throws RecognitionException {
		SufixContext _localctx = new SufixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sufix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(173);
				match(SUFN);
				}
				break;
			case 2:
				{
				setState(174);
				match(SUFS);
				}
				break;
			case 3:
				{
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

	public static class ParContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyLanguageParser.PIZQ, 0); }
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyLanguageParser.PDER, 0); }
		public List<PostnContext> postn() {
			return getRuleContexts(PostnContext.class);
		}
		public PostnContext postn(int i) {
			return getRuleContext(PostnContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_par);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(178);
				match(PIZQ);
				setState(179);
				pos();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					postn();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
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

	public static class PostnContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public PostnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPostn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPostn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPostn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostnContext postn() throws RecognitionException {
		PostnContext _localctx = new PostnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_postn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(COMMA);
			setState(192);
			pos();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__4);
			setState(197);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitToprintfst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToprintfstContext toprintfst() throws RecognitionException {
		ToprintfstContext _localctx = new ToprintfstContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_toprintfst);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PYC) {
					{
					{
					setState(199);
					toprint();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				expr(0);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PYC) {
					{
					{
					setState(206);
					toprint();
					}
					}
					setState(211);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitToprint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToprintContext toprint() throws RecognitionException {
		ToprintContext _localctx = new ToprintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_toprint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(PYC);
			setState(215);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__5);
			setState(218);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitInpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InparaContext inpara() throws RecognitionException {
		InparaContext _localctx = new InparaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(220);
				match(STRING);
				setState(221);
				match(COMMA);
				setState(222);
				idn();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(223);
					inpn();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				{
				setState(229);
				idn();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(230);
					inpn();
					}
					}
					setState(235);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitInpn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InpnContext inpn() throws RecognitionException {
		InpnContext _localctx = new InpnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inpn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(COMMA);
			setState(239);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIfc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcContext ifc() throws RecognitionException {
		IfcContext _localctx = new IfcContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__6);
			setState(242);
			expr(0);
			setState(243);
			match(T__7);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(244);
				instr();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIfter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfterContext ifter() throws RecognitionException {
		IfterContext _localctx = new IfterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifter);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__8);
				setState(253);
				expr(0);
				setState(254);
				match(T__7);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
					{
					{
					setState(255);
					instr();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				ifter();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(T__9);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
					{
					{
					setState(264);
					instr();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(T__10);
				setState(271);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(T__10);
				setState(273);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitForc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForcContext forc() throws RecognitionException {
		ForcContext _localctx = new ForcContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__11);
			setState(277);
			forexpr();
			setState(278);
			tofor();
			setState(279);
			step();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(280);
				instr();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitForexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForexprContext forexpr() throws RecognitionException {
		ForexprContext _localctx = new ForexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ID);
			setState(289);
			forsuf();
			setState(290);
			match(EQUAL);
			setState(291);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitForsuf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForsufContext forsuf() throws RecognitionException {
		ForsufContext _localctx = new ForsufContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forsuf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUFN:
				{
				setState(293);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitTothis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TothisContext tothis() throws RecognitionException {
		TothisContext _localctx = new TothisContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tothis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitTofor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToforContext tofor() throws RecognitionException {
		ToforContext _localctx = new ToforContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__13);
			setState(300);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(302);
				match(T__14);
				setState(303);
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
			case T__17:
			case T__19:
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSelectc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectcContext selectc() throws RecognitionException {
		SelectcContext _localctx = new SelectcContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selectc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__15);
			setState(308);
			match(T__16);
			setState(309);
			idn();
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					cases();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(316);
			caselse();
			setState(317);
			match(T__10);
			setState(318);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__16);
			setState(321);
			valuev();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(322);
				instr();
				}
				}
				setState(327);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCaselse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaselseContext caselse() throws RecognitionException {
		CaselseContext _localctx = new CaselseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_caselse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(328);
				match(T__16);
				setState(329);
				match(T__9);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
					{
					{
					setState(330);
					instr();
					}
					}
					setState(335);
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

	public static class WhilecContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public WhilecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterWhilec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitWhilec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitWhilec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilecContext whilec() throws RecognitionException {
		WhilecContext _localctx = new WhilecContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whilec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__17);
			setState(340);
			expr(0);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(341);
				instr();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(T__18);
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

	public static class DocContext extends ParserRuleContext {
		public TdocContext tdoc() {
			return getRuleContext(TdocContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__19);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(350);
				instr();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(T__20);
			setState(357);
			tdoc();
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

	public static class TdocContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TdocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tdoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterTdoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitTdoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitTdoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TdocContext tdoc() throws RecognitionException {
		TdocContext _localctx = new TdocContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tdoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(360);
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

	public static class FunContext extends ParserRuleContext {
		public FunidnContext funidn() {
			return getRuleContext(FunidnContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__22);
			setState(363);
			funidn();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(364);
				instr();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(T__10);
			setState(371);
			match(T__22);
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

	public static class FunidnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public SufixContext sufix() {
			return getRuleContext(SufixContext.class,0);
		}
		public ParfuContext parfu() {
			return getRuleContext(ParfuContext.class,0);
		}
		public FunidnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funidn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterFunidn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitFunidn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitFunidn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunidnContext funidn() throws RecognitionException {
		FunidnContext _localctx = new FunidnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_funidn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ID);
			setState(374);
			sufix();
			setState(375);
			parfu();
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

	public static class SubContext extends ParserRuleContext {
		public SubidnContext subidn() {
			return getRuleContext(SubidnContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__23);
			setState(378);
			subidn();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(379);
				instr();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			match(T__10);
			setState(386);
			match(T__23);
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

	public static class SubidnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ParfuContext parfu() {
			return getRuleContext(ParfuContext.class,0);
		}
		public SubidnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subidn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSubidn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSubidn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSubidn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubidnContext subidn() throws RecognitionException {
		SubidnContext _localctx = new SubidnContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subidn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ID);
			setState(389);
			parfu();
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

	public static class ParfuContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyLanguageParser.PIZQ, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyLanguageParser.PDER, 0); }
		public ParfuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parfu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterParfu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitParfu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitParfu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParfuContext parfu() throws RecognitionException {
		ParfuContext _localctx = new ParfuContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parfu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(391);
				match(PIZQ);
				setState(392);
				arg();
				setState(393);
				match(PDER);
				}
				break;
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__10:
			case T__11:
			case T__15:
			case T__17:
			case T__19:
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public SufixContext sufix() {
			return getRuleContext(SufixContext.class,0);
		}
		public ArgpaContext argpa() {
			return getRuleContext(ArgpaContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(398);
				match(ID);
				setState(399);
				sufix();
				}
				break;
			case 2:
				{
				setState(400);
				match(ID);
				setState(401);
				argpa();
				}
				break;
			}
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					match(COMMA);
					setState(405);
					arg();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class ArgpaContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyLanguageParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MyLanguageParser.PDER, 0); }
		public TerminalNode TYPE() { return getToken(MyLanguageParser.TYPE, 0); }
		public ArgpaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argpa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterArgpa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitArgpa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitArgpa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgpaContext argpa() throws RecognitionException {
		ArgpaContext _localctx = new ArgpaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argpa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(PIZQ);
			setState(412);
			match(PDER);
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				{
				setState(413);
				match(T__2);
				setState(416);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(414);
					match(TYPE);
					}
					break;
				case PDER:
				case COMMA:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case PDER:
			case COMMA:
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

	public static class ArgnContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public ArgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterArgn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitArgn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitArgn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgnContext argn() throws RecognitionException {
		ArgnContext _localctx = new ArgnContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_argn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(COMMA);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public CallargContext callarg() {
			return getRuleContext(CallargContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(ID);
			setState(424);
			callarg();
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

	public static class CallargContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CallnContext> calln() {
			return getRuleContexts(CallnContext.class);
		}
		public CallnContext calln(int i) {
			return getRuleContext(CallnContext.class,i);
		}
		public CallargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCallarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCallarg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCallarg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallargContext callarg() throws RecognitionException {
		CallargContext _localctx = new CallargContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_callarg);
		int _la;
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				expr(0);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(427);
					calln();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class CallnContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCalln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCalln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCalln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallnContext calln() throws RecognitionException {
		CallnContext _localctx = new CallnContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_calln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(COMMA);
			setState(437);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(MyLanguageParser.PIZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PDER() { return getToken(MyLanguageParser.PDER, 0); }
		public NegContext neg() {
			return getRuleContext(NegContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode POT() { return getToken(MyLanguageParser.POT, 0); }
		public TerminalNode MULT() { return getToken(MyLanguageParser.MULT, 0); }
		public AddiContext addi() {
			return getRuleContext(AddiContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(440);
				match(PIZQ);
				setState(441);
				expr(0);
				setState(442);
				match(PDER);
				}
				break;
			case NEG:
			case MINUS:
				{
				setState(444);
				neg();
				setState(445);
				expr(9);
				}
				break;
			case INTEGER:
			case LONG:
			case SINGLE:
			case DOUBLE:
			case STRING:
			case ID:
				{
				setState(447);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(450);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(451);
						match(POT);
						setState(452);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(453);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(454);
						match(MULT);
						setState(455);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(456);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(457);
						addi();
						setState(458);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(460);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(461);
						match(REL);
						setState(462);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(463);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(464);
						equdi();
						setState(465);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(467);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(468);
						match(AND);
						setState(469);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(470);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(471);
						match(OR);
						setState(472);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitEqudi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqudiContext equdi() throws RecognitionException {
		EqudiContext _localctx = new EqudiContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_equdi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
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

	public static class NegContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(MyLanguageParser.NEG, 0); }
		public TerminalNode MINUS() { return getToken(MyLanguageParser.MINUS, 0); }
		public NegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !(_la==NEG || _la==MINUS) ) {
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

	public static class AddiContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MyLanguageParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(MyLanguageParser.MINUS, 0); }
		public AddiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAddi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAddi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAddi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddiContext addi() throws RecognitionException {
		AddiContext _localctx = new AddiContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_addi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==ADD) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitValuev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuevContext valuev() throws RecognitionException {
		ValuevContext _localctx = new ValuevContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_valuev);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
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
		public IdnpContext idnp() {
			return getRuleContext(IdnpContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case LONG:
			case SINGLE:
			case DOUBLE:
			case STRING:
				{
				setState(486);
				valuev();
				}
				break;
			case ID:
				{
				setState(487);
				idnp();
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

	public static class IdnpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public SufixContext sufix() {
			return getRuleContext(SufixContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MyLanguageParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MyLanguageParser.PDER, 0); }
		public IdnpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idnp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIdnp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIdnp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIdnp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdnpContext idnp() throws RecognitionException {
		IdnpContext _localctx = new IdnpContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_idnp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(ID);
			setState(491);
			sufix();
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(492);
				par();
				}
				break;
			case 2:
				{
				setState(493);
				match(PIZQ);
				setState(494);
				match(PDER);
				}
				break;
			case 3:
				{
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
		case 46:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u01f5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\7\2t\n\2\f\2\16"+
		"\2w\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\4"+
		"\3\4\5\4\u0088\n\4\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\5\t\u00a4\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\5\r\u00b3\n\r\3\16\3\16\3\16\7\16\u00b8\n\16\f\16\16\16\u00bb\13\16"+
		"\3\16\3\16\3\16\5\16\u00c0\n\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\7\22\u00cb\n\22\f\22\16\22\u00ce\13\22\3\22\3\22\7\22\u00d2\n\22"+
		"\f\22\16\22\u00d5\13\22\5\22\u00d7\n\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u00e3\n\25\f\25\16\25\u00e6\13\25\3\25\3\25"+
		"\7\25\u00ea\n\25\f\25\16\25\u00ed\13\25\5\25\u00ef\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\7\27\u00f8\n\27\f\27\16\27\u00fb\13\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\7\30\u0103\n\30\f\30\16\30\u0106\13\30\3\30\3\30"+
		"\3\30\3\30\7\30\u010c\n\30\f\30\16\30\u010f\13\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0115\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u011c\n\31\f\31\16\31\u011f"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u012a\n\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u0134\n\36\3\37\3\37\3\37"+
		"\3\37\7\37\u013a\n\37\f\37\16\37\u013d\13\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \7 \u0146\n \f \16 \u0149\13 \3!\3!\3!\7!\u014e\n!\f!\16!\u0151\13"+
		"!\3!\5!\u0154\n!\3\"\3\"\3\"\7\"\u0159\n\"\f\"\16\"\u015c\13\"\3\"\3\""+
		"\3#\3#\7#\u0162\n#\f#\16#\u0165\13#\3#\3#\3#\3$\3$\3$\3%\3%\3%\7%\u0170"+
		"\n%\f%\16%\u0173\13%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u017f\n\'\f"+
		"\'\16\'\u0182\13\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\5)\u018f\n)\3*"+
		"\3*\3*\3*\5*\u0195\n*\3*\3*\7*\u0199\n*\f*\16*\u019c\13*\3+\3+\3+\3+\3"+
		"+\5+\u01a3\n+\3+\5+\u01a6\n+\3,\3,\3-\3-\3-\3.\3.\7.\u01af\n.\f.\16.\u01b2"+
		"\13.\3.\5.\u01b5\n.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u01c3\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60"+
		"\u01dc\n\60\f\60\16\60\u01df\13\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\5\65\u01eb\n\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01f3"+
		"\n\66\3\66\2\3^\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\7\4\2\24\24\30\30\3\2%&\3\2\37"+
		" \4\2  ##\3\2.\62\u01fb\2o\3\2\2\2\4\u0083\3\2\2\2\6\u0087\3\2\2\2\b\u008d"+
		"\3\2\2\2\n\u008f\3\2\2\2\f\u0095\3\2\2\2\16\u009d\3\2\2\2\20\u00a3\3\2"+
		"\2\2\22\u00a5\3\2\2\2\24\u00a9\3\2\2\2\26\u00ac\3\2\2\2\30\u00b2\3\2\2"+
		"\2\32\u00bf\3\2\2\2\34\u00c1\3\2\2\2\36\u00c4\3\2\2\2 \u00c6\3\2\2\2\""+
		"\u00d6\3\2\2\2$\u00d8\3\2\2\2&\u00db\3\2\2\2(\u00ee\3\2\2\2*\u00f0\3\2"+
		"\2\2,\u00f3\3\2\2\2.\u0114\3\2\2\2\60\u0116\3\2\2\2\62\u0122\3\2\2\2\64"+
		"\u0129\3\2\2\2\66\u012b\3\2\2\28\u012d\3\2\2\2:\u0133\3\2\2\2<\u0135\3"+
		"\2\2\2>\u0142\3\2\2\2@\u0153\3\2\2\2B\u0155\3\2\2\2D\u015f\3\2\2\2F\u0169"+
		"\3\2\2\2H\u016c\3\2\2\2J\u0177\3\2\2\2L\u017b\3\2\2\2N\u0186\3\2\2\2P"+
		"\u018e\3\2\2\2R\u0194\3\2\2\2T\u019d\3\2\2\2V\u01a7\3\2\2\2X\u01a9\3\2"+
		"\2\2Z\u01b4\3\2\2\2\\\u01b6\3\2\2\2^\u01c2\3\2\2\2`\u01e0\3\2\2\2b\u01e2"+
		"\3\2\2\2d\u01e4\3\2\2\2f\u01e6\3\2\2\2h\u01ea\3\2\2\2j\u01ec\3\2\2\2l"+
		"n\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pu\3\2\2\2qo\3\2\2\2"+
		"rt\5\6\4\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2"+
		"xy\7\2\2\3y\3\3\2\2\2z\u0084\5\b\5\2{\u0084\5 \21\2|\u0084\5&\24\2}\u0084"+
		"\5,\27\2~\u0084\5\60\31\2\177\u0084\5<\37\2\u0080\u0084\5B\"\2\u0081\u0084"+
		"\5D#\2\u0082\u0084\5X-\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2"+
		"\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\5\3\2\2\2\u0085\u0088\5H%\2\u0086"+
		"\u0088\5L\'\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\7\3\2\2\2"+
		"\u0089\u008e\5\n\6\2\u008a\u008b\7\3\2\2\u008b\u008e\5\22\n\2\u008c\u008e"+
		"\5\22\n\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\t\3\2\2\2\u008f\u0090\7\4\2\2\u0090\u0091\5\20\t\2\u0091\u0092"+
		"\5\f\7\2\u0092\u0093\7\5\2\2\u0093\u0094\7-\2\2\u0094\13\3\2\2\2\u0095"+
		"\u0096\7\63\2\2\u0096\u009a\5\32\16\2\u0097\u0099\5\16\b\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\r\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7*\2\2\u009e\u009f\7\63\2\2"+
		"\u009f\u00a0\5\32\16\2\u00a0\17\3\2\2\2\u00a1\u00a4\7\6\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\21\3\2\2\2\u00a5"+
		"\u00a6\5\24\13\2\u00a6\u00a7\7%\2\2\u00a7\u00a8\5^\60\2\u00a8\23\3\2\2"+
		"\2\u00a9\u00aa\7\63\2\2\u00aa\u00ab\5\26\f\2\u00ab\25\3\2\2\2\u00ac\u00ad"+
		"\5\30\r\2\u00ad\u00ae\5\32\16\2\u00ae\27\3\2\2\2\u00af\u00b3\7,\2\2\u00b0"+
		"\u00b3\7+\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b9"+
		"\5\36\20\2\u00b6\u00b8\5\34\17\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bd\7\36\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\3\2\2\2"+
		"\u00bf\u00b4\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00c2"+
		"\7*\2\2\u00c2\u00c3\5\36\20\2\u00c3\35\3\2\2\2\u00c4\u00c5\5^\60\2\u00c5"+
		"\37\3\2\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\5\"\22\2\u00c8!\3\2\2\2\u00c9"+
		"\u00cb\5$\23\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d7\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d3\5^\60\2\u00d0\u00d2\5$\23\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d7#\3\2\2\2"+
		"\u00d8\u00d9\7)\2\2\u00d9\u00da\5^\60\2\u00da%\3\2\2\2\u00db\u00dc\7\b"+
		"\2\2\u00dc\u00dd\5(\25\2\u00dd\'\3\2\2\2\u00de\u00df\7\62\2\2\u00df\u00e0"+
		"\7*\2\2\u00e0\u00e4\5\24\13\2\u00e1\u00e3\5*\26\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ef"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00eb\5\24\13\2\u00e8\u00ea\5*\26\2"+
		"\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00de\3\2\2\2\u00ee"+
		"\u00e7\3\2\2\2\u00ef)\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1\u00f2\5\24\13\2"+
		"\u00f2+\3\2\2\2\u00f3\u00f4\7\t\2\2\u00f4\u00f5\5^\60\2\u00f5\u00f9\7"+
		"\n\2\2\u00f6\u00f8\5\4\3\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00fd\5.\30\2\u00fd-\3\2\2\2\u00fe\u00ff\7\13\2\2\u00ff\u0100"+
		"\5^\60\2\u0100\u0104\7\n\2\2\u0101\u0103\5\4\3\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0108\5.\30\2\u0108\u0115\3\2\2\2\u0109"+
		"\u010d\7\f\2\2\u010a\u010c\5\4\3\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7\r\2\2\u0111\u0115\7\t\2\2\u0112\u0113\7\r"+
		"\2\2\u0113\u0115\7\t\2\2\u0114\u00fe\3\2\2\2\u0114\u0109\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115/\3\2\2\2\u0116\u0117\7\16\2\2\u0117\u0118\5\62\32"+
		"\2\u0118\u0119\58\35\2\u0119\u011d\5:\36\2\u011a\u011c\5\4\3\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\17\2\2\u0121\61\3\2\2"+
		"\2\u0122\u0123\7\63\2\2\u0123\u0124\5\64\33\2\u0124\u0125\7%\2\2\u0125"+
		"\u0126\5\66\34\2\u0126\63\3\2\2\2\u0127\u012a\7,\2\2\u0128\u012a\3\2\2"+
		"\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\65\3\2\2\2\u012b\u012c"+
		"\5^\60\2\u012c\67\3\2\2\2\u012d\u012e\7\20\2\2\u012e\u012f\5\66\34\2\u012f"+
		"9\3\2\2\2\u0130\u0131\7\21\2\2\u0131\u0134\5\66\34\2\u0132\u0134\3\2\2"+
		"\2\u0133\u0130\3\2\2\2\u0133\u0132\3\2\2\2\u0134;\3\2\2\2\u0135\u0136"+
		"\7\22\2\2\u0136\u0137\7\23\2\2\u0137\u013b\5\24\13\2\u0138\u013a\5> \2"+
		"\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\5@!\2\u013f"+
		"\u0140\7\r\2\2\u0140\u0141\7\22\2\2\u0141=\3\2\2\2\u0142\u0143\7\23\2"+
		"\2\u0143\u0147\5f\64\2\u0144\u0146\5\4\3\2\u0145\u0144\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148?\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\7\23\2\2\u014b\u014f\7\f\2\2\u014c\u014e\5"+
		"\4\3\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0154\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\3\2"+
		"\2\2\u0153\u014a\3\2\2\2\u0153\u0152\3\2\2\2\u0154A\3\2\2\2\u0155\u0156"+
		"\7\24\2\2\u0156\u015a\5^\60\2\u0157\u0159\5\4\3\2\u0158\u0157\3\2\2\2"+
		"\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\25\2\2\u015eC\3\2\2\2\u015f"+
		"\u0163\7\26\2\2\u0160\u0162\5\4\3\2\u0161\u0160\3\2\2\2\u0162\u0165\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\7\27\2\2\u0167\u0168\5F$\2\u0168E\3\2\2\2\u0169"+
		"\u016a\t\2\2\2\u016a\u016b\5^\60\2\u016bG\3\2\2\2\u016c\u016d\7\31\2\2"+
		"\u016d\u0171\5J&\2\u016e\u0170\5\4\3\2\u016f\u016e\3\2\2\2\u0170\u0173"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\7\r\2\2\u0175\u0176\7\31\2\2\u0176I\3\2\2\2"+
		"\u0177\u0178\7\63\2\2\u0178\u0179\5\30\r\2\u0179\u017a\5P)\2\u017aK\3"+
		"\2\2\2\u017b\u017c\7\32\2\2\u017c\u0180\5N(\2\u017d\u017f\5\4\3\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7\r\2\2\u0184"+
		"\u0185\7\32\2\2\u0185M\3\2\2\2\u0186\u0187\7\63\2\2\u0187\u0188\5P)\2"+
		"\u0188O\3\2\2\2\u0189\u018a\7\35\2\2\u018a\u018b\5R*\2\u018b\u018c\7\36"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0189\3\2\2\2\u018e"+
		"\u018d\3\2\2\2\u018fQ\3\2\2\2\u0190\u0191\7\63\2\2\u0191\u0195\5\30\r"+
		"\2\u0192\u0193\7\63\2\2\u0193\u0195\5T+\2\u0194\u0190\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0195\u019a\3\2\2\2\u0196\u0197\7*\2\2\u0197\u0199\5R*\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019bS\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\35\2\2\u019e\u01a5"+
		"\7\36\2\2\u019f\u01a2\7\5\2\2\u01a0\u01a3\7-\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a6\3\2"+
		"\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6U\3\2\2\2\u01a7\u01a8"+
		"\7*\2\2\u01a8W\3\2\2\2\u01a9\u01aa\7\63\2\2\u01aa\u01ab\5Z.\2\u01abY\3"+
		"\2\2\2\u01ac\u01b0\5^\60\2\u01ad\u01af\5\\/\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b5\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5[\3\2\2\2\u01b6\u01b7\7*\2\2\u01b7\u01b8\5^\60\2\u01b8"+
		"]\3\2\2\2\u01b9\u01ba\b\60\1\2\u01ba\u01bb\7\35\2\2\u01bb\u01bc\5^\60"+
		"\2\u01bc\u01bd\7\36\2\2\u01bd\u01c3\3\2\2\2\u01be\u01bf\5b\62\2\u01bf"+
		"\u01c0\5^\60\13\u01c0\u01c3\3\2\2\2\u01c1\u01c3\5h\65\2\u01c2\u01b9\3"+
		"\2\2\2\u01c2\u01be\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01dd\3\2\2\2\u01c4"+
		"\u01c5\f\n\2\2\u01c5\u01c6\7!\2\2\u01c6\u01dc\5^\60\13\u01c7\u01c8\f\t"+
		"\2\2\u01c8\u01c9\7\"\2\2\u01c9\u01dc\5^\60\n\u01ca\u01cb\f\b\2\2\u01cb"+
		"\u01cc\5d\63\2\u01cc\u01cd\5^\60\t\u01cd\u01dc\3\2\2\2\u01ce\u01cf\f\7"+
		"\2\2\u01cf\u01d0\7$\2\2\u01d0\u01dc\5^\60\b\u01d1\u01d2\f\6\2\2\u01d2"+
		"\u01d3\5`\61\2\u01d3\u01d4\5^\60\7\u01d4\u01dc\3\2\2\2\u01d5\u01d6\f\5"+
		"\2\2\u01d6\u01d7\7\'\2\2\u01d7\u01dc\5^\60\6\u01d8\u01d9\f\4\2\2\u01d9"+
		"\u01da\7(\2\2\u01da\u01dc\5^\60\5\u01db\u01c4\3\2\2\2\u01db\u01c7\3\2"+
		"\2\2\u01db\u01ca\3\2\2\2\u01db\u01ce\3\2\2\2\u01db\u01d1\3\2\2\2\u01db"+
		"\u01d5\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de_\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1"+
		"\t\3\2\2\u01e1a\3\2\2\2\u01e2\u01e3\t\4\2\2\u01e3c\3\2\2\2\u01e4\u01e5"+
		"\t\5\2\2\u01e5e\3\2\2\2\u01e6\u01e7\t\6\2\2\u01e7g\3\2\2\2\u01e8\u01eb"+
		"\5f\64\2\u01e9\u01eb\5j\66\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"i\3\2\2\2\u01ec\u01ed\7\63\2\2\u01ed\u01f2\5\30\r\2\u01ee\u01f3\5\32\16"+
		"\2\u01ef\u01f0\7\35\2\2\u01f0\u01f3\7\36\2\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01ee\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3k\3\2\2\2"+
		"-ou\u0083\u0087\u008d\u009a\u00a3\u00b2\u00b9\u00bf\u00cc\u00d3\u00d6"+
		"\u00e4\u00eb\u00ee\u00f9\u0104\u010d\u0114\u011d\u0129\u0133\u013b\u0147"+
		"\u014f\u0153\u015a\u0163\u0171\u0180\u018e\u0194\u019a\u01a2\u01a5\u01b0"+
		"\u01b4\u01c2\u01db\u01dd\u01ea\u01f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}