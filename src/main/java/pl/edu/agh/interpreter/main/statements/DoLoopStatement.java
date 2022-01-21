package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthConstant;
import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class DoLoopStatement implements ForthStatement {
    private final ListOfStatements body;

    public DoLoopStatement(ListOfStatements body) {
        this.body = body;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        Integer start = environment.pop();
        Integer finish = environment.pop();

        environment.setEnv("i", new ForthConstant(start));
        while (iIsLessThanFinish(environment, finish)) {
            body.execute(environment);
            incrementI(environment);
        }

    }

    private boolean iIsLessThanFinish(ForthEnvironment environment, Integer finish) throws ForthException {
        environment.callEnv("i");
        return environment.pop() < finish;
    }

    private void incrementI(ForthEnvironment environment) throws ForthException {
        environment.callEnv("i");
        Integer old = environment.pop();
        environment.setEnv("i", new ForthConstant(old + 1));
    }

    @Override
    public String toString() {
        return "do" + body.toString() + "loop";
    }
}
