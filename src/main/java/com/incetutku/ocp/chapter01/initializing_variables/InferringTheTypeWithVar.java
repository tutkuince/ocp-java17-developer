package com.incetutku.ocp.chapter01.initializing_variables;

public class InferringTheTypeWithVar {
    // You have the option of using the keyword "var" instead of the type when declaring local variables under certain conditions.
    // To use this feature, you just type "var" instead of the primitive or reference type.

    // The formal name of this feature is local variable type inference.
    // You can only use this feature for local variables.
    // var tricky = "Hello!";   // DOES NOT COMPILE

    // If you know a language like JavaScript, you might be expecting "var" to mean a variable that can take on any type at runtime.
    // In Java, "var" is still a specific type defined at compile time. It does not change type at runtime.

    // While a var cannot be initialized with a null value without a type, it can be reassigned a null value after it is declared,
    // provided that the underlying data type is a reference type.


    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
        // The formal name of this feature is local variable type inference.
        // First comes local variable.
    }

    // When you type var, you are instructing the compiler to determine the type for you.
    // The compiler looks at the code on the line of the declaration and uses it to infer the type.
    public void reassignment() {
        var number = 7;         // Compiler determines that we want an int variable
        number = 4;             // we have no trouble assigning a different int to it.
        // number = "five"; // DOES NOT COMPILE
        // Java has a problem. We've asked it to assign a String to an int variable. This is not allowed.
        // It is equivalent to typing this: int number = "five";

        // var nullValue; -> Cannot infer type: 'var' on variable without initializer
    }

    // The code does not compile.
    // Remember that for local variable type inference, the compile looks only at the line with the declaration.
    /*public void doesThisCompile(boolean check) {
        var question;   // DOES NOT COMPILE
        question = 1;
        var answer;     // DOES NOT COMPILE
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer); // DOES NOT COMPILE
    }*/

    public void twoTypes() {
        // int a, var b = 3;    // DOES NOT COMPILE
        // var n = null;        // DOES NOT COMPILE
        // var a = 3, b = 12;   // 'var' is not allowed in a compound declaration
    }

    // In this example, a and b are method parameters.
    // These are not local variables.
    // Be on the lookout for var used with constructors, method parameters, or instance variables.
    // Remember that var is only used for local variable type inference.
    /*public int addition(var a, var b) {   Cannot resolve symbol 'var'  // DOES NOT COMPILE
        return a + b;
    }*/

    // While a var cannot be initialized with a null value without a type,
    // it can be reassigned a null value after it is declared,
    // provided that the underlying data type is a reference type.
    public void nullVar() {
        var str = (String) null;
        str = "content";

        var size = (Integer) null;
        size = 200;
    }

}
