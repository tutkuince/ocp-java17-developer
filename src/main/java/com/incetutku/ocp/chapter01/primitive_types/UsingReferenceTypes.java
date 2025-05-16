package com.incetutku.ocp.chapter01.primitive_types;

public class UsingReferenceTypes {
    public static void main(String[] args) {
        String greeting = new String("Hello");

        String anotherObject = "another object";

        greeting = anotherObject;

        System.out.println(greeting);
    }
}
