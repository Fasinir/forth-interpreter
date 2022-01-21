package pl.edu.agh.interpreter.main.environment;

/**
 * @author Filip Piwosz
 */
public class ForthConstant implements EnvironmentVariable {
    private final Integer value;

    public ForthConstant(Integer value) {
        this.value = value;
    }

    @Override
    public void call(ForthEnvironment environment) {
        environment.push(value);
    }
}
