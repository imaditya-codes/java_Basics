package com.oops;

//Constructors is a member function use to initialize an object while creating it
//In order to define our own constructor we define a method with same name as class name
//Runs automatically when you create an object of the class

class MyNewEmployee {
    private int id;
    private String name;

    //Constructor for this class--> name of constructor should be same as the name of the class
    //below are the three constructor with takes different arguments, and it is called constructor overloading

    public MyNewEmployee(){  //Non parameterized  constructor
        id=45;
        name="your_Name_Here";
    }
    public MyNewEmployee(String myName, int myId) {  //Parameterized constructor
        id = myId;
        name = myName;
    }
    public MyNewEmployee(MyNewEmployee obj){  //Copy constructor
        id=obj.id;
        name=obj.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class Constructors {
    public static void main(String[] args) {
        MyNewEmployee rahul= new MyNewEmployee();
       // MyNewEmployee rahul= new MyNewEmployee("Rahul",345);

        //MyNewEmployee nikhil= new MyNewEmployee(rahul);  //Copy constructor calling
        //rahul.setId(1800);
        //rahul.setName("Rahul");
        System.out.println(rahul.getId());
        System.out.println(rahul.getName());
        // System.out.println(nikhil.getName());


    }
}
