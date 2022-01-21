package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class DerefStatement implements ForthStatement{
    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer address = environment.pop();
        Integer value = environment.getVariableValue(address);
        environment.push(value);
    }

    @Override
    public String toString() {
        return "@";
    }
}
