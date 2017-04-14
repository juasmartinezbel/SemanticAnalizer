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
		SUFN=42, TYPE=43, STRING=44, INTEGER=45, LONG=46, SINGLE=47, DOUBLE=48, 
		ID=49;
	public static final int
		RULE_qb64 = 0, RULE_instr = 1, RULE_functionsub = 2, RULE_decl = 3, RULE_dim = 4, 
		RULE_shared = 5, RULE_idim = 6, RULE_sufdecl = 7, RULE_idn = 8, RULE_sufix = 9, 
		RULE_par = 10, RULE_pos = 11, RULE_print = 12, RULE_toprintfst = 13, RULE_toprint = 14, 
		RULE_input = 15, RULE_inpara = 16, RULE_ifc = 17, RULE_ifter = 18, RULE_forc = 19, 
		RULE_forexpr = 20, RULE_forsuf = 21, RULE_tothis = 22, RULE_tofor = 23, 
		RULE_step = 24, RULE_selectc = 25, RULE_cases = 26, RULE_caselse = 27, 
		RULE_whilec = 28, RULE_doc = 29, RULE_tdoc = 30, RULE_fun = 31, RULE_funidn = 32, 
		RULE_sub = 33, RULE_subidn = 34, RULE_parfu = 35, RULE_arg = 36, RULE_argpa = 37, 
		RULE_argn = 38, RULE_call = 39, RULE_callarg = 40, RULE_calln = 41, RULE_expr = 42, 
		RULE_equdi = 43, RULE_neg = 44, RULE_addi = 45, RULE_valuev = 46, RULE_value = 47, 
		RULE_idnp = 48;
	public static final String[] ruleNames = {
		"qb64", "instr", "functionsub", "decl", "dim", "shared", "idim", "sufdecl", 
		"idn", "sufix", "par", "pos", "print", "toprintfst", "toprint", "input", 
		"inpara", "ifc", "ifter", "forc", "forexpr", "forsuf", "tothis", "tofor", 
		"step", "selectc", "cases", "caselse", "whilec", "doc", "tdoc", "fun", 
		"funidn", "sub", "subidn", "parfu", "arg", "argpa", "argn", "call", "callarg", 
		"calln", "expr", "equdi", "neg", "addi", "valuev", "value", "idnp"
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
		"TYPE", "STRING", "INTEGER", "LONG", "SINGLE", "DOUBLE", "ID"
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(98);
				instr();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__23) {
				{
				{
				setState(104);
				functionsub();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				input();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				ifc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				forc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				selectc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				whilec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				doc();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				fun();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				dim();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__0);
				setState(129);
				sufdecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
		public List<IdimContext> idim() {
			return getRuleContexts(IdimContext.class);
		}
		public IdimContext idim(int i) {
			return getRuleContext(IdimContext.class,i);
		}
		public TerminalNode TYPE() { return getToken(MyLanguageParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParser.COMMA, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__1);
			setState(134);
			shared();
			setState(135);
			idim();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				idim();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__2);
			setState(144);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitShared(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedContext shared() throws RecognitionException {
		SharedContext _localctx = new SharedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_shared);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
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

	public static class IdimContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
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
		enterRule(_localctx, 12, RULE_idim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			setState(151);
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
		enterRule(_localctx, 14, RULE_sufdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			idn();
			setState(154);
			match(EQUAL);
			setState(155);
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
		public SufixContext sufix() {
			return getRuleContext(SufixContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
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
		enterRule(_localctx, 16, RULE_idn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(158);
			sufix();
			{
			setState(159);
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
		enterRule(_localctx, 18, RULE_sufix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(161);
				match(SUFN);
				}
				break;
			case 2:
				{
				setState(162);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_par);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(166);
				match(PIZQ);
				setState(167);
				pos();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(168);
					match(COMMA);
					setState(169);
					pos();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__4);
			setState(183);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ToprintContext> toprint() {
			return getRuleContexts(ToprintContext.class);
		}
		public ToprintContext toprint(int i) {
			return getRuleContext(ToprintContext.class,i);
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
		enterRule(_localctx, 26, RULE_toprintfst);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				expr(0);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PYC) {
					{
					{
					setState(186);
					toprint();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PYC) {
					{
					{
					setState(192);
					toprint();
					}
					}
					setState(197);
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
		enterRule(_localctx, 28, RULE_toprint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(PYC);
			setState(201);
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
		enterRule(_localctx, 30, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__5);
			setState(204);
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
		public List<IdnContext> idn() {
			return getRuleContexts(IdnContext.class);
		}
		public IdnContext idn(int i) {
			return getRuleContext(IdnContext.class,i);
		}
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParser.COMMA, i);
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
		enterRule(_localctx, 32, RULE_inpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(206);
				idn();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207);
					match(COMMA);
					setState(208);
					idn();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				{
				setState(214);
				match(STRING);
				setState(215);
				match(COMMA);
				setState(216);
				idn();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(217);
					match(COMMA);
					setState(218);
					idn();
					}
					}
					setState(223);
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
		enterRule(_localctx, 34, RULE_ifc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__6);
			setState(227);
			expr(0);
			setState(228);
			match(T__7);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(229);
				instr();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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
		enterRule(_localctx, 36, RULE_ifter);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__8);
				setState(238);
				expr(0);
				setState(239);
				match(T__7);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
					{
					{
					setState(240);
					instr();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				ifter();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__9);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
					{
					{
					setState(249);
					instr();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(T__10);
				setState(256);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(T__10);
				setState(258);
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
		enterRule(_localctx, 38, RULE_forc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__11);
			setState(262);
			forexpr();
			setState(263);
			tofor();
			setState(264);
			step();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(265);
				instr();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
		enterRule(_localctx, 40, RULE_forexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ID);
			setState(274);
			forsuf();
			setState(275);
			match(EQUAL);
			setState(276);
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
		enterRule(_localctx, 42, RULE_forsuf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUFN:
				{
				setState(278);
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
		enterRule(_localctx, 44, RULE_tothis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 46, RULE_tofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__13);
			setState(285);
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
		enterRule(_localctx, 48, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(287);
				match(T__14);
				setState(288);
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
		enterRule(_localctx, 50, RULE_selectc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__15);
			setState(293);
			match(T__16);
			setState(294);
			idn();
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					cases();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(301);
			caselse();
			setState(302);
			match(T__10);
			setState(303);
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
		enterRule(_localctx, 52, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__16);
			setState(306);
			valuev();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(307);
				instr();
				}
				}
				setState(312);
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
		enterRule(_localctx, 54, RULE_caselse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(313);
				match(T__16);
				setState(314);
				match(T__9);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
					{
					{
					setState(315);
					instr();
					}
					}
					setState(320);
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
		enterRule(_localctx, 56, RULE_whilec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__17);
			setState(325);
			expr(0);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(326);
				instr();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
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
		enterRule(_localctx, 58, RULE_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__19);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(335);
				instr();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(T__20);
			setState(342);
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
		enterRule(_localctx, 60, RULE_tdoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(345);
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
		enterRule(_localctx, 62, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__22);
			setState(348);
			funidn();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(349);
				instr();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(T__10);
			setState(356);
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
		enterRule(_localctx, 64, RULE_funidn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ID);
			setState(359);
			sufix();
			setState(360);
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
		enterRule(_localctx, 66, RULE_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__23);
			setState(363);
			subidn();
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
		enterRule(_localctx, 68, RULE_subidn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ID);
			setState(374);
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
		enterRule(_localctx, 70, RULE_parfu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(376);
				match(PIZQ);
				setState(377);
				arg();
				setState(378);
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
		enterRule(_localctx, 72, RULE_arg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(383);
				match(ID);
				setState(384);
				sufix();
				}
				break;
			case 2:
				{
				setState(385);
				match(ID);
				setState(386);
				argpa();
				}
				break;
			}
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					match(COMMA);
					setState(390);
					arg();
					}
					} 
				}
				setState(395);
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
		enterRule(_localctx, 74, RULE_argpa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(PIZQ);
			setState(397);
			match(PDER);
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				{
				setState(398);
				match(T__2);
				setState(401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(399);
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
		enterRule(_localctx, 76, RULE_argn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
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
		enterRule(_localctx, 78, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(ID);
			setState(409);
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
		enterRule(_localctx, 80, RULE_callarg);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				expr(0);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(412);
					calln();
					}
					}
					setState(417);
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
		enterRule(_localctx, 82, RULE_calln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(COMMA);
			setState(422);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(425);
				match(PIZQ);
				setState(426);
				expr(0);
				setState(427);
				match(PDER);
				}
				break;
			case NEG:
			case MINUS:
				{
				setState(429);
				neg();
				setState(430);
				expr(9);
				}
				break;
			case STRING:
			case INTEGER:
			case LONG:
			case SINGLE:
			case DOUBLE:
			case ID:
				{
				setState(432);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(458);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(435);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(436);
						match(POT);
						setState(437);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(438);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(439);
						match(MULT);
						setState(440);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(441);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(442);
						addi();
						setState(443);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(445);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(446);
						match(REL);
						setState(447);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(448);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(449);
						equdi();
						setState(450);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(452);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(453);
						match(AND);
						setState(454);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(455);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(456);
						match(OR);
						setState(457);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(462);
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
		enterRule(_localctx, 86, RULE_equdi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
		enterRule(_localctx, 88, RULE_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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
		enterRule(_localctx, 90, RULE_addi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		public TerminalNode INTEGER() { return getToken(MyLanguageParser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(MyLanguageParser.LONG, 0); }
		public TerminalNode SINGLE() { return getToken(MyLanguageParser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(MyLanguageParser.DOUBLE, 0); }
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
		enterRule(_localctx, 92, RULE_valuev);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INTEGER) | (1L << LONG) | (1L << SINGLE) | (1L << DOUBLE))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case INTEGER:
			case LONG:
			case SINGLE:
			case DOUBLE:
				{
				setState(471);
				valuev();
				}
				break;
			case ID:
				{
				setState(472);
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
		public IdnContext idn() {
			return getRuleContext(IdnContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_idnp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u01e0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3|\n\3\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\5\5\5\u0086"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\6\3\6\3\6"+
		"\3\7\3\7\5\7\u0097\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\5\13\u00a7\n\13\3\f\3\f\3\f\3\f\7\f\u00ad\n\f\f\f\16\f\u00b0"+
		"\13\f\3\f\3\f\3\f\5\f\u00b5\n\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\7\17"+
		"\u00be\n\17\f\17\16\17\u00c1\13\17\3\17\7\17\u00c4\n\17\f\17\16\17\u00c7"+
		"\13\17\5\17\u00c9\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\7"+
		"\22\u00d4\n\22\f\22\16\22\u00d7\13\22\3\22\3\22\3\22\3\22\3\22\7\22\u00de"+
		"\n\22\f\22\16\22\u00e1\13\22\5\22\u00e3\n\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00e9\n\23\f\23\16\23\u00ec\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24"+
		"\u00f4\n\24\f\24\16\24\u00f7\13\24\3\24\3\24\3\24\3\24\7\24\u00fd\n\24"+
		"\f\24\16\24\u0100\13\24\3\24\3\24\3\24\3\24\5\24\u0106\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u010d\n\25\f\25\16\25\u0110\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u011b\n\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\5\32\u0125\n\32\3\33\3\33\3\33\3\33\7\33\u012b\n\33\f"+
		"\33\16\33\u012e\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0137\n"+
		"\34\f\34\16\34\u013a\13\34\3\35\3\35\3\35\7\35\u013f\n\35\f\35\16\35\u0142"+
		"\13\35\3\35\5\35\u0145\n\35\3\36\3\36\3\36\7\36\u014a\n\36\f\36\16\36"+
		"\u014d\13\36\3\36\3\36\3\37\3\37\7\37\u0153\n\37\f\37\16\37\u0156\13\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\7!\u0161\n!\f!\16!\u0164\13!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u0170\n#\f#\16#\u0173\13#\3#\3#\3#\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\5%\u0180\n%\3&\3&\3&\3&\5&\u0186\n&\3&\3&\7&\u018a"+
		"\n&\f&\16&\u018d\13&\3\'\3\'\3\'\3\'\3\'\5\'\u0194\n\'\3\'\5\'\u0197\n"+
		"\'\3(\3(\3)\3)\3)\3*\3*\7*\u01a0\n*\f*\16*\u01a3\13*\3*\5*\u01a6\n*\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01b4\n,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u01cd\n,\f,\16,\u01d0"+
		"\13,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\5\61\u01dc\n\61\3\62\3\62\3"+
		"\62\2\3V\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`b\2\7\4\2\24\24\30\30\3\2%&\3\2\37 \4\2  ##\3\2"+
		".\62\u01e8\2g\3\2\2\2\4{\3\2\2\2\6\177\3\2\2\2\b\u0085\3\2\2\2\n\u0087"+
		"\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u009b\3\2\2\2\22\u009f\3"+
		"\2\2\2\24\u00a6\3\2\2\2\26\u00b4\3\2\2\2\30\u00b6\3\2\2\2\32\u00b8\3\2"+
		"\2\2\34\u00c8\3\2\2\2\36\u00ca\3\2\2\2 \u00cd\3\2\2\2\"\u00e2\3\2\2\2"+
		"$\u00e4\3\2\2\2&\u0105\3\2\2\2(\u0107\3\2\2\2*\u0113\3\2\2\2,\u011a\3"+
		"\2\2\2.\u011c\3\2\2\2\60\u011e\3\2\2\2\62\u0124\3\2\2\2\64\u0126\3\2\2"+
		"\2\66\u0133\3\2\2\28\u0144\3\2\2\2:\u0146\3\2\2\2<\u0150\3\2\2\2>\u015a"+
		"\3\2\2\2@\u015d\3\2\2\2B\u0168\3\2\2\2D\u016c\3\2\2\2F\u0177\3\2\2\2H"+
		"\u017f\3\2\2\2J\u0185\3\2\2\2L\u018e\3\2\2\2N\u0198\3\2\2\2P\u019a\3\2"+
		"\2\2R\u01a5\3\2\2\2T\u01a7\3\2\2\2V\u01b3\3\2\2\2X\u01d1\3\2\2\2Z\u01d3"+
		"\3\2\2\2\\\u01d5\3\2\2\2^\u01d7\3\2\2\2`\u01db\3\2\2\2b\u01dd\3\2\2\2"+
		"df\5\4\3\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hm\3\2\2\2ig\3\2\2\2"+
		"jl\5\6\4\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2"+
		"pq\7\2\2\3q\3\3\2\2\2r|\5\b\5\2s|\5\32\16\2t|\5 \21\2u|\5$\23\2v|\5(\25"+
		"\2w|\5\64\33\2x|\5:\36\2y|\5<\37\2z|\5P)\2{r\3\2\2\2{s\3\2\2\2{t\3\2\2"+
		"\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\5\3\2"+
		"\2\2}\u0080\5@!\2~\u0080\5D#\2\177}\3\2\2\2\177~\3\2\2\2\u0080\7\3\2\2"+
		"\2\u0081\u0086\5\n\6\2\u0082\u0083\7\3\2\2\u0083\u0086\5\20\t\2\u0084"+
		"\u0086\5\20\t\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0084\3"+
		"\2\2\2\u0086\t\3\2\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5\f\7\2\u0089\u008e"+
		"\5\16\b\2\u008a\u008b\7*\2\2\u008b\u008d\5\16\b\2\u008c\u008a\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\5\2\2\u0092\u0093\7-\2\2\u0093"+
		"\13\3\2\2\2\u0094\u0097\7\6\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2"+
		"\2\u0096\u0095\3\2\2\2\u0097\r\3\2\2\2\u0098\u0099\7\63\2\2\u0099\u009a"+
		"\5\26\f\2\u009a\17\3\2\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7%\2\2\u009d"+
		"\u009e\5V,\2\u009e\21\3\2\2\2\u009f\u00a0\7\63\2\2\u00a0\u00a1\5\24\13"+
		"\2\u00a1\u00a2\5\26\f\2\u00a2\23\3\2\2\2\u00a3\u00a7\7,\2\2\u00a4\u00a7"+
		"\7+\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a9\7\35\2\2\u00a9\u00ae\5\30"+
		"\r\2\u00aa\u00ab\7*\2\2\u00ab\u00ad\5\30\r\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\27\3\2\2"+
		"\2\u00b6\u00b7\5V,\2\u00b7\31\3\2\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba"+
		"\5\34\17\2\u00ba\33\3\2\2\2\u00bb\u00bf\5V,\2\u00bc\u00be\5\36\20\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c9\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5\36\20\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c8"+
		"\u00c5\3\2\2\2\u00c9\35\3\2\2\2\u00ca\u00cb\7)\2\2\u00cb\u00cc\5V,\2\u00cc"+
		"\37\3\2\2\2\u00cd\u00ce\7\b\2\2\u00ce\u00cf\5\"\22\2\u00cf!\3\2\2\2\u00d0"+
		"\u00d5\5\22\n\2\u00d1\u00d2\7*\2\2\u00d2\u00d4\5\22\n\2\u00d3\u00d1\3"+
		"\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00e3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9\u00da\7*\2"+
		"\2\u00da\u00df\5\22\n\2\u00db\u00dc\7*\2\2\u00dc\u00de\5\22\n\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00d0\3\2\2\2\u00e2"+
		"\u00d8\3\2\2\2\u00e3#\3\2\2\2\u00e4\u00e5\7\t\2\2\u00e5\u00e6\5V,\2\u00e6"+
		"\u00ea\7\n\2\2\u00e7\u00e9\5\4\3\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\5&\24\2\u00ee%\3\2\2\2\u00ef\u00f0\7\13\2\2"+
		"\u00f0\u00f1\5V,\2\u00f1\u00f5\7\n\2\2\u00f2\u00f4\5\4\3\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\5&\24\2\u00f9\u0106\3\2"+
		"\2\2\u00fa\u00fe\7\f\2\2\u00fb\u00fd\5\4\3\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\r\2\2\u0102\u0106\7\t\2\2\u0103"+
		"\u0104\7\r\2\2\u0104\u0106\7\t\2\2\u0105\u00ef\3\2\2\2\u0105\u00fa\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\'\3\2\2\2\u0107\u0108\7\16\2\2\u0108\u0109"+
		"\5*\26\2\u0109\u010a\5\60\31\2\u010a\u010e\5\62\32\2\u010b\u010d\5\4\3"+
		"\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\17\2\2"+
		"\u0112)\3\2\2\2\u0113\u0114\7\63\2\2\u0114\u0115\5,\27\2\u0115\u0116\7"+
		"%\2\2\u0116\u0117\5.\30\2\u0117+\3\2\2\2\u0118\u011b\7,\2\2\u0119\u011b"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b-\3\2\2\2\u011c"+
		"\u011d\5V,\2\u011d/\3\2\2\2\u011e\u011f\7\20\2\2\u011f\u0120\5.\30\2\u0120"+
		"\61\3\2\2\2\u0121\u0122\7\21\2\2\u0122\u0125\5.\30\2\u0123\u0125\3\2\2"+
		"\2\u0124\u0121\3\2\2\2\u0124\u0123\3\2\2\2\u0125\63\3\2\2\2\u0126\u0127"+
		"\7\22\2\2\u0127\u0128\7\23\2\2\u0128\u012c\5\22\n\2\u0129\u012b\5\66\34"+
		"\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\58\35\2\u0130"+
		"\u0131\7\r\2\2\u0131\u0132\7\22\2\2\u0132\65\3\2\2\2\u0133\u0134\7\23"+
		"\2\2\u0134\u0138\5^\60\2\u0135\u0137\5\4\3\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\67\3\2\2"+
		"\2\u013a\u0138\3\2\2\2\u013b\u013c\7\23\2\2\u013c\u0140\7\f\2\2\u013d"+
		"\u013f\5\4\3\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0145\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0145\3\2\2\2\u0144\u013b\3\2\2\2\u0144\u0143\3\2\2\2\u01459\3\2\2\2"+
		"\u0146\u0147\7\24\2\2\u0147\u014b\5V,\2\u0148\u014a\5\4\3\2\u0149\u0148"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7\25\2\2\u014f;\3\2\2\2"+
		"\u0150\u0154\7\26\2\2\u0151\u0153\5\4\3\2\u0152\u0151\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7\27\2\2\u0158\u0159\5> \2\u0159=\3\2\2\2\u015a"+
		"\u015b\t\2\2\2\u015b\u015c\5V,\2\u015c?\3\2\2\2\u015d\u015e\7\31\2\2\u015e"+
		"\u0162\5B\"\2\u015f\u0161\5\4\3\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0166\7\r\2\2\u0166\u0167\7\31\2\2\u0167A\3\2\2\2"+
		"\u0168\u0169\7\63\2\2\u0169\u016a\5\24\13\2\u016a\u016b\5H%\2\u016bC\3"+
		"\2\2\2\u016c\u016d\7\32\2\2\u016d\u0171\5F$\2\u016e\u0170\5\4\3\2\u016f"+
		"\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7\r\2\2\u0175"+
		"\u0176\7\32\2\2\u0176E\3\2\2\2\u0177\u0178\7\63\2\2\u0178\u0179\5H%\2"+
		"\u0179G\3\2\2\2\u017a\u017b\7\35\2\2\u017b\u017c\5J&\2\u017c\u017d\7\36"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017a\3\2\2\2\u017f"+
		"\u017e\3\2\2\2\u0180I\3\2\2\2\u0181\u0182\7\63\2\2\u0182\u0186\5\24\13"+
		"\2\u0183\u0184\7\63\2\2\u0184\u0186\5L\'\2\u0185\u0181\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u018b\3\2\2\2\u0187\u0188\7*\2\2\u0188\u018a\5J&\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018cK\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\35\2\2\u018f\u0196"+
		"\7\36\2\2\u0190\u0193\7\5\2\2\u0191\u0194\7-\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0197\3\2"+
		"\2\2\u0196\u0190\3\2\2\2\u0196\u0195\3\2\2\2\u0197M\3\2\2\2\u0198\u0199"+
		"\7*\2\2\u0199O\3\2\2\2\u019a\u019b\7\63\2\2\u019b\u019c\5R*\2\u019cQ\3"+
		"\2\2\2\u019d\u01a1\5V,\2\u019e\u01a0\5T+\2\u019f\u019e\3\2\2\2\u01a0\u01a3"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u019d\3\2\2\2\u01a5\u01a4\3\2"+
		"\2\2\u01a6S\3\2\2\2\u01a7\u01a8\7*\2\2\u01a8\u01a9\5V,\2\u01a9U\3\2\2"+
		"\2\u01aa\u01ab\b,\1\2\u01ab\u01ac\7\35\2\2\u01ac\u01ad\5V,\2\u01ad\u01ae"+
		"\7\36\2\2\u01ae\u01b4\3\2\2\2\u01af\u01b0\5Z.\2\u01b0\u01b1\5V,\13\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b4\5`\61\2\u01b3\u01aa\3\2\2\2\u01b3\u01af\3\2"+
		"\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01ce\3\2\2\2\u01b5\u01b6\f\n\2\2\u01b6"+
		"\u01b7\7!\2\2\u01b7\u01cd\5V,\13\u01b8\u01b9\f\t\2\2\u01b9\u01ba\7\"\2"+
		"\2\u01ba\u01cd\5V,\n\u01bb\u01bc\f\b\2\2\u01bc\u01bd\5\\/\2\u01bd\u01be"+
		"\5V,\t\u01be\u01cd\3\2\2\2\u01bf\u01c0\f\7\2\2\u01c0\u01c1\7$\2\2\u01c1"+
		"\u01cd\5V,\b\u01c2\u01c3\f\6\2\2\u01c3\u01c4\5X-\2\u01c4\u01c5\5V,\7\u01c5"+
		"\u01cd\3\2\2\2\u01c6\u01c7\f\5\2\2\u01c7\u01c8\7\'\2\2\u01c8\u01cd\5V"+
		",\6\u01c9\u01ca\f\4\2\2\u01ca\u01cb\7(\2\2\u01cb\u01cd\5V,\5\u01cc\u01b5"+
		"\3\2\2\2\u01cc\u01b8\3\2\2\2\u01cc\u01bb\3\2\2\2\u01cc\u01bf\3\2\2\2\u01cc"+
		"\u01c2\3\2\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfW\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d1\u01d2\t\3\2\2\u01d2Y\3\2\2\2\u01d3\u01d4\t\4\2\2\u01d4"+
		"[\3\2\2\2\u01d5\u01d6\t\5\2\2\u01d6]\3\2\2\2\u01d7\u01d8\t\6\2\2\u01d8"+
		"_\3\2\2\2\u01d9\u01dc\5^\60\2\u01da\u01dc\5b\62\2\u01db\u01d9\3\2\2\2"+
		"\u01db\u01da\3\2\2\2\u01dca\3\2\2\2\u01dd\u01de\5\22\n\2\u01dec\3\2\2"+
		"\2,gm{\177\u0085\u008e\u0096\u00a6\u00ae\u00b4\u00bf\u00c5\u00c8\u00d5"+
		"\u00df\u00e2\u00ea\u00f5\u00fe\u0105\u010e\u011a\u0124\u012c\u0138\u0140"+
		"\u0144\u014b\u0154\u0162\u0171\u017f\u0185\u018b\u0193\u0196\u01a1\u01a5"+
		"\u01b3\u01cc\u01ce\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}