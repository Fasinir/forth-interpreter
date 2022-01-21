package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class PrintSimpleStatement implements ForthStatement{

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        System.out.print(environment.pop());
    }

    @Override
    public String toString() {
        return ".";
    }
}
