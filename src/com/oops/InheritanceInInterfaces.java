package com.oops;

interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface{  //we also inherit interfaces to another interfaces using extends keyword
    void meth3();
    void meth4();
}

class MySampleClass implements ChildSampleInterface { //we inherit interfaces to a class using implements keyword
     public void meth3() {
        System.out.println("method 3");
    }
    public  void meth4(){
        System.out.println("method 4");
    }
    public void meth1() {
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");
    }
}

public class InheritanceInInterfaces {
   public static void main() {
       MySampleClass obj =new MySampleClass();
       obj.meth1();
       obj.meth2();
       obj.meth3();
       obj.meth4();
    }
}
