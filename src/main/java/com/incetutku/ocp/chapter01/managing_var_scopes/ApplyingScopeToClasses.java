package com.incetutku.ocp.chapter01.managing_var_scopes;

public class ApplyingScopeToClasses {
    final static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}
