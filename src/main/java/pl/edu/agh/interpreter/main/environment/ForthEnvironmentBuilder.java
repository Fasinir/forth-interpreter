package pl.edu.agh.interpreter.main.environment;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Filip Piwosz
 */
public class ForthEnvironmentBuilder {
    private ForthStack stack;
    private MemoryMap memoryMap;
    private EnvMap envMap;

    public ForthEnvironmentBuilder withStack(Deque<Integer> stack) {
        this.stack = new ForthStack(stack);
        return this;
    }

    public ForthEnvironmentBuilder withMemoryMap(Map<Integer, Integer> map, int memoryStart) {
        this.memoryMap = new MemoryMap(map, memoryStart);
        return this;
    }

    public ForthEnvironmentBuilder withDefaultNameMap() {
        this.envMap = new EnvMap(new HashMap<>());
        envMap.put("i", new ForthConstant(0));
        return this;
    }

    public ForthEnvironment get() {
        return new ForthEnvironment(stack, memoryMap, envMap);
    }
}
