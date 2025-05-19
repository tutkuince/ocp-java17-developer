package com.incetutku.ocp.chapter01.initializing_variables.var;

import java.time.LocalDate;
import java.time.LocalTime;

public class VarReview {

    /**
     * Review of var Rules
     * - A var is used as a local variable in a constructor, method, or initializer block.
     * - A var cannot be used in constructor parameters, method parameters, instance variables, or class variables.
     * - A var is always initialized on the same line (or statement) where it is declared.
     * - The value of a var can change, but the type cannot.
     * - A var cannot be initialized with a null value without a type.
     * - A var is not permitted in a multiple-variable declaration.
     * - A var is a reserved type name but not a reserved word,
     * meaning it can be used as an identifier except as a class, interface, or enum name.
     *
     *
     * */
}

// A var is used as a local variable in a constructor, method, or initializer block.
class Example {

    static {
        var staticallyInitialized = true;
    }

    public Example() {
        var number = 10;
    }

    private void method() {
        var name = "username";
    }

    {
        var initialized = true;
    }
}

// A var cannot be used in constructor parameters, method parameters, instance variables, or class variables
class Example2 {
    // private void notValid(var notAllowedHere) {}         // DOES NOT COMPILE
    // public Example2(var notAllowedHere) {}               // DOES NOT COMPILE
    // private var instanceVariableAsVarNotAllowed;         // DOES NOT COMPILE
    // private static var staticVariableAsVarNotAllowed;    // DOES NOT COMPILE
}

// A var is always initialized on the same line (or statement) where it is declared.
class Example3 {
    void method() {
        var number = 10;
        var sum = 20;

        // var notValid;
        // notValid = 20;   // DOES NOT COMPILE
        // var notValid2;
    }
}

// The value of a var can change, but the type cannot.
class Example4 {
    void method() {
        var number = 10;
        number = 20;
        number = 30;

        final var sum = 100;
        // sum = 150;  // DOES NOT COMPILE, final variable

        var today = LocalDate.now();
        // today = LocalTime.now(); // DOES NOT COMPILE

        var str = new StringBuilder("example content");
        // str = "another content"; // DOES NOT COMPILE
    }
}