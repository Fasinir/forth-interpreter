package pl.edu.agh.interpreter.main;

import pl.edu.agh.interpreter.antlr.ForthBaseListener;
import pl.edu.agh.interpreter.antlr.ForthParser;
import pl.edu.agh.interpreter.main.statements.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * @author Filip Piwosz
 */
class MyListener extends ForthBaseListener {
    Deque<ListOfStatements> listOfStatementsDeque = new ArrayDeque<>();

    @Override
    public void enterForth(ForthParser.ForthContext ctx) {
        listOfStatementsDeque.addFirst(new ListOfStatements(new ArrayList<>()));
    }

    @Override
    public void enterPush(ForthParser.PushContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new PushStatement(parseInt(ctx.getText())));
    }

    @Override
    public void enterPrintString(ForthParser.PrintStringContext ctx) {
        String stringWithQuotations = ctx.STRING().getText();
        String toPrint = stringWithQuotations.substring(1, stringWithQuotations.length() - 1);
        ListOfStatements statements = peekTop();
        statements.addStatement(new PrintStringStatement(toPrint));
    }

    @Override
    public void enterConstant(ForthParser.ConstantContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new ConstantStatement(ctx.getText().split(" ")[1]));

    }

    @Override
    public void enterVariable(ForthParser.VariableContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new VariableStatement(ctx.getText().split(" ")[1]));
    }

    @Override
    public void exitIfElse(ForthParser.IfElseContext ctx) {
        ListOfStatements elseList = popFirst();
        ListOfStatements ifTrue = popFirst();
        ListOfStatements statements = peekTop();

        statements.addStatement(new IfElseStatement(ifTrue, elseList));
    }

    @Override
    public void exitIfRegular(ForthParser.IfRegularContext ctx) {
        ListOfStatements statements = popFirst();
        ListOfStatements upperStatements = peekTop();
        upperStatements.addStatement(new IfRegularStatement(statements));
    }

    @Override
    public void exitDefineFun(ForthParser.DefineFunContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        ListOfStatements body = popFirst();
        ListOfStatements statements = peekTop();
        statements.addStatement(new DefineFunStatement(body, name));
    }

    @Override
    public void exitDoLoop(ForthParser.DoLoopContext ctx) {
        ListOfStatements body = popFirst();
        ListOfStatements statements = peekTop();
        statements.addStatement(new DoLoopStatement(body));
    }

    @Override
    public void exitUntilLoop(ForthParser.UntilLoopContext ctx) {
        ListOfStatements body = popFirst();
        ListOfStatements statements = peekTop();
        statements.addStatement(new UntilLoopStatement(body));
    }

    @Override
    public void enterCallI(ForthParser.CallIContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new CallIStatement());
    }

    @Override
    public void enterArithmetic(ForthParser.ArithmeticContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new ArithmeticStatement(ctx.getText()));
    }

    @Override
    public void enterComparison(ForthParser.ComparisonContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new ComparisonStatement(ctx.getText()));
    }

    @Override
    public void enterModifyVar(ForthParser.ModifyVarContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new ModifyVarStatement(ctx.getText()));
    }

    @Override
    public void enterStackManipulation(ForthParser.StackManipulationContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new StackManipulationStatement(ctx.getText()));
    }

    @Override
    public void enterPrintSimple(ForthParser.PrintSimpleContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new PrintSimpleStatement());
    }

    @Override
    public void enterSet(ForthParser.SetContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new SetStatement());
    }

    @Override
    public void enterDeref(ForthParser.DerefContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new DerefStatement());
    }

    @Override
    public void enterPrintVar(ForthParser.PrintVarContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new PrintVarStatement());
    }

    @Override
    public void enterZeroOrMoreRegularStatement(ForthParser.ZeroOrMoreRegularStatementContext ctx) {
        listOfStatementsDeque.addFirst(new ListOfStatements(new ArrayList<>()));
    }

    @Override
    public void enterCallEnv(ForthParser.CallEnvContext ctx) {
        ListOfStatements statements = peekTop();
        statements.addStatement(new CallEnvironmentStatement(ctx.getText()));
    }

    public ListOfStatements getTopList() {
        return listOfStatementsDeque.pollLast();
    }

    private ListOfStatements peekTop() {
        return listOfStatementsDeque.peekFirst();
    }

    private ListOfStatements popFirst() {
        return listOfStatementsDeque.pop();
    }
}