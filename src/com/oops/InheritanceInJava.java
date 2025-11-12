package com.oops;

//Inheritance is used to borrow properties and methods from an existing class like vehicle->car, Animal->dog etc.
//Inheritance in java is declared using extends keyword

class Base{
    int x;

    //constructor of base class
    public Base(){
        System.out.println("I am a base class constructor!");
    }

    public Base(int x){
        System.out.println("I am an overloaded constructor with value of a as: "+x);
    }

    public int getX(){
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor!");
    }
}

class Derived extends Base{
    int y;

    //constructor of derived class
    public Derived() {
        super(5); //If we want to call the constructor with parameters from the parent class we can use the super keyword.
        System.out.println("I am a derived class constructor!");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived class with value of y as: " +y);
    }
    public int getY(){
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived class and setting x now");
        this.y = y;
    }
}

public class InheritanceInJava {
    public static void main() {
        //Creating an object of base class
        Base b= new Base();
        b.setX(45);
        System.out.println(b.getX());

        //Creating an object of derived class
        Derived d= new Derived(34,35); //when an object of derived class is made it invokes the constructor of base class also and the constructor  of base class is executed first followed by the constructor of derived class
        d.setX(18);
        System.out.println(d.getX());
        d.setY(456);
        System.out.println(d.getY());
    }
}
