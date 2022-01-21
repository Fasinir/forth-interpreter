package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

/**
 * @author Filip Piwosz
 */
public class PrintStringStatement implements ForthStatement {
    private final String toPrint;

    public PrintStringStatement(String toPrint) {
        this.toPrint = toPrint;
    }

    @Override
    public void execute(ForthEnvironment environment) throws ForthException {
        System.out.print(toPrint);
    }

    @Override
    public String toString() {
        return ". \"" + toPrint + "\"";
    }
}
