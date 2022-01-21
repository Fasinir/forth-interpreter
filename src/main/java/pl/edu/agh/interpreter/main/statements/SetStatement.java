package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class SetStatement implements ForthStatement{
    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer address = environment.pop();
        Integer value = environment.pop();
        environment.setVariable(address, value);
    }

    @Override
    public String toString() {
        return "!";
    }
}
