package com.Arrays;

public class MissingInArray {
    public static void main() {
        int[] arr={1,2,3,5,6,7,8,9,10};
        int missing=missingSolution(arr);
        System.out.println("Missing element is: "+missing);

    }
    static int missingSolution(int[] arr){
        long n=arr.length+1;  //1 to n tak numbers honge array me
        long sum=n*(n+1)/2; //long if n is very large
        long arrSum=0;
        for (int element:arr){
            arrSum+=element;
        }
        return (int)(sum-arrSum);
    }
}
