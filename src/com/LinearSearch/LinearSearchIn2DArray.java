package com.LinearSearch;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,5,6},
                {14,34,56,43},
                {10,20,30,41},
                {23,67,78,90,98}
        };
        int target = 20;
        int[] index=search(arr,target);
        System.out.println("found at index: "+ Arrays.toString(index));
    }
    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
