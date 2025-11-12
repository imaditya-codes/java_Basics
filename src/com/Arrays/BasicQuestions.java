package com.Arrays;

import java.util.Scanner;
//1.printing only negative elements of an array
//2.sum and product of elements of an array
//3.Largest element in the array
//4.Minimum element in the array

public class BasicQuestions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Question 1. solution
//        System.out.print("Enter size of array: ");
//        int n=sc.nextInt();  //Taking size as input
//        int[] num = new int[n];
//
//        System.out.print("Enter elements of array: ");
//        for (int i = 0; i < num.length; i++) {
//            num[i] = sc.nextInt();
//        }
//        //Printing negative elements of array only
//        System.out.print("The negative elements of array are:");
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] < 0) {
//                System.out.print(num[i] + " ");
//            }
//        }
        //Question 2.solution
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();  //Taking size as input
        int[] num = new int[n];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print("The sum of elements of array are:");
        //Calculating sum
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
            }
        System.out.println(sum);
        //Calculating product
        System.out.print("The product of elements of array are:");
        int product=1;
        for (int i = 0; i < num.length; i++) {
            product*=num[i];
        }
        System.out.println(product);
        }

        //question.3 solution
//        System.out.print("Enter size of array: ");
//        int n=sc.nextInt();  //Taking size as input
//        int[] arr = new int[n];
//
//        System.out.print("Enter elements of array: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        //Printing maximum element in the array
//        System.out.print("The Maximum element in the array is:");
//        int max=arr[0];
//        //or int max=Integer.MIN_VALUE;
//        for (int i = 0; i <arr.length; i++) {
//            if (arr[i]>max){  //for question 4 minimum elements simply replace > with <
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
    }

