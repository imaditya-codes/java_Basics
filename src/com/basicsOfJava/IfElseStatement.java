package com.basicsOfJava;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int a=10;
        System.out.print("enter any natural number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num>a) {
            System.out.println("the entered number is greater than the a ");
        }
        else{
            System.out.println(" a is greater");
            }
        }
    }

