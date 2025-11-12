package com.multiThreading;
// constructors in thread class

class MyTask implements Runnable {
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyTask task= new MyTask(); //

        //The 4 main type of constructor present in threading is:

        //1.Default constructor:Thread()
        Thread t1= new Thread(); //No task and no name
        t1.start(); // It won't run anything because no task is given
        System.out.println("t1 name: "+t1.getName());

        //2.Thread(String name)
        Thread t2= new Thread("aditya"); //name but no task
        t2.start();
        System.out.println("t2 name: "+t2.getName());

        //3.Thread(Runnable target
        Thread t3= new Thread(task); // task but default name
        t3.start();
        System.out.println("t1 name: "+t3.getName());

        //4.Thread(Runnable target,String name)
        Thread t4=new Thread(task,"customNamedThread"); //Both name and task
        t4.start();
        System.out.println("t4 name: "+t4.getName());

//        System.out.println("The id of the thread t1 is: "+t1.getId()); //Method of getting id
//        System.out.println("The name of the thread t2 is: "+t2.getName());//Method of getting name.
//        System.out.println("The id of the thread t3 is: "+t3.getId());
//        System.out.println("The name of the thread t4 is: "+t4.getName());
    }
}



