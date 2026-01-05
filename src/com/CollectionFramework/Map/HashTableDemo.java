package com.CollectionFramework.Map;

import java.util.Hashtable;
//Hashtable implements map so all map methods are also valid here

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        //Hashtable is synchronized  ie thread safe
        //no null key or value
        //legacy class, ConcurrentHashMap
        //slower than Hashmap
        //all methods are synchronized

        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Orange");
        System.out.println(hashtable);
        System.out.println(hashtable.get(2));
    }
}
