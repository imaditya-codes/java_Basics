package com.LinearSearch;
//code for linear search
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {4,6,8,12,13,56,74,98,54};
        int index=linearSearch(nums, 8);
        System.out.println("found at index: "+index);
        int element=linearSearch2(nums, 8);

        System.out.println("the element is :  "+element);


    }
    //search in the array:return the index if item found
    //otherwise if item not found return -1
   static int linearSearch(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        for (int index=0;index<nums.length;index++){
            if(nums[index]==target){
                return index;
            }
        }
        //this line will execute if none of the above return statements have executed

        return -1;

    }
    //if we want to return the element itself not the index
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //for loop for comparing
        for (int element : arr) {
           if (element == target) {
               return element;
           }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
