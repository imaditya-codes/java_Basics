package com.basicsOfJava;

public class MethodOverloading {
    static void sum(){
        System.out.println("we are calculating sum here");
    }
    static int sum(int x, int y){
        return x+y;
    }
    static void change(int x){
        x=45;
    }
    static void changeArr(int[] arr){
        arr[0]= 90;
    }
     void tellJoke(){
        System.out.println("I invented a new word!\n" + "plagiarism!");
    }


    public static void main(String[] args) {
//         tellJoke();// static method se aap static method bina object banaye call kar sakte hai nhi toh object banana padega

//        MethodOverloading obj= new MethodOverloading(); // if we don't use static method
//        obj.tellJoke();

        //changing the integer
        //int x= 98;
        //change(x);
        //System.out.println("The value of x after changing is: " +x); // from the output we can say that the value of x is not changed showing that only copy is passed to the methods

        //Let's try changing the array elements
        //int[] marks= {98,97,95,78,67,56,};
       // changeArr(marks);
       // System.out.println("The value of marks[0] after changing is: "+marks[0]); // here it is changed because marks is a reference and the address is passed and hence it is passed by reference.

        //METHODS OVERLOADING means two or more methods can have same name but different parameters. such methods are called overloaded methods.
        sum();
        int z=sum(543,456);
        System.out.println("The sum is: "+z);
    }

}

