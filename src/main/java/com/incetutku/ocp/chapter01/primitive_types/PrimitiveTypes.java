package com.incetutku.ocp.chapter01.primitive_types;

public class PrimitiveTypes {

    /**
     * boolean: true or false                                                       -> default value: false
     * byte: 8-bit integral value       min: -128               max: 127            -> default value: 0
     * short 16-bit integral value      min: -32,768            max: 32,767         -> default value: 0
     * int 32-bit integral value        min: -2,147,483,468     max: 2,147,483,467  -> default value: 0
     * long 64-bit integral value       min: -2^63              max: 2^63 - 1       -> default value: 0L
     * float 32-bit integral value      min: n/a                max: n/a            -> default value: 0.0f
     * double 64-bit integral value     min: n/a                max: n/a            -> default value: 0.0
     * char 16-bit Unicode value        min: 0                  max: 65,535         -> \u0000
     *
     * String is not a Primitive.
     *
     * */

    public static void main(String[] args) {
        boolean activated = true;

        byte size = 100;
//        byte height = 128;    // DOES NOT COMPILE, max value is 127
        System.out.println("byte max value: " + Byte.MAX_VALUE);
        System.out.println("byte min value: " + Byte.MIN_VALUE);

        short count = 15000;
//        short total = 32768;    // DOES NOT COMPILE, max value is 32,767
        System.out.println("short max value: " + Short.MAX_VALUE);
        System.out.println("short min value: " + Short.MIN_VALUE);

        float sum = 150;    // int → float (implicit widening conversion)
//        float square = 125.45;  //  Compile error!
        float square = 125.56f;
        float square2 = 12312.4534F;
    }
}
