package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

import static pl.edu.agh.interpreter.main.statements.ArithmeticExecutioner.calculateArithmetic;

/**
 * @author Filip Piwosz
 */
public class ArithmeticStatement implements ForthStatement {
    private final String operation;

    public ArithmeticStatement(String operation) {
        this.operation = operation;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer first = environment.pop();
        Integer second = environment.pop();
        Integer result = calculateArithmetic(operation, first, second);
        environment.push(result);
    }

    @Override
    public String toString() {
        return operation;
    }
}
