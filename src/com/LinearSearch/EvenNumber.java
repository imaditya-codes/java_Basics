package com.LinearSearch;
//find number of numbers with even number of digits in a given array
public class EvenNumber {
    public static void main(String[] args) {
        int[] nums= {34,124,9,1764,98,344564,2};
        int even=findNumbers(nums);
        System.out.println("Even number: "+even);

    }

    static int findNumbers(int[] arr){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check if a number contains even number of digits or not
    static boolean even(int num){
        int count=0; //function to count the number of digits
        while(num>0){
            count++;
            num=num/10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
