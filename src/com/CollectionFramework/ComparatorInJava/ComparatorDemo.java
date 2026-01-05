package com.CollectionFramework.ComparatorInJava;

import java.util.*;
class Student {
    int id;
    String name;
    double gpa;

    Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gpa;
    }
}

public class ComparatorDemo {

//    static class MyComparator implements Comparator<Integer> {
//        public int compare(Integer o1, Integer o2){
//            return o2-o1;
//        }
//    }
    public static void main(String[] args) {
//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> integers1 =new ArrayList<>(integers);
//        integers1.sort(new MyComparator());
//        System.out.println(integers1);
//
//        //we can also compare without making a new class but using lambda expression
//        integers1.sort((a,b)->{
//            return b-a;  //for descending order or write b.comparesTo(a)
//        });
//        System.out.println(integers1);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aditya", 8.5));
        students.add(new Student(2, "Brown", 7.6));
        students.add(new Student(3, "Clarke", 8.2));
        students.add(new Student(4, "Adam", 8.3));

        Comparator<Student> comp= Comparator.comparingDouble((Student student)->student.gpa).reversed().thenComparing(student->student.name);
        students.sort(comp);  //OR  Collections.sort(students,comp);
        System.out.println(students);


    }
}
