package com.CollectionFramework.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("A","B","C"));

        //All add methods in linked list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println(list);
        list.addFirst("goat");
        list.addLast("elephant");
        System.out.println(list);
        list.add(2,"zebra");
        System.out.println(list);
        list.addAll(list2);
        System.out.println(list);
        list.addAll(2,list2);
        System.out.println(list);

        //all remove methods in linked list
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeFirstOccurrence("B");
        list.removeLastOccurrence("B");
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

    }
}
