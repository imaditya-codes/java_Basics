package com.ExceptionHandlingInJava;
import java.util.*;
public class ExceptionHandlingDemo {
    static void main(String[] args) {
        int[] numerators={10,200,30,400};
        int[] denominators={5,20,0,20};

        //let's see ArrayIndexOutOfBoundException
        for (int i = 0; i < 10; i++) {  //numerators.lentgth = 4 only but we are giving 10 here
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            }
            catch (Exception e) {
                System.out.println(e);

            }
        }
        System.out.println("Good Job!");  //this  will be executed even after error is there as error is handled using try catch block
    }

    //we use try  catch block to handle exception in java
    public static int divide(int numerator, int denominator) {
        try {
            return numerator/denominator;
        }
        catch (ArithmeticException e) {  //instead of ArithmeticException, RuntimeException,Exception, or Throwable can be written as these are the parent class of subclass ArithmeticException
            System.out.println("Arithmetic Exception"+e);
            return -1;
        }
    }
}
