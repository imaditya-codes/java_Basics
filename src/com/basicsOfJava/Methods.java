package com.basicsOfJava;

// methods are the functions declared inside a class

public class Methods {
     int add(int a , int b){
        // we made methods static because main is static and a static methods can call only static method.
        // if it is  not static we have to make the class of it to access this method
        return a+b;
    }
    public static  void main(String[] args) {
//        int x,y;
//        x=34; y= 38;

        // method calling directly if static
//         int d= add(x,y);
//        int c= add(76,65);
//        System.out.println(c);
//        System.out.println(d);

        //object calling of method if method is not static
        Methods obj= new Methods();
        int sum= obj.add(56,76);
        System.out.println(sum);
    }
}
