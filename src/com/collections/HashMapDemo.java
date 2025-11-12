package com.collections;

import java.util.HashMap;
//Hashmap stores key value pairs
///does not maintain insertion order
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Aditya");
        map.put(2,"Aman");
        map.put(3,"Ankit");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.get(69));
        map.remove(2);
        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Aman"));

    }
}
