package pl.edu.agh.interpreter.main.environment;

/**
 * @author Filip Piwosz
 */
public class ForthVariable implements EnvironmentVariable {
    private final Integer address;

    public ForthVariable(Integer address) {
        this.address = address;
    }

    @Override
    public void call(ForthEnvironment environment) {
        environment.push(address);
    }
}
