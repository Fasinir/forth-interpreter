package pl.edu.agh.interpreter.main.environment.forthexceptions;

/**
 * @author Filip Piwosz
 */
public class StackUnderflowException extends ForthException {
    public StackUnderflowException(){
        super("Stack underflow!");
    }
    public StackUnderflowException(String message) {
        super(message);
    }

}
