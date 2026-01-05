package com.CollectionFramework.Map;
import java.util.*;

public class LRUCacheDemo<K,V> extends LinkedHashMap<K,V> {

    private int capacity;
    public LRUCacheDemo(int capacity) {
        super(capacity, 0.75f, true);  //parent class constructor ie constructor of linked hashmap
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCacheDemo<String,Integer> map = new LRUCacheDemo<>(3);
        map.put("Bob",99);
        map.put("Alice",89);
        map.put("Charlie",91);
        map.put("David",89);  //because this crosses the capacity of three the eldest entry ie bob is removed from the LRU cache
        map.get("Alice");
        map.get("Charlie");
        map.get("Alice");
        map.get("Charlie");
        map.get("David");
           System.out.println(map);


    }
}
