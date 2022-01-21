package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthConstant;
import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class ConstantStatement implements ForthStatement {
    private final String constantName;

    public ConstantStatement(String constantName) {
        this.constantName = constantName;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer val = environment.pop();
        environment.setEnv(constantName, new ForthConstant(val));
    }

    @Override
    public String toString() {
        return "constant " + constantName;
    }
}
