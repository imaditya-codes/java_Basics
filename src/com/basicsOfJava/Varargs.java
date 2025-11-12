package com.basicsOfJava;

public class Varargs {
    //without varargs methods overloading will be there
//       static int sum(int x , int y){
//        return x+y;
//    }
//    static int sum(int x, int y, int z){
//        return x+y+z;
//    }

    // using varargs we can give as many arguments we want
    static int sum1(int ...arr){
        //treated as int[] arr
        int result=0;
        for(int num: arr){
            result+= num;
        }
        return result;
    }
    public static void main() {
//        System.out.println("sum without using varargs");
//        System.out.println("sum of 4 and 5 is: "+sum(4,5));
        System.out.println("sum using varargs");
        System.out.println("sum of  4 and 5 is: "+sum1(4,5));
        System.out.println("sum of 75,87,94,28,78 and 84 is: "+sum1(75,87,94,28,78,84));
    }
}
