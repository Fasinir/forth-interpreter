package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class IfRegularStatement implements ForthStatement {
    private final ListOfStatements ifTrue;

    public IfRegularStatement(ListOfStatements ifTrue) {
        this.ifTrue = ifTrue;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer val = environment.pop();
        if (val == -1) {
            ifTrue.execute(environment);
        }
    }

    @Override
    public String toString() {
        return "if " + ifTrue + " then";
    }
}
