package com.oops;

// Abstract means existing only in thought or as an idea without concrete existence
// Abstract method is a method that is declared without an implementation(ie without a body)
// Abstract class are the classes that cannot be instantiated directly. it may contain abstract methods as well as concrete methods
// abstract void moveTo(double x, double y)
// You cannot make an object of abstract class
// A class which is not abstract is called as concrete class(normal with a body)
// If a child class is concrete then it must implement all abstract methods of the parent
// If child is also abstract then it can choose whether to implement the abstract class or not.

abstract class NewParent{
    public NewParent(){  //constructor
        System.out.println("I am a NewParent constructor!");
    }
    public void sayHello(){ //concrete methods
        System.out.println("Hello!");
    }
    abstract void greet();  //abstract methods
}


class NewChild extends NewParent{
    NewChild(){
        super();
        System.out.println("i  am a newchild constructor");
    }
    @Override
    public void greet(){  // because the NewChild class is concrete it must implement all abstract method of the parent
        System.out.println("Good morning!");
    }
}


abstract class NewChild2 extends NewParent{
    // because the NewChild2 class is abstract itself it can choose whether to implement abstract method of parent or not.
    public void welcome(){
        System.out.println("welcome to java!");
    }
}


public class AbstractInJava {
    public static void main(String[] args) {
       // NewParent p = new NewParent();  // throws error because an abstract class cannot be instantiated
        NewChild c1 = new NewChild();
        c1.greet();
        c1.sayHello();
    }
}
//....................................................................................................................................................
//....................................................................................................................................................

//ANOTHER EXAMPLE
//abstract class Vehicle{
//    String brand; //attributes
//    Vehicle(String brand){  //constructor
//        this.brand= brand;
//        System.out.println("vehicle constructor called for "+brand);
//    }
//    abstract void stop();
//    void start(){
//        System.out.println(brand + "is starting");
//    }
//}
//
//class Car extends Vehicle{
//    int wheels;
//    Car(String brand, int wheels){
//        super(brand);
//        this.wheels=wheels;
//        System.out.println(brand+" constructor called with "+wheels+ " wheels");
//    }
//    void stop(){
//        System.out.println(brand+" is stopping");
//    }
//    void start(){
//        System.out.println(brand+ " car is starting safely");
//    }
//}
//public class AbstractInJava {
//    public static void main(String[] args) {
//        Vehicle myCar= new Car("BMW",4);
//        myCar.start();
//        myCar.stop();
//    }
//}
