package com.incetutku.ocp.chapter01.primitive_types;

public class LiteralInt {

    public static void main(String[] args) {
        // long max = 3123456789;   // DOES NOT COMPILE
        long max = 3123456789L;     // Now Java knows it is a long

//        long literal = -2147483649;   // DOES NOT COMPILE
        long literal = -2147483649L;

        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);  // 2147483647
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);  // -2147483648
        System.out.println("Integer.MIN_VALUE: " + Long.MIN_VALUE);     // -9223372036854775808
        System.out.println("Integer.MAX_VALUE: " + Long.MAX_VALUE);     // 9223372036854775807
    }
}
