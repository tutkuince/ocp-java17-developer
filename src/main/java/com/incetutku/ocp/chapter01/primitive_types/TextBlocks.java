package com.incetutku.ocp.chapter01.primitive_types;

public class TextBlocks {
    public static void main(String[] args) {
        // Java has text blocks, also known as multiline strings.
        // A text block starts and ends with three double quotes ("""), and the contents don't need to be escaped.
        // This is much easier to read.
        String eyeTest = "\"Java Study Guide\"\n by Scott & Jeanne";
        System.out.println(eyeTest);

        String textBlock = """
                "Java Study Guide"
                 by Scott & Jeanne
                """;
        System.out.println(textBlock);

        // Essential whitespace is part of your String and is important to you.
        // Incidental whitespace just happens to be there to make the code easier to read.
        String pyramid = """
                    *
                  *   *
                *   *   *
                """;
        System.out.println(pyramid);

        // String block = """doe"""; DOES NOT COMPILE
        // Text blocks require a line break after the opening """
    }
}
