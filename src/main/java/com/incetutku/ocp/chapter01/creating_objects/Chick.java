package com.incetutku.ocp.chapter01.creating_objects;

public class Chick {
    int numEggs = 12;   // initialize on-line
    String name;

    public Chick() {
        name = "Duke";  // initialize in constructor
        System.out.println("in constructor");
    }

    public void Chick() {
        System.out.println("Just a method");    // Not a constructor
    }
}
