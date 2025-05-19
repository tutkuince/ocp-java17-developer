package com.incetutku.ocp.chapter01.managing_var_scopes;

public class ManagingVariableScope {

    // There are two variables with local scope. The bitesOfCheese variable is declared inside the method.
    // The piecesOfCheese variable is a method parameter
    // Neither variable can be used outside where is defined.
    public void eat(int pieceOfCheese) {
        int bitesOfCheese = 1;
    }

    // Local variables can never have a scope larger than the method they are defined in.
    // The variable hungry has a scope of the entire method, while the variable bitesOfCheese has a smaller scope.
    // It is only available for use in the "if" statement because it is declared inside of it.
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            // bitesOfCheese goes out of scope here
        }
        // System.out.println(bitesOfCheese);   // DOES NOT COMPILE
    }

    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
            // System.out.println(teenyBit);    // DOES NOT COMPILE
        }
        // System.out.println(teenyBit);        // DOES NOT COMPILE
    }
}
