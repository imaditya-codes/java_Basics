package com.oops;

// Overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass
// To achieve runtime polymorphism(dynamic method dispatch)
// Dynamic method dispatch is the process in java by which the call to an overridden method is resolved at runtime instead of
// compile time, based on the actual object that reference variable points to

class Shape{
  public Shape(){
       System.out.println("I am shape constructor!");
    }
    void draw(){
        System.out.println("Drawing a generic shape");
    }
    void area(){
        System.out.println("calculating area of shape");
    }
}

class Circle extends Shape{
    public  Circle(){  // constructor of child class
        super(); //calling the parent constructor
        System.out.println("i am a circle constructor!");
    }
    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing a circle");
    }
    @Override
    void area(){
        super.area();
        System.out.println("area of circle is pi*r*r");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a rectangle");
    }
    @Override
    void area(){
        System.out.println("area of rectangle is length * breadth");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        //reference of parent , object of child -> dynamic method dispatch
        Circle s1= new Circle(); //shape reference and circle object
        s1.draw();
        s1.area();
        System.out.println("............................................................");
        Shape s2=new Rectangle();
        s2.draw();
        s2.area();
    }
}