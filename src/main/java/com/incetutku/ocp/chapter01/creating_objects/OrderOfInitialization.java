package com.incetutku.ocp.chapter01.creating_objects;

public class OrderOfInitialization {
    public static void main(String[] args) {
        System.out.println("Main method started!");
        new B();
    }
}

class A {
    static String staticFieldA = initStaticFieldA();
    String instanceFieldA = initInstanceFieldA();

    static {
        System.out.println("A static block");
    }

    {
        System.out.println("A instance block");
    }

    public A() {
        System.out.println("A constructor");
    }

    static String initStaticFieldA() {
        System.out.println("A static field initialized");
        return "static-A";
    }

    String initInstanceFieldA() {
        System.out.println("A instance field initialized");
        return "instance-A";
    }
}

class B extends A {
    static String staticFieldB = initStaticFieldB();
    String instanceFieldB = initInstanceFieldB();

    static {
        System.out.println("B static block");
    }

    {
        System.out.println("B instance block");
    }

    public B() {
        System.out.println("B constructor");
    }

    static String initStaticFieldB() {
        System.out.println("B static field initialized");
        return "static-B";
    }

    String initInstanceFieldB() {
        System.out.println("B instance field initialized");
        return "instance-B";
    }
}