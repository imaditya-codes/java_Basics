package com.basicsOfJava;
import java.util.Scanner;
// String is a sequence of characters . Java has a special support for strings
public class Strings_13 {
    public static void main(String[] args) {
        //String name= new String("Aditya"); // instantiation of a string
        /*String name= "ADITYA"; //can be written in this way also as data type ie special support
        System.out.println(name); */

        //Various way of printing in java
//        int a= 8;
//        float b= 5.678f;
//        System.out.printf(" The value of a is %d and value of b is %f ", a,b); //%d and %f are format specifier
//        System.out.format("\nThe value of a is %d and value of b is %f ", a,b);
//
        // Taking string as input
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter your string: ");
        String st= sc.next();
        System.out.println(st);
        String str= sc.nextLine();
        System.out.println(str);
    }
}
