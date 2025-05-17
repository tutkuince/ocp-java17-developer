package com.incetutku.ocp.chapter01.declaring_variables;

public class DeclaringMultipleVariables {
    public static void main(String[] args) {
        String s1, s2;
        String s3 = "yes", s4 = "no";

        int i1, i2, i3 = 0;

        // double d1, double d2; -> double d1, d2 Java does not allow you to declare two different types in the same statement.

        // int num, String value;   DOES NOT COMPILE
        // This code doesn't compile because it tries to declare multiple variables of different types in the same statement.
    }
}
