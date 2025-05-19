package com.incetutku.ocp.chapter01.initializing_variables;

import java.util.List;

public class DefiningInstanceAndClassVars {
    // Variables that are not local variables are defined either as instance variables or as class variables.
    // An "instance variable", often called a field, is a value defined within a specific instance of an object.
    // A "class variable" is one that is defined on the class level and shared among all instances of the class.
    // It can even be publicly accessible to classes outside the class and doesn't require an instance to use.
    // You can tell a variable is a class variable because it has the keyword "static" before it.

    // Instance and class variables do not require you to initialize them.
    // As soon as you declare these variables, they are given a default value.

    /**
     * Variable type                                Default initialization value
     * boolean                                      false
     * byte, short, int, long                       0
     * float, double                                0.0
     * char                                         '\u0000' (NUL)
     * All object references (everything else)      null
     */

    public static void main(String[] args) {
        Person p1 = new Person("Tutku", "Ince");
        Person p2 = new Person("Utku", "Ince");

        Sample sample = new Sample();
        System.out.println(sample); // Default Values
        System.out.println(Sample.lock);
    }
}

class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class Sample {
    int number;
    boolean isActive;
    long size;
    double square;
    String name;
    List<Integer> configs;
    static Object lock;
    char c;

    @Override
    public String toString() {
        return "Sample{" +
                "number=" + number +
                ", isActive=" + isActive +
                ", size=" + size +
                ", square=" + square +
                ", name='" + name + '\'' +
                ", configs=" + configs +
                ", c=" + c +
                '}';
    }
}