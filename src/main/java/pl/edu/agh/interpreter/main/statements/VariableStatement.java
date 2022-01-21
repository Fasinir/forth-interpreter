package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.ForthVariable;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class VariableStatement implements ForthStatement {
    private final String variableName;

    public VariableStatement(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer address = environment.allocateMemory();
        environment.setEnv(variableName, new ForthVariable(address));
    }

    @Override
    public String toString() {
        return "variable " + variableName;
    }
}
