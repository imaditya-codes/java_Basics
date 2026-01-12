package com.ExceptionHandlingInJava;
import java.util.*;

//finally block contains the code which is always executed whether the execution is handled or not

public class FinallyKeywordDemo {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c=a/b;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is a finally block");
        }

    }
}
