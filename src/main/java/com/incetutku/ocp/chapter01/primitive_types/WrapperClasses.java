package com.incetutku.ocp.chapter01.primitive_types;

public class WrapperClasses {
    public static void main(String[] args) {
        // Each primitive type has a wrapper class, which is an object type that corresponds to the primitive.
        // There is also a valueOf() variant that converts a String into the wrapper class.
        int primitive = Integer.parseInt("123");    // converts a String to an int primitive
        Integer wrapper = Integer.valueOf("123");   // converts a String to an Integer wrapper class.
        // Integer numberFormatException = Integer.valueOf("123.5");   // NumberFormatException

        // All the numeric classes extend the "Number" class, which means they all come with some useful helper methods:
        // byteValue(), shortValue(), intValue(), longValue(), floatValue(), and doubleValue().
        // The Boolean and Character wrapper classes include booleanValue() and charValue().

        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue());
        System.out.println(apple.intValue());
        System.out.println(apple.doubleValue());

        // Double numberFormatException = Double.valueOf("200,99");     // NumberFormatException

        // Some of the wrapper classes contain additional helper methods for working with numbers.
        // max(int num1, int num2), which returns the largest of the two numbers
        // min(int num1, int num2), which returns the smallest of the two numbers
        // sum(int num1, int num2), which adds the two numbers.
        int max = Integer.max(19, 25);
        int min = Integer.min(35, 45);
        int sum = Integer.sum(15, 25);

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
