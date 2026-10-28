package com.java.preparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K, V> extends LinkedHashMap<K,V> {
    private final int capacity;
    public LRU(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRU<Integer, String> cache = new LRU<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        cache.get(2);
        System.out.println(cache);
        cache.put(4, "D");
        System.out.println(cache);
    }
}
