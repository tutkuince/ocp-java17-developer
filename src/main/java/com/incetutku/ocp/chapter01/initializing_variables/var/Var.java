package com.incetutku.ocp.chapter01.initializing_variables.var;

public class Var {
    // var is not a reserved word and allowed to be used as an identifier.
    // It is considered a reserved type name.
    // A "reserved type name" means it cannot be used to define a type, such as a class, interface, or enum.


    // This code does compile. Java is case sensitive, so Var doesn't introduce any conflicts as a class name.
    public void var() {
        var var = "var";
    }

    public void  Var() {
        Var var = new Var();
    }
}
