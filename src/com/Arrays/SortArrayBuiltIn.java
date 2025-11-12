package com.Arrays;
import java.util.Arrays;
public class SortArrayBuiltIn {
   public static void main(String[] args) {
       //sort-ascending order
       int[] arr={3,5,7,85,74,34,5,6,7,};
       System.out.print("Elements in the array are: ");
       print(arr);  //calling the print method
       System.out.print("sorted array: ");
       Arrays.sort(arr);  //Built in array sorting method
       print(arr);

    }
    //Method for printing elements of the array
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
