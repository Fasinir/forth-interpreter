package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

import java.util.ArrayList;

/**
 * @author Filip Piwosz
 */
public class ModifyVarStatement implements ForthStatement {
    private final String operation;

    public ModifyVarStatement(String operation) {
        this.operation = operation;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        ListOfStatements list = new ListOfStatements(new ArrayList<>());
        String op = operation.split("!")[0];
        list.addStatement(new StackManipulationStatement("dup"));
        list.addStatement(new DerefStatement());
        list.addStatement(new StackManipulationStatement("rot"));
        list.addStatement(new StackManipulationStatement("swap"));
        list.addStatement(new ArithmeticStatement(op));
        list.addStatement(new StackManipulationStatement("swap"));
        list.addStatement(new SetStatement());
        list.execute(environment);
    }

    @Override
    public String toString() {
        return operation;
    }
}
