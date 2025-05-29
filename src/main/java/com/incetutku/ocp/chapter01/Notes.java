package com.incetutku.ocp.chapter01;

public class Notes {
    private int numForks;

    public static void main(String[] args) {

        // Remember that a backslash means to skip the line break.
        // \s means to keep whitespace.
        var blocky = """
                squirrel \s
                pigeon \
                termite""";
        System.out.print(blocky);


        // var
        // var is not a reserved word in Java.
        // A var cannot be used for a constructor or method parameter or for an instance or class variable
        // The type of var is known at compile-time, and the type cannot be changed at runtime, although its value can change at runtime.
        // var is not permitted in multiple-variable declarations

        var num1 = Long.parseLong("100");   // primitive        -> long l = Long.parseLong("100");
        var num2 = Long.valueOf("100");     // reference object -> Long l = Long.valueOf("100");
        System.out.println(Long.max(num1, num2));       // 100


        // 0b is the prefix for a binary value
        // 0x is the prefix for a hexadecimal value
        // These values can be assigned to many primitive types, including int and double,
    }
}
