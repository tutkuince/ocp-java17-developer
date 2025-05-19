package com.incetutku.ocp.chapter01.destroying_objects;

import java.util.Date;

public class GarbageFactory {
    /*
    * If an object is returned from the method,
    * its reference might be assigned to a reference variable in the method that called it;
    * hence, it will be not eligible for collection.
    * */
    public static void main(String[] args) {
        // Since the method returns the Date object,
        // it will not be eligible for collection even after the method has completed.
        // StringBuffer object, through, will be eligible
        // even though we didn't explicitly set the now variable to null.
        Date d = getDate();
        doComplicatedStuff();
        System.out.println("d = " + d);
    }

    private static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;
    }

    private static void doComplicatedStuff() {

    }
}
