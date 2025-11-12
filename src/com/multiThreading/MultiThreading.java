package com.multiThreading;
//multiprocessing and multithreading both are used to achieve multitasking.
//Threads used shared memory area
//Threads implies faster content switching.
//A thread is lightweight whereas a process is a heavyweight.
// threads can be created in two ways

//1. Creating Thread using extending thread class

//class MyThread extends Thread{    //class name can be different also like workersThread etc
//    public void run(){           //but run method should  always be there because JVM search for this method
//        int i=0;
//        while(i<=10){
//            System.out.println("I am cooking");
//            System.out.println("I am happy!");
//            i++;
//        }
//    }
//}
//
//class MyThread2 extends Thread{
//    public void run(){
//        int i=0;
//        while(i<=10){
//            System.out.println("I am chatting with friend!");
//            System.out.println("I am sad!");
//            i++;
//        }
//    }
//}
//public class MultiThreading {
//    public static void main(String[] args) {
//            MyThread t1= new MyThread();
//            MyThread2 t2= new MyThread2();
//            t1.start();      //start will call run methods automatically ,don't or never write t1.run();
//            t2.start();
//    }
//}

//2.creating threads By implementing runnable class
class MyThreadRunnable1 implements Runnable{
    public void run() {
        while(true) {
            System.out.println("I am runnable thread 1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run() {
        while (true) {
            System.out.println("I am runnable thread 2");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1= new MyThreadRunnable1();
        Thread gun1= new Thread(bullet1);  // give runnable to thread
        MyThreadRunnable2 bullet2= new MyThreadRunnable2();
        Thread gun2= new Thread(bullet2);
//        gun1.setPriority(Thread.MAX_PRIORITY);
//        gun2.setPriority(Thread.MIN_PRIORITY);
        gun1.start(); //don't or never write gun1.run();
        gun2.start();
    }
}

//Lifecycle of a thread
