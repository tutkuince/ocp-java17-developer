package com.incetutku.ocp.chapter01.initializing_variables;

public class UninitializedLocalVariables {

    // Local variables do not have a default value and must be initialized before use.
    // Furthermore, the compiler will report an error if you try to read an uninitialized value.
    /*public int notValid() {
        int x = 10;
        int y;
        int reply = x + y;  // DOES NOT COMPILE
        return reply;
    }*/

    public int valid() {
        int y = 10;
        int x;  // x is declared here
        x = 3;  // x is initialized here
        int z;  // z is declared here but never initialized or used
        int reply = x + y;
        return reply;
    }

    // The answer variable is initialized in both branches of ht eif statement, so the compiler is perfectly happy.
    // It knows that regardless of whether check is true or false, the value answer will be set to something before it is used.
    // The "otherAnswer" variable is not initialized but never used, and the compiler is equally as happy.
    // Remember, the compiler is only concerned if you try to use uninitialized local variables; it doesn't mind the ones you never use.
    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch);   DOES NOT COMPILE
    }
}
