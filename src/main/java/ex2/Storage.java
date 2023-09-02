package ex2;

import java.util.HashMap;
import java.util.Map;

public class Storage<K, V> {
    private Map<K, V> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public void put(K key, V value) {
        storage.put(key, value);
    }

    public V get(K key) {
        return storage.get(key);
    }

    public boolean containsKey(K key) {
        return storage.containsKey(key);
    }

    public void remove(K key) {
        storage.remove(key);
    }

    public void clear() {
        storage.clear();
    }
}