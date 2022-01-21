package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class IfElseStatement implements ForthStatement {
    private final ListOfStatements ifTrue;
    private final ListOfStatements elseThen;

    public IfElseStatement(ListOfStatements ifTrue, ListOfStatements elseThen) {
        this.ifTrue = ifTrue;
        this.elseThen = elseThen;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer value = environment.pop();
        if (value == -1) {
            ifTrue.execute(environment);
        } else if (value == 0) {
            elseThen.execute(environment);
        }
    }

    @Override
    public String toString() {
        return "if " + ifTrue.toString() + " else " + elseThen.toString() + " then";
    }
}
