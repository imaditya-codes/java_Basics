package com.CollectionFramework.ComparatorInJava;

import java.util.*;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    String department;
    int salary;

    // Constructor
    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {

        // Compare salary (descending)
        if (this.salary != e.salary) {
            return e.salary - this.salary;
        }

        // If salary is same, compare name (ascending)
        return this.name.compareTo(e.name);
    }

    // For clean output
    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class ComparatorVsComparable {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(3, "Ravi", "IT", 70000));
        employees.add(new Employee(1, "Aman", "HR", 90000));
        employees.add(new Employee(4, "Aman", "IT", 90000));
        employees.add(new Employee(2, "Neha", "HR", 70000));
        employees.add(new Employee(5, "Zoya", "IT", 90000));


        System.out.println("Using Comparable (Natural Ordering):");
        Collections.sort(employees);   // uses compareTo()

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("Using Comparator (Custom Ordering):");

        Comparator<Employee> customComparator =
                Comparator.comparing((Employee e) -> e.department)    // Dept ASC
                        .thenComparing(
                                Comparator.comparingInt((Employee e) -> e.salary)
                                        .reversed()                    // Salary DESC
                        )
                        .thenComparingInt(e -> e.id);                 // ID ASC

        Collections.sort(employees, customComparator);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

