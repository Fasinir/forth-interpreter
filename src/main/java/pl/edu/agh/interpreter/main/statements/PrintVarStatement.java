package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class PrintVarStatement implements ForthStatement {
    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        DerefStatement statement = new DerefStatement();
        statement.execute(environment);

        PrintSimpleStatement printSimpleStatement = new PrintSimpleStatement();
        printSimpleStatement.execute(environment);
    }
}
