package com.Arrays;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9};
        int n = arr.length;
        int[] result= addOne(arr);
        for(int elements:arr){
            System.out.print(elements+" ");
        }
    }

    public static int[] addOne(int[] arr) {
        int n=arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] newNumber= new int[n+1];
        newNumber[0]=1;
        return newNumber;
    }
}