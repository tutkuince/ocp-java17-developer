package com.incetutku.ocp.chapter01.destroying_objects;

public class DestroyingObjects {
    /**
     * All Java objects are stored in your program memory's "heap".
     * The heap, which is also referred to as the free store, represents a large pool of unused memory allocated to your Java application.
     *
     * Garbage collection refers to the process of automatically freeing memory on the heap by deleting objects that are no longer reachable in your program.
     * As a developer, the most interesting part of garbage collection is determining when the memory belonging to an object can be reclaimed.
     * In Java and other languages, eligible for garbage collection refers to an object's state of no longer being accessible in a program and
     * therefore able to be garbage collected.
     *
     * Java includes a built-in method to help support garbage collection where you can suggest that garbage collection run.
     * System.gc();
     * Just like the post office, Java is free to ignore you. This method is not guaranteed to do anything.
     *
     * The JVM waits patiently and monitors each object until it determines that the code no longer needs that memory.
     * And object will remain on the heap until it is no longer reachable.
     * An object is no longer reachable when one of two situations occurs:
     * - The object no longer has any references pointing to it.
     * - All references to the object have gone out of scope.
     * */

    /**
     * Objects vs. References
     * Do not confuse a reference with the object that it refers to; they are two different entities.
     * The reference is a variable that has a name and can be used to access the contents of an object.
     * A reference can be assigned to another reference, passed to a method, or returned from a method.
     * All references are the same size, no matter what their type is.
     *
     * An object sits on the heap and does not have a name. Therefore, you have no way to access an object except through a reference.
     * Objects come in all different shapes and sizes and consume varying amounts of memory. An object cannot be assigned to another object,
     * and an object cannot be passed to a method or returned from a method. It is the object that gets garbage collected. not its reference.
     *
     * */

    public static void main(String[] args) {
        // Null Reference
        // an object becomes eligible for garbage collection when there are no more reachable references to it.
        // Obviously, if there are no reachable references, it doesn't matter what happens to the object.
        // For our purposes it is just floating in space, unused, inaccessible, and no longer needed.
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        // The StringBuffer object is not eligible for collection
        sb = null;
        // Now the StringBuffer object is eligible for collection

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Goodbye");
        System.out.println(sb1.toString());
        // At this point the StringBuilder "hello" is not eligible
        sb1 = sb2;
        // Now the StringBuilder "Hello" is eligible for collection.

    }
}
