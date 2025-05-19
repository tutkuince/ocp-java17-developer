package com.incetutku.ocp.chapter01.initializing_variables;

public class InitializingVariables {
    // Creating Local Variables:
    // A local variable is a variable defined within a constructor, method, or initializer block.

    // Final Local Variables:
    // The "final" keyword can be applied to local variables and is equivalent to declaring constants in other languages.
    private void localVariable() {
        final int y = 10;
        int x = 20;
        // y = x + 10;  // DOES NOT COMPILE

        // The final modifier can also be applied to local variable references.
        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
        // favoriteNumbers = null;  // DOES NOT COMPILE
        // Notice that we can modify the content, or data, in the array.
        // The compiler error isn't until line 19, when we try to change the value of the reference favoriteNumbers.

        /*
        private int secret = 10;    DOES NOT COMPILE
        public int number = 10;     DOES NOT COMPILE
        static int size = 10;       DOES NOT COMPILE
        abstract int age = 10;      DOES NOT COMPILE
        volatile int counter = 10;  DOES NOT COMPILE
        transient int life = 10;    DOES NOT COMPILE
         */
    }
}
