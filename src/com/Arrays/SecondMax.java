package com.Arrays;

import java.util.Scanner;
//Find largest first
//now find the largest element except max
public class SecondMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();  //Taking size as input
        int[] arr = new int[n];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Printing maximum element in the array
        System.out.print("The Maximum element in the array is:");
        int max=arr[0];
        //or int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        //calculating second max
        System.out.print("The second Maximum element in the array is:");
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
