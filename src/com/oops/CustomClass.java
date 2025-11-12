package com.oops;

class Employee{
    int id;
    int salary;
    String name;

     public void printDetails(){
        System.out.println("my name is "+name);
        System.out.println("my id is "+id);
    }

    public void getSalary(){
        System.out.println("my salary is: "+salary);
    }
    public void setSalary(int sal){
         salary=sal;
    }
}

public class CustomClass {

    public static void main() {
        System.out.println("This is our custom class ");
        Employee aditya= new Employee(); // instantiating a new employee object

        //setting attributes
        aditya.id=12;
        aditya. name= "aditya kumar";
        aditya.setSalary(30000000);

        //printing the attributes
        System.out.println(aditya.id);
        System.out.println(aditya.name);
        System.out.println(aditya.salary);

        //OR
        aditya.printDetails();
        aditya.getSalary();

    }
}

