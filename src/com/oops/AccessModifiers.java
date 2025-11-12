package com.oops;

//Access Modifiers specifies where a property/method is accessible
//Access Modifiers are of 4 types in java ie private, default, protected, public

class MyEmployee{
   private int id;
   private String name;

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
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee lovable= new MyEmployee();

        //accessing private attributes without getters setters
        //lovable.id=234;
        //lovable.name="aditya";

        //Accessing attributes using getters and setters
        lovable.setId(234);
        lovable.setName("Virat");
        int id= lovable.getId();
        String name=lovable.getName();
        System.out.println("the name of lovable employee is: "+lovable.getName());
        System.out.println(lovable.getId());

    }
}
