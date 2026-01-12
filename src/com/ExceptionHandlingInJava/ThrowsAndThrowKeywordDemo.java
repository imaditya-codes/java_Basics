package com.ExceptionHandlingInJava;
import java.util.*;

public class ThrowsAndThrowKeywordDemo {
    public static void main(String[] args) {
        //using divide so we have to handle the arithmetic exception throws by the divide method
        try {
//            int c = divide(6, 0);
//            System.out.println(c);

            double ar= area(-2);
            System.out.println(ar);
        }
        catch (Exception e) {
            System.out.println("exception");
            System.out.println(e.getMessage());
        }


    }
   public static int divide(int a, int b) throws ArithmeticException {
        //if a method throws(using throws keyword) any exception then it is the responsibility of the user to handle such exception using try block who is using that method
        int result = a / b;
        return result;
    }

    public static double area(int r) throws NegativeRadiusException {
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    //creating custom exception class
    static class NegativeRadiusException extends Exception {

        @Override
        public String getMessage() {
            return "Radius cannot be negative!";
        }

        @Override
        public String toString() {
            return "you have entered a negative radius!";
        }
    }

}
