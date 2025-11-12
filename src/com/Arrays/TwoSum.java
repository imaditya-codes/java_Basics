package com.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 4, 9, 2};
        int[] result=twoSum(arr, 87);
        if (result!=null){
            System.out.println("Indices: ["+result[0]+" "+result[1]+"]");
        }
        else {
            System.out.println("No pair found!");
        }
    }
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;

    }
}
//    public static  boolean twoSum(int[] arr,int target){
//        int n=arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j=i+1; j < n; j++) {
//                if(arr[i]+arr[j]==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

