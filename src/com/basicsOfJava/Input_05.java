package com.basicsOfJava;
import java.util.Scanner;
public class Input_05 {
    public static void main(String[] args) {
        System.out.println(" Taking input from the user ");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a= sc.nextInt();
        System.out.print("Enter number 2: ");
        int b= sc.nextInt();
        int sum= a+b;
        System.out.print("The sum of the number is: ");
        System.out.println(sum);
        boolean b1= sc.hasNextInt(); // checks if the given input is integer or not
        System.out.println(b1);
        String str= sc.next(); // Takes only first word of a line as input if a line is provided as the input
        System.out.println(str);
        String str1= sc.nextLine(); //Takes full line as the input
        System.out.println(str1);
    }
}
