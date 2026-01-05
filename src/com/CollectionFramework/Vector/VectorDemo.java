package com.CollectionFramework.Vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer>  v1=new Vector<>();  //default constructor
        Vector<Integer>  v2=new Vector<>(13); //with initial capacity

        //without giving capacity increment as constructor the capacity becomes 2x initial capacity when the vector is full

        Vector<Integer>  v3=new Vector<>(14,5);  //with increment after initial capacity is full
        Vector<Integer>  v4=new Vector<>(Arrays.asList(1,2,3,4,5));  //another constructor of vector

        v1.add(1);
        v1.add(2);
        v1.add(3);
        System.out.println(v1.size()+" "+v1.capacity());
        v1.remove(1);
        System.out.println(v1.size()+" "+v1.capacity());

    }
}
