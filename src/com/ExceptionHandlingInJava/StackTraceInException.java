package com.ExceptionHandlingInJava;
import java.util.*;
public class StackTraceInException {
    public static void main(String[] args) {
        //level1();  //direct calling gives runtime error as there is an error in level 3, and it is propagating through the method calls
        try{
            level1();
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();  //METHOD TO PRINT THE STACK TRACE

            //OR

//            StackTraceElement[] stackTrace = e.getStackTrace(); //type e.getStackTrace then alt+enter
//            for (int i = 0; i < stackTrace.length; i++) {
//                System.out.println(stackTrace[i]);
//            }
        }
    }

    public static void level3() {
        int[] arr = new int[5];
        arr[5] = 10;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}
