package com.CollectionFramework.Map;

import java.util.SortedMap;
import java.util.TreeMap;

//Sorted map is an interface that extends map and guarantees that entries are sorted based on key
//either in their natural ordering or by a specified comparator

public class SortedMapDemo {
  public  static void main(String[] args) {
    SortedMap<String,Integer> map = new TreeMap<>();
   // SortedMap<String,Integer> sortedMap = new TreeMap<>((a,b)->b.compareTo(a));  //this is also a constructor of sorted map which sort map key on the basis of comparator logic provided
    map.put("Vivek",98);
    map.put("Atul",93);
    map.put("Rahul",96);

    System.out.println(map);  //sorted in ascending order based on the name alphabetically

    // some more methods of sorted map
    System.out.println(map.firstEntry());
    System.out.println(map.lastEntry());
    System.out.println(map.firstKey());
    System.out.println(map.lastKey());
    System.out.println(map.headMap("Rahul")); //start to rahul (rahul not included)
    System.out.println(map.tailMap("Rahul")); //start from rahul
    }
}
