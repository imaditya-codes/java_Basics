package com.LinearSearch;

import java.util.Arrays;

public class LinearSearchInStrings {
    public static void main(String[] args) {
         String name="Aditya";
         char target='a';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(stringSearch(name,target));
    }
    static boolean stringSearch(String name, char target){
        if(name.length()==0){
            return false;
        }
        //for loop for comparing
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        //for each loop for comparing
//        for(char c:name.toCharArray()){
//            if(c==target){
//                return true;
//            }
//        }
        return false;
    }
}
