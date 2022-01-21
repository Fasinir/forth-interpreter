package pl.edu.agh.interpreter.main.environment.forthexceptions;

/**
 * @author Filip Piwosz
 */
public class EnvironmentVariableNotFoundException extends ForthException {
    public EnvironmentVariableNotFoundException(String message) {
        super("Variable not found " + message);
    }
}
