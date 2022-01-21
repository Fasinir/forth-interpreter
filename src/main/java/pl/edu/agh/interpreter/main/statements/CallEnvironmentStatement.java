package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class CallEnvironmentStatement implements ForthStatement {
    private final String environmentVariableName;

    public CallEnvironmentStatement(String environmentVariableName) {
        this.environmentVariableName = environmentVariableName;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        environment.callEnv(environmentVariableName);
    }

    @Override
    public String toString() {
        return environmentVariableName;
    }
}
