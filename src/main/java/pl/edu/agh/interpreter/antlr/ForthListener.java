// Generated from C:/Users/filip/Desktop/Java/miak_interpreter/src/main/antlr4/pl.edu.agh.interpreter\Forth.g4 by ANTLR 4.9.2
package pl.edu.agh.interpreter.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ForthParser}.
 */
public interface ForthListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ForthParser#forth}.
	 * @param ctx the parse tree
	 */
	void enterForth(ForthParser.ForthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#forth}.
	 * @param ctx the parse tree
	 */
	void exitForth(ForthParser.ForthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#zeroOrMoreStatement}.
	 * @param ctx the parse tree
	 */
	void enterZeroOrMoreStatement(ForthParser.ZeroOrMoreStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#zeroOrMoreStatement}.
	 * @param ctx the parse tree
	 */
	void exitZeroOrMoreStatement(ForthParser.ZeroOrMoreStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ForthParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ForthParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#regularStatement}.
	 * @param ctx the parse tree
	 */
	void enterRegularStatement(ForthParser.RegularStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#regularStatement}.
	 * @param ctx the parse tree
	 */
	void exitRegularStatement(ForthParser.RegularStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(ForthParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(ForthParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#printString}.
	 * @param ctx the parse tree
	 */
	void enterPrintString(ForthParser.PrintStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#printString}.
	 * @param ctx the parse tree
	 */
	void exitPrintString(ForthParser.PrintStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ForthParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ForthParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ForthParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ForthParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(ForthParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(ForthParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#ifRegular}.
	 * @param ctx the parse tree
	 */
	void enterIfRegular(ForthParser.IfRegularContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#ifRegular}.
	 * @param ctx the parse tree
	 */
	void exitIfRegular(ForthParser.IfRegularContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#defineFun}.
	 * @param ctx the parse tree
	 */
	void enterDefineFun(ForthParser.DefineFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#defineFun}.
	 * @param ctx the parse tree
	 */
	void exitDefineFun(ForthParser.DefineFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#doLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoLoop(ForthParser.DoLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#doLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoLoop(ForthParser.DoLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#untilLoop}.
	 * @param ctx the parse tree
	 */
	void enterUntilLoop(ForthParser.UntilLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#untilLoop}.
	 * @param ctx the parse tree
	 */
	void exitUntilLoop(ForthParser.UntilLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#callI}.
	 * @param ctx the parse tree
	 */
	void enterCallI(ForthParser.CallIContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#callI}.
	 * @param ctx the parse tree
	 */
	void exitCallI(ForthParser.CallIContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(ForthParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(ForthParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ForthParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ForthParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#modifyVar}.
	 * @param ctx the parse tree
	 */
	void enterModifyVar(ForthParser.ModifyVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#modifyVar}.
	 * @param ctx the parse tree
	 */
	void exitModifyVar(ForthParser.ModifyVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#stackManipulation}.
	 * @param ctx the parse tree
	 */
	void enterStackManipulation(ForthParser.StackManipulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#stackManipulation}.
	 * @param ctx the parse tree
	 */
	void exitStackManipulation(ForthParser.StackManipulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#printSimple}.
	 * @param ctx the parse tree
	 */
	void enterPrintSimple(ForthParser.PrintSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#printSimple}.
	 * @param ctx the parse tree
	 */
	void exitPrintSimple(ForthParser.PrintSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(ForthParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(ForthParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(ForthParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(ForthParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#printVar}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(ForthParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#printVar}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(ForthParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#zeroOrMoreRegularStatement}.
	 * @param ctx the parse tree
	 */
	void enterZeroOrMoreRegularStatement(ForthParser.ZeroOrMoreRegularStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#zeroOrMoreRegularStatement}.
	 * @param ctx the parse tree
	 */
	void exitZeroOrMoreRegularStatement(ForthParser.ZeroOrMoreRegularStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForthParser#callEnv}.
	 * @param ctx the parse tree
	 */
	void enterCallEnv(ForthParser.CallEnvContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForthParser#callEnv}.
	 * @param ctx the parse tree
	 */
	void exitCallEnv(ForthParser.CallEnvContext ctx);
}