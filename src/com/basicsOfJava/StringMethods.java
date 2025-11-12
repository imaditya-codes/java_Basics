package com.basicsOfJava;

public class StringMethods{
    public static void main(String[] args) {

        String name= "Aditya";
//        System.out.println(name.length());
//        System.out.println(name.toLowerCase()); // replace capital letter of a string with small letter
//        System.out.println(name.toUpperCase()); // replace small letter of a string with capital letter

//        String nonTrimmedString= "       aditya       ";
//        System.out.println(nonTrimmedString);
//        String trimmedString= nonTrimmedString.trim(); // trim() removes all the whitespaces
//        System.out.println(trimmedString);

//        System.out.println(name.substring(3)); // no end index goes till last
//        System.out.println(name.substring(1,6)); // 4 is the end index but 4 is not included ie excluded but 1 is included
//
//        System.out.println(name.replace('i','d')); // replace all i present with d
//        System.out.println(name.replace("ditya","man"));
//
//        System.out.println(name.startsWith("A"));
//        System.out.println(name.startsWith("Ad"));
//
//        System.out.println(name.endsWith("y"));
//        System.out.println(name.endsWith("ya"));
//
//        System.out.println(name.charAt(4)); //returns character at 4

       // System.out.println(name.indexOf("tya"));
       // System.out.println(name.indexOf("t",3));
       // System.out.println(name.lastIndexOf("y"));
        System.out.println(name.lastIndexOf("t",5));

        System.out.println(name.equals("Aditya"));
        System.out.println(name.equalsIgnoreCase("aditya")); // returns true if two strings are equal ignoring the case of characters
    }
}
