package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

import static pl.edu.agh.interpreter.main.statements.ComparisonExecutioner.calculateComparison;

/**
 * @author Filip Piwosz
 */
public class ComparisonStatement implements ForthStatement {
    private final String operation;

    public ComparisonStatement(String operation) {
        this.operation = operation;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer first = environment.pop();
        Integer second = environment.pop();
        Integer toPush = calculateComparison(operation, first, second) ? -1 : 0;
        environment.push(toPush);
    }

    @Override
    public String toString() {
        return operation;
    }
}
