package com.CollectionFramework.Map;

import java.util.*;

//LinkedHashMap is a subclass of hash map hence all methods of the hash map is also applicable here also

public class LinkedHashMapDemo {
   public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(12,0.3f,true);  //linked hashmap remembers the order in which the element is added into it
        //OR
        //another way of creating linked hashmap from the hashmap itself
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap<>(hashMap);


//        HashMap<String, Integer> hashMap = new HashMap<>();  //hashmap does not remember order in which the  element is added
//        hashMap.put("Orange", 10);
//        hashMap.put("Apple", 20);
//        hashMap.put("Guava", 30);
//
//        for(Map.Entry<String, Integer> entry:hashMap.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//        //for a gap line
//       System.out.println();

       linkedHashMap.put(10, "Orange");
       linkedHashMap.put(20, "Apple");
       linkedHashMap.put(30, "Guava");

       linkedHashMap.get(10);  // orange moves to the last while printing as access order ia true in the LinkedHashMap constructor
       linkedHashMap.get(20);

       for(Map.Entry<Integer, String> entry:linkedHashMap.entrySet()){
           System.out.println(entry.getKey()+" : "+entry.getValue());
       }
    }
}
