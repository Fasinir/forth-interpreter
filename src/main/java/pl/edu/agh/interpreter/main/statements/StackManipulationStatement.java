package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;
import pl.edu.agh.interpreter.main.environment.forthexceptions.StackUnderflowException;

/**
 * @author Filip Piwosz
 */
public class StackManipulationStatement implements ForthStatement {
    private final String operation;

    public StackManipulationStatement(String operation) {
        this.operation = operation;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        switch (operation) {
            case "and" -> and(environment);

            case "or" -> or(environment);

            case "invert" -> invert(environment);

            case "dup" -> dup(environment);

            case "drop" -> drop(environment);

            case "swap" -> swap(environment);

            case "over" -> over(environment);

            case "rot" -> rot(environment);

            case "emit" -> emit(environment);

            case "cr" -> cr(environment);

        }
    }

    private void and(ForthEnvironment environment) throws StackUnderflowException {
        Integer first = environment.pop();
        Integer second = environment.pop();

        if (first != 0 && second != 0) {
            environment.push(-1);
        } else {
            environment.push(0);
        }
    }

    private void or(ForthEnvironment environment) throws ForthException {
        Integer first = environment.pop();
        Integer second = environment.pop();
        if (first == 0 && second == 0) {
            environment.push(0);
        } else {
            environment.push(-1);
        }
    }

    private void invert(ForthEnvironment environment) throws StackUnderflowException {
        Integer first = environment.pop();
        if (first == 0) {
            environment.push(-1);
        } else {
            environment.push(0);
        }
    }

    private void dup(ForthEnvironment environment) throws StackUnderflowException {
        Integer first = environment.pop();
        environment.push(first);
        environment.push(first);
    }

    private void drop(ForthEnvironment environment) throws StackUnderflowException {
        environment.pop();
    }

    private void swap(ForthEnvironment environment) throws StackUnderflowException {
        Integer first = environment.pop();
        Integer second = environment.pop();

        environment.push(first);
        environment.push(second);
    }

    private void over(ForthEnvironment environment) throws StackUnderflowException {
        Integer first = environment.pop();
        Integer second = environment.pop();

        environment.push(second);
        environment.push(first);
        environment.push(second);
    }

    private void rot(ForthEnvironment environment) throws ForthException {
        Integer first = environment.pop();
        Integer second = environment.pop();
        Integer third = environment.pop();

        environment.push(second);
        environment.push(first);
        environment.push(third);
    }

    private void emit(ForthEnvironment environment) throws ForthException {
        Integer first = environment.pop();
        System.out.print((char) first.intValue());
    }

    private void cr(ForthEnvironment environment) throws ForthException {
        System.out.println();
    }

    @Override
    public String toString() {
        return operation;
    }
}
