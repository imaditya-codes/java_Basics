package com.oops;
//Super keyword is used to access parent class members(variables, methods, and constructors) when they are hidden or  overridden in a subclass

//Variable calling using super keyword
class Parent{
    int num=1000;
    public Parent(){
        System.out.println("I am a parent class constructor!");
    }
}
class child extends Parent{
    int num=100;
    public child(){
        super();
        System.out.println("I am a child constructor!");
    }
    void display(){
        System.out.println("child num: "+num);
        System.out.println("Parent num: "+num);
        System.out.println("Parent num: "+super.num); //Here super helps in accessing parent class variable num
    }
}

//Method calling using super keyword
class Animal{
    void sound(){
        System.out.println("animal makes sound!");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks!");
    }
    void tellSound(){
        sound();
        super.sound(); //Here parent method  version is called using super if child class overrides it.
    }
}

//Constructor calling using super keyword
class Person{
    Person(String name){
        System.out.println("Person name: "+name);
    }
}
class Student extends Person{
    Student(String name){
        super(name);
        System.out.println("Student constructor called!");
    }
}

public class SuperKeyword {
    public static void main() {
      child obj= new child();
      obj.display();
      Dog d= new Dog();
      d.tellSound();
      Student s= new Student("Aditya");
    }
}
