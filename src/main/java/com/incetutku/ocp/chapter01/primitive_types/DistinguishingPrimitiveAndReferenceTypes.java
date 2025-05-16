package com.incetutku.ocp.chapter01.primitive_types;

public class DistinguishingPrimitiveAndReferenceTypes {
    public static void main(String[] args) {
        // First, notice that all the primitive types have lowercase type names.
        // All classes that come with Java begin with uppercase.

        // Reference types can be used to call methods, assuming the reference is not null.
        // Primitives do not have methods declared on them.
        String reference = "Hello";
        int len = reference.length();
        // int bad = len.length();  // DOES NOT COMPILE

        // Reference types can be assigned null, which means they do not currently refer to an object.
        // Primitive types will give you a compile error if you attempt to assign them null.
        String nullableStr = null;
        // int value = null;        // DOES NOT COMPILE

    }
}
