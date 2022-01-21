package pl.edu.agh.interpreter.main.environment;

import pl.edu.agh.interpreter.main.environment.forthexceptions.EnvironmentVariableNotFoundException;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthIllegalMemoryAccessException;
import pl.edu.agh.interpreter.main.environment.forthexceptions.StackUnderflowException;

/**
 * @author Filip Piwosz
 */
public class ForthEnvironment {
    private final ForthStack stack;
    private final EnvMap envMap;
    private final MemoryMap memoryMap;

    ForthEnvironment(ForthStack stack, MemoryMap memoryMap, EnvMap envMap) {
        this.stack = stack;
        this.memoryMap = memoryMap;
        this.envMap = envMap;
    }

    public void push(Integer integer) {
        stack.push(integer);
    }

    public Integer pop() throws StackUnderflowException {
        return stack.pop();
    }

    public void setEnv(String key, EnvironmentVariable value) {
        this.envMap.put(key, value);
    }

    public Integer allocateMemory() {
        return memoryMap.allocateMemory();
    }

    public void callEnv(String key) throws EnvironmentVariableNotFoundException {
        EnvironmentVariable environmentVariable = envMap.get(key);
        if (environmentVariable == null) {
            throw new EnvironmentVariableNotFoundException(key);
        }
        environmentVariable.call(this);
    }

    public void setVariable(Integer address, Integer value) throws ForthIllegalMemoryAccessException {
        memoryMap.setVariable(address, value);
    }

    public Integer getVariableValue(Integer address) throws ForthIllegalMemoryAccessException {
        return memoryMap.getVariableValue(address);
    }

    public void printStack() {
        System.out.println("STACK:");
        System.out.println(stack);
    }
}
