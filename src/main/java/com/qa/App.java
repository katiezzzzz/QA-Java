package com.qa;
/*
Comments that span multiple lines - block comments
 */

/**
 * Hello world!!
 *
 */

// this is a public class which is a template of a type
public class App 
{
    // args - arguments
    public static void main( String[] args ) {
        if (args.length > 0) {
            System.out.println("Hi " + args[0] + "!");
        } else {
            System.out.println("Hello World!");
            System.out.println("Hello again!");
            System.out.println("Goodbye World!");
            String firstName = "Lisa";
//            int age = 8;
            System.out.println("Hello " + firstName);

//            allowed variable names
            char a;
            String abracadabra;
            String abra_cada_bra$;
            String a1;
            String _abra;
//            dis-allowed variable names
//            String no#;
//            String onr-pad;
//            String public;
//            String 1ka;

            int sizeof = 200;
            short mum = 43;
            int big = sizeof * sizeof * sizeof;
            long bigger = big + big + big;
            double old = 78.0;
            boolean cosequence = true;
            boolean max = big > bigger;
            char ming = 'd';

            variablesPractice();
            assignmentPractice();
        }
    }

    public static void variablesPractice() {
//        declare the variable
        String firstName;
//        initialise the variable, give it a value
        firstName = "Katie";
        int a, b, c;
        a = b = c = 100;
        String lastName, city;
        String colour, food = "chips";
        System.out.println(food);
        colour = "pink";
        System.out.println(colour);

//        widening conversion
        long someBigNumber = 123;
        int smallerNumber = 123;
//        narrowing conversion - needs to be forced
        smallerNumber = (int)someBigNumber;

        double v1 = 1.25;
        float v2 = (float)v1;

        byte b1 = 2, b2 = 3, b3 = 0;
        b3 = (byte)(b1 + b2);

        long anotherBigNumber = 123L;
        boolean havePets = true;
        System.out.println(havePets);

//        floating point numbers
        float price = 12.99F;

        String greeting = "Hello World\n";
        System.out.println(greeting);
        System.out.println("The end");
    }

    public static void assignmentPractice() {
        int var1 = 0, var2 = 0;
        var1 = 1;
        var2 = var1 - 1;
        System.out.println(var2);

        int a, b, c;
        a = b = c = 100;
        System.out.println(a - 50);
        System.out.println(b - 1);

//        compound assignment
        int total = 0;
        int subtotal;
        subtotal = 8;
//        long hand syntax
        total = total + subtotal;
//        short hand syntax
        total += subtotal;
//        += is called a compound operator
        System.out.println(total);

        total -= subtotal;
        System.out.println(total);

        total *= 3;
        System.out.println(total);

//        increment and decrement
        total += 1;
        System.out.println(total);
//        in this case, ++ is a postfix operator
        total++;
        System.out.println(total);
        total--;

//        in this case, ++ is a prefix operator
//        prefix has a higher order of precedence than the postfix
        ++total;
        System.out.println(total);

        int wed = 3;
        wed++;
        System.out.println(wed);

        int thur;
        thur = ++wed;
        System.out.println(thur);

        int fri;
//        postfix operator has lower precedence than assignment
        fri = thur++;
        System.out.println(fri);
    }
}
