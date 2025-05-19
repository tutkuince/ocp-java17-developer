package com.incetutku.ocp.chapter01.initializing_variables;

public class PassingConstructorAndMethodParams {
    // Variables passed to a constructor or method are called constructor parameters or method parameters.
    // These parameters are like local variables that have been pre-initialized.
    // The rules for initializing constructor and method parameters are the same

    public void findAnswer(boolean check) {}

    // The call to findAnswer() does not compile because it tries to use a variable that is not initialized.
    public void checkAnswer() {
        boolean value;
        // findAnswer(value);   // DOES NOT COMPILE
    }

}
