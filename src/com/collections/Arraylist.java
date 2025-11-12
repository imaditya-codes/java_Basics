//Collection is simply an object that represents a group of objects,known as its elements
//collection framework provides a set of interfaces that help in managing group of objects.
//list,set,queue,deque,map are important ones.
//Arraylist can grow or shrink as elements are added or removed.

package com.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
    static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); //default constructor with a default initial capacity of 10
        ArrayList<Integer> list2 = new ArrayList<>(100); //with specified initial capacity
//        list1.add(23);
//        list1.add(34);
//        list1.add(100);
//        list1.remove(2);
//        list1.add(1, 45);
//        list1.set(1, 38);
//        System.out.println(list1); //can also be printed without loop because it uses two pointer
//        for (int i:list){
//           System.out.println(i);
//        }

//creating an Arraylist from another collection
List<String> list3= Arrays.asList("Apple","Banana","Orange");
ArrayList<String> listFromCollection=new ArrayList<>(list3);
        listFromCollection.add("cherry");
        System.out.println(listFromCollection);
//        System.out.println(list.contains(32));  //check if the array contains the provided elements or not
//        System.out.println(list.get(2));  //get returns elements
//        System.out.println(list.size());
//        for (int i:list){
//            System.out.println(i);
    }
}

