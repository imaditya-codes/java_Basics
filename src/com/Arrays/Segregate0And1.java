package com.Arrays;

public class Segregate0And1 {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,0,1,0,1,1,1,0,0,0,1,1,0,1,0,1,0,1,0,0,1};
        segregate2(arr);
        System.out.print("Array after segregation: ");
        for(int element:arr){
            System.out.print(element+" ");
        }

    }
//    static void segregate(int[] arr){
//        int count=0;
//        for (int num:arr){
//            if (num==0){
//                count++;
//            }
//        }
//        for (int i = 0; i < count; i++) {
//            arr[i]=0;
//        }
//        for (int i = count; i <arr.length ; i++) {
//            arr[i]=1;
//
//        }
//    }
    //Another method
    static void segregate2(int[]arr){
        int n=arr.length;
        int i=0, j=n-1;
       while(i<j){
           if (arr[i]==0) i++;
           else if (arr[j]==1) {
               j--;
           }
           else {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
       }
    }
}
