package com.java.preparation;

import java.util.Deque;
import java.util.Locale;
import java.util.Map;

public class LRUCache<K, V> {
    private int capacity;
    private Map<K, V> map;
    private Deque<K> deque;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public V get(K key) {
        if(!map.containsKey(key)){
            return null;
        }
        deque.remove(key);
        deque.addFirst(key);
        return map.get(key);
    }

    public void put(K key, V value) {
        if(map.containsKey(key)){
            map.put(key,value);
            deque.remove(key);
            deque.addFirst(key);
            return;
        }
        if(map.size() >= capacity){
            K lastKey = deque.removeLast();
            map.remove(lastKey);
        }
        map.put(key,value);
        deque.addFirst(key);
    }

    @Override
    public String toString() {
        return "Cache: " + map.toString() + " | Order: " + deque.toString();
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache(3);
        lruCache.put(1, "A");
        lruCache.put(2, "B");
        lruCache.put(3, "C");

        lruCache.get(2);
        System.out.println(lruCache);
        lruCache.put(4, "D");
        System.out.println(lruCache);
    }
}
