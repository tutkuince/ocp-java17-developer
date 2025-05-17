package com.incetutku.ocp.chapter01.declaring_variables;

public class DeclaringVariables {
    public static void main(String[] args) {
        // A variable is a name for a piece of memory that stores data.
        // When you declare a variable, you need to state the variable type along with giving it a name.
        // Giving a variable a value is called initializing a variable.
        String zooName = "The Best Zoo";

        // An identifier is the name of a variable, method, class, interface or package.
        // There are only four rules to remember for legal identifiers
        // 1) Identifiers must begin with a letter, a currency symbol or a _ symbol.
        // Currency symbols include dollar ($), yuan (¥), euro (€) and so on.
        // 2) Identifiers can include numbers but not start with them
        // 3) A single underscore _ is not allowed as an identifier
        // 4) You cannot use the same name as a Java reserved word.
        // A reserved word is special word that Java has held aside so that you are not allowed to use it
        // Remember Java is case-sensitive, so you can use version of the keywords that only differ in case.

        /**
         * Reserved words:
         *
         * abstract     assert          boolean     break       byte
         * case         catch           char        class       const
         * continue     default         do          double      else
         * enum         extends         final       finally     float
         * for          goto            if          implements  import
         * instanceof   int             interface   long        native
         * new          package         private     protected   public
         * return       short           static      staticfp    super
         * switch       synchronized    this        throw       throws
         * transient    try             void        volatile    while
         *
         * */

        // There are other names that you can't use. For example, true, false, and null are literal values, so they can't be variable names.
        // Additionally, there contextual keywords like "module"

        // The following examples are legal:
        long okidentifier;
        float $OKIdentifier;
        boolean _alsoOK1d3ntifi3r;
        char __SStillOkbutKnotsonice$;

        // These are not legal:
        // int 3DPointClass;        // identifiers cannot begin with a number
        // byte hollywood@vine;     // @ is not a letter, digit, $ or _
        // String *$coffee;         // * is not a letter, digit, $ or _
        // double public;           // public is a reserved word
        // short _;                 // a single underscore is not allowed
    }
}
