package pl.edu.agh.interpreter.main.environment.forthexceptions;

/**
 * @author Filip Piwosz
 */
public class ForthIllegalMemoryAccessException extends ForthException {
    public ForthIllegalMemoryAccessException() {
        super("Illegal memory access!");
    }

    public ForthIllegalMemoryAccessException(String message) {
        super(message);
    }
}
