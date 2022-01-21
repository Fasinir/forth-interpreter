package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class CallIStatement implements ForthStatement {
    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        environment.callEnv("i");
    }

    @Override
    public String toString() {
        return "i";
    }
}
