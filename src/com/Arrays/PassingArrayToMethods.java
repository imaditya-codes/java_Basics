package com.Arrays;
import java.util.Arrays;

public class PassingArrayToMethods {
   public static void main(String[] args) {
        int[] arr={34,67,85,94,54};

        //Shallow copy
//      int[] x=arr;  // x is shallow copy of arr
//      x[0]=100;  //also change the value of arr[0]
//      System.out.println(arr[0]);

       //Deep copy
       int[] deep=Arrays.copyOf(arr,arr.length);  //making the deep copy
       deep[0]=26;  //values does not change in deep copy
       System.out.println(deep[0]);
       System.out.println(arr[0]);

       int[] brr=new int[arr.length];  //This also makes deep copy
       for (int i = 0; i <arr.length ; i++) {
           brr[i]=arr[i];
       }

//       System.out.println(arr[2]);
//       change(arr);  //passing arr to method change which is passed by reference not by value
//       System.out.println(arr[2]);
//    }
//
//   public static void change(int[] x) {
//        x[2]=99;
    }
}
