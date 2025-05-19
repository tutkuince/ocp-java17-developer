package com.incetutku.ocp.chapter01.destroying_objects;

import java.util.Date;

public class CheckGC {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total JVM Memory: " + runtime.totalMemory());
        System.out.println("Before Memory: " + runtime.freeMemory());

        Date d = null;

        for (int i = 0; i < 10_000; i++) {
            d = new Date();
            d = null;
        }

        System.out.println("After Memory: " + runtime.freeMemory());

        runtime.gc();   // an alternate to System.gc();

        System.out.println("After GC Memory: " + runtime.freeMemory());
    }
}
