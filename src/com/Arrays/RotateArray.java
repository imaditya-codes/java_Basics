package com.Arrays;

//Given an array and a rotate variable(r) by which array need to be rotated either left or right
//if r=3 then put the starting three elements in the end of the array
//e.g. if arr={1,2,3,4,5,6,7,} and d=3 then result should be {4,5,6,7,1,2,3}

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={2, 4, 5, 6, 7, 4,1};
        int n=arr.length;
        rotateArr(arr,3);
        System.out.print("Array after rotation is: ");
        for(int elements:arr){
            System.out.print(elements+" ");
        }
    }
    public static void rotateArr(int arr[],int d){
        int n=arr.length;
        int r=d%n;
       // For left rotation
        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        reverse(arr,0,n-1);

//        //For right rotation we use
//        reverse(arr,0,n-1);
//        reverse(arr,0,r-1);
//        reverse(arr,r,n-1);

    }
    static void reverse(int[] arr,int i, int j){
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;


        }
    }
}
