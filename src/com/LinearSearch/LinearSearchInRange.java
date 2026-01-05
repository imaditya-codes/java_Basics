package com.LinearSearch;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] nums = {4, 6, 8, 12, 13, 56, 74, 98, 54};
        int index = linearSearch(nums, 98, 2, 6);
        System.out.println("found at index: " + index);
        //if element exist in the array
        int index2 = linearSearch(nums, 13, 2, 6);
        System.out.println("found at index: " + index);
    }

    //search in the array:return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        //this line will execute if none of the above return statements have executed

        return -1;

    }
}
