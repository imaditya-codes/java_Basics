package com.CollectionFramework.Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,String> map = new TreeMap<Integer,String>();
        map.put(1,"one");
        map.put(4,"four");
        map.put(5,"five");
        map.put(3,"three");
        map.put(2,"two");
        System.out.println(map);  //sorted list
        System.out.println(map.lowerKey(3)); //return element strictly less than given key
    }
}
