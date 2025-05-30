package com.incetutku.ocp.chapter02.understanding_operators;

public class TypesOfOperators {

    // A Java operator is a special symbol that can be applied to a set of variables, values or literals - referred to as operands
    // and that returns a result.
    // The term operand refers to the value or variable the operator is being applied to.
    public static void main(String[] args) {
        // var c = a + b;
        // Result assigned to "c"
        // a & b are operands
        // + is a operator


        // Types or Operators
        // Java supports there flavors of operators: unary, binary and ternary.

        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.println("Zoo animal receives: " + reward + " reward points");
    }
}
