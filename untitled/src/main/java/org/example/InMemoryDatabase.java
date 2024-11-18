package org.example;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase implements DatabaseOperations {
    private Map<Object, Object> storage = new HashMap<>();

    @Override
    public void save(Object data) {
        storage.put(data.hashCode(), data);
    }

    @Override
    public void delete(Object key) {
        storage.remove(key);
    }

    @Override
    public Object findByKey(Object key) {
        return storage.get(key);
    }
}