package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;

/**
 * @author Filip Piwosz
 */
public class PushStatement implements ForthStatement {
    private final Integer integer;

    public PushStatement(Integer integer) {
        this.integer = integer;
    }

    @Override
    public void execute(ForthEnvironment environment) {
        environment.push(integer);
    }

    @Override
    public String toString() {
        return "Push " + integer;
    }
}
