package com.multiThreading;
 class MyThread implements Runnable{
//     MyThread(String name){
//         System.out.println("Constructor of MyThread is "+name);
//     }
     public void run(){
         System.out.println("thank you");
     }
 }
public class ThreadPriority {
    public static void main(String[] args) {
        MyThread mth=new MyThread();
        mth.run();
    }
}
