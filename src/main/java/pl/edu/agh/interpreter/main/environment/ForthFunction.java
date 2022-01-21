package pl.edu.agh.interpreter.main.environment;

import pl.edu.agh.interpreter.main.statements.ListOfStatements;

/**
 * @author Filip Piwosz
 */
public class ForthFunction implements EnvironmentVariable {
    private final ListOfStatements statements;

    public ForthFunction(ListOfStatements statements) {
        this.statements = statements;
    }

    @Override
    public void call(ForthEnvironment environment) {
        statements.execute(environment);
    }
}
