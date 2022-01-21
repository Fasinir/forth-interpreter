package pl.edu.agh.interpreter.main.environment;

import java.util.Map;

/**
 * @author Filip Piwosz
 */
class EnvMap {
    private Map<String, EnvironmentVariable> map;

    EnvMap(Map<String, EnvironmentVariable> map) {
        this.map = map;
    }

    void put(String key, EnvironmentVariable value) {
        map.put(key, value);
    }

    EnvironmentVariable get(String key) {
        return map.get(key);
    }
}
