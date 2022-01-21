package pl.edu.agh.interpreter.main.environment;

import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthIllegalMemoryAccessException;

import java.util.Map;

/**
 * @author Filip Piwosz
 */
class MemoryMap {
    private int memoryCount;
    private Map<Integer, Integer> map;

    MemoryMap(Map<Integer, Integer> map, int startCount) {
        this.map = map;
        this.memoryCount = startCount;
    }

    Integer allocateMemory() {
        Integer memory = memoryCount;
        map.put(memory, 0);
        memoryCount++;
        return memory;
    }

    void setVariable(Integer address, Integer value) throws ForthIllegalMemoryAccessException {
        if (!map.containsKey(address)) {
            throw new ForthIllegalMemoryAccessException();
        }
        map.put(address, value);
    }

    Integer getVariableValue(Integer address) throws ForthIllegalMemoryAccessException {
        if (!map.containsKey(address)) {
            throw new ForthIllegalMemoryAccessException();
        }
        return map.get(address);
    }

}
