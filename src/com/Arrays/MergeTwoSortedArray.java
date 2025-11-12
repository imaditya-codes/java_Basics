package com.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={2,5,6,9,20};
        int[] arr2={1,3,4,5,7,8};
        int [] sortedArray=new int[arr1.length+arr2.length];
        for (int elements:sortedArray)
            System.out.print(elements+" ");
        merge(sortedArray,arr1,arr2);
        System.out.println();
        for (int elements:sortedArray)
            System.out.print(elements+" ");

    }

    public  static void merge(int[] sortedArray, int[] arr1, int[] arr2) {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                sortedArray[k]=arr1[i];
                i++;
                k++;
            }
            else {
                sortedArray[k]=arr2[j];
                j++;
                k++;
            }
        }
        if (i == arr1.length) {//arr1 khatam and arr2 ke elements bachche hue hai
            while(j<arr2.length){
                sortedArray[k]=arr2[j];
                j++;
                k++;
            }
        }
        else { //else means if j==arr2.length
            while(i<arr1.length){
                sortedArray[k]=arr1[i];
                i++;
                k++;
            }
        }
    }
}
