// Generated from C:/Users/filip/Desktop/Java/miak_interpreter/src/main/antlr4/pl.edu.agh.interpreter\Forth.g4 by ANTLR 4.9.2
package pl.edu.agh.interpreter.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ForthParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ForthVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ForthParser#forth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForth(ForthParser.ForthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#zeroOrMoreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrMoreStatement(ForthParser.ZeroOrMoreStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ForthParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#regularStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularStatement(ForthParser.RegularStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(ForthParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#printString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(ForthParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ForthParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ForthParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(ForthParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#ifRegular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfRegular(ForthParser.IfRegularContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#defineFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineFun(ForthParser.DefineFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#doLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoLoop(ForthParser.DoLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#untilLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilLoop(ForthParser.UntilLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#callI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallI(ForthParser.CallIContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(ForthParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ForthParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#modifyVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyVar(ForthParser.ModifyVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#stackManipulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackManipulation(ForthParser.StackManipulationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#printSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSimple(ForthParser.PrintSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(ForthParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(ForthParser.DerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#printVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(ForthParser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#zeroOrMoreRegularStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrMoreRegularStatement(ForthParser.ZeroOrMoreRegularStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForthParser#callEnv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallEnv(ForthParser.CallEnvContext ctx);
}