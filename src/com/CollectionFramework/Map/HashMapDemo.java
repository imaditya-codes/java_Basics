package com.CollectionFramework.Map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Aditya"); //PUT METHODS
        map.put(2,"Brown");
        map.put(3,"Charlie");
        map.put(3,"David");  //replaces charlie by david
        System.out.println(map);

        String student=map.get(2);
        System.out.println(student);
        System.out.println(map.get(5));  //returns null

        System.out.println(map.containsKey(3)); //returns true
        System.out.println(map.containsValue("Aditya")); //returns true
        System.out.println(map.containsValue("aman"));  //returns false

        //printing the values
        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }

        System.out.println(); //for  a space
        //0R

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());  //convert every value to upper case
        }
        System.out.println(map);  //after converting to upper case

        map.remove(2);
        map.remove(3,"aman"); //aman is not present hence returns false and nothing is removed from the map
        System.out.println(map);
        System.out.println(map.size());  //returns size of the map

//        map.clear();  //clears the whole map
//        System.out.println(map.isEmpty());

        //some more methods
        System.out.println(map.getOrDefault(1,"null"));  //if key is not there then it returns default value
        map.putIfAbsent(4,"Ankit"); //put it into the map if there is no key 4 present already
        System.out.println(map);
    }

}
