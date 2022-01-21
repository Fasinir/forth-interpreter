package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class UntilLoopStatement implements ForthStatement {
    private final ListOfStatements body;

    public UntilLoopStatement(ListOfStatements body) {
        this.body = body;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        do {
            body.execute(environment);
        } while (environment.pop() == 0);
    }

    @Override
    public String toString() {
        return "begin {" + body + '}';
    }
}
