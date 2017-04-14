// Generated from MyLanguage.g by ANTLR 4.6
package classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#qb64}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQb64(MyLanguageParser.Qb64Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(MyLanguageParser.InstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#functionsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionsub(MyLanguageParser.FunctionsubContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MyLanguageParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(MyLanguageParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#shared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared(MyLanguageParser.SharedContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#idim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdim(MyLanguageParser.IdimContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#sufdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSufdecl(MyLanguageParser.SufdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#idn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdn(MyLanguageParser.IdnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#sufix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSufix(MyLanguageParser.SufixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(MyLanguageParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#pos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPos(MyLanguageParser.PosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyLanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#toprintfst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToprintfst(MyLanguageParser.ToprintfstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#toprint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToprint(MyLanguageParser.ToprintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(MyLanguageParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#inpara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInpara(MyLanguageParser.InparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#ifc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfc(MyLanguageParser.IfcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#ifter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfter(MyLanguageParser.IfterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#forc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForc(MyLanguageParser.ForcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#forexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForexpr(MyLanguageParser.ForexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#forsuf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForsuf(MyLanguageParser.ForsufContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#tothis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTothis(MyLanguageParser.TothisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#tofor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTofor(MyLanguageParser.ToforContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(MyLanguageParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#selectc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectc(MyLanguageParser.SelectcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(MyLanguageParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#caselse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaselse(MyLanguageParser.CaselseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#whilec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilec(MyLanguageParser.WhilecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(MyLanguageParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#tdoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdoc(MyLanguageParser.TdocContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(MyLanguageParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#funidn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunidn(MyLanguageParser.FunidnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(MyLanguageParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#subidn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubidn(MyLanguageParser.SubidnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#parfu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParfu(MyLanguageParser.ParfuContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(MyLanguageParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#argpa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgpa(MyLanguageParser.ArgpaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#argn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgn(MyLanguageParser.ArgnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MyLanguageParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#callarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallarg(MyLanguageParser.CallargContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#calln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalln(MyLanguageParser.CallnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#equdi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqudi(MyLanguageParser.EqudiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(MyLanguageParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#addi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddi(MyLanguageParser.AddiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#valuev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuev(MyLanguageParser.ValuevContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MyLanguageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#idnp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdnp(MyLanguageParser.IdnpContext ctx);
}