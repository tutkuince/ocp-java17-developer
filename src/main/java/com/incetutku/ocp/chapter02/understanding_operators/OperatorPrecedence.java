package com.incetutku.ocp.chapter02.understanding_operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        // Determining which operators are evaluated in what order is referred to as operator precedence.
        int height = 5;
        int length = 8;
        var perimeter = 2 * height + 2 * length;
        var perimeterV2 = ((2 * height) + (2 * length));

        System.out.println(perimeter);
        System.out.println(perimeterV2);

        /*
                Post- unary operators expression++, expression- - Left- to- right
                Pre- unary operators ++expression, - - expression Left- to- right
                Other unary operators -, !, ~, +, (type) Right- to- left
                Cast (Type)reference Right- to- left
                Multiplication/division/modulus *, /, % Left- to- right
                Addition/subtraction +, - Left- to- right
                Shift operators <<, >>, >>> Left- to- right
                Relational operators <, >, <=, >=, instanceof Left- to- right
                Equal to/not equal to ==, != Left- to- right
                Logical AND & Left- to- right
                Logical exclusive OR ^ Left- to- right
                Logical inclusive OR | Left- to- right
                Conditional AND && Left- to- right
                Conditional OR || Left- to- right
                Ternary operators boolean expression ? expression1 :
                expression2
                Right- to- left
                Assignment operators =, +=, - =, *=, /=, %=, &=, ^=, |=, <<=, >>=,
                >>>=
                Right- to- left
                Arrow operator - > Right- to- left
        * */
    }
}
