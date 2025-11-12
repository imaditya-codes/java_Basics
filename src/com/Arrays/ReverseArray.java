package com.Arrays;
//we use 2 pointer or 2 variable technique
//we will swap arr[i] and arr[j] until i<j
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={6,8,1,2,4,9};
        int i=0 , j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int element:arr){
            System.out.print(element+" ");
        }
    }
}
