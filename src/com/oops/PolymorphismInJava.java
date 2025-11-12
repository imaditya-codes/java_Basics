package com.oops;

//Polymorphism  means many forms.
//In java polymorphism allows different methods or objects to behave differently bases on the context
interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){  //Cannot be used directly by classes but if we put in default then this will work
        System.out.println("Good morning!");
    }
    default void recordIn4k(){   //we can implement methods in java by using default keyword
        greet(); //if the private methods  are put in default methods then they can be accessed easily.
        System.out.println("Recording in 4k!");
    }
}

interface Wifi2{
    String[] getNetworks();
    void connectNetwork(String network);
}

class CellPhone2{
    void callNumbers( int phonenumber){
        System.out.println("Calling "+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting to the number!");
    }
}

class SmartPhone2 extends CellPhone2 implements Camera2,Wifi2{
    //    public void recordIn4k(){
    //        System.out.println("Recording a large video in 4k"); // if we overrides default method then this will run on object calling
    //    }
    @Override
    public void takeSnap() {
        System.out.println("Taking a snap!");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording a video!");
    }
    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks!");
        String [] networkList={"aditya" , "realme" , "vivo5g"};
        return networkList;
    }
    @Override
    public void connectNetwork(String network) {
        System.out.println("connecting to network "+network);
    }
}

public class PolymorphismInJava {
   public static void main(String[] args) {
       Camera2 cam1= new SmartPhone2();
       //cam1.getNetworks();  //throws error because reference type is camera so the smartphone can be used as camera only if we use reference camera
       cam1.recordIn4k();  //all the camera methods can be accessed if reference type is camera
       cam1.recordVideo();
       cam1.takeSnap();
       SmartPhone2 s2=new SmartPhone2(); //now all methods can be accessed
       s2.callNumbers(76545);
       s2.getNetworks();
       s2.connectNetwork("aditya");
       s2.recordVideo();
       s2.takeSnap();
    }
}
//................................................................................................................
//................................................................................................................

