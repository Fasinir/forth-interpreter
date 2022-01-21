package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.ForthFunction;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class DefineFunStatement implements ForthStatement {
    private final ListOfStatements statements;
    private final String functionName;

    public DefineFunStatement(ListOfStatements statements, String functionName) {
        this.statements = statements;
        this.functionName = functionName;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        environment.setEnv(functionName, new ForthFunction(statements));
    }

    @Override
    public String toString() {
        return ": " + functionName + " " + statements + " ;";
    }
}
