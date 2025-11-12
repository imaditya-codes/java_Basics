package com.oops;

class C1{
    public int x=5;
    protected int y=65;
    int z=6;
    private int a=78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class AccessModifiersMain{
    public static void main(String[] args) {
        C1 obj= new C1();

        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        //System.out.println(obj.a); //a cannot be accessed because it is priavte anc cannot be access within the same package


    }
}
