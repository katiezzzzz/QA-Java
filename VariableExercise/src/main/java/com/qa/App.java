package com.qa;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        String firstName, lastName;
//        firstName = "David";
//        lastName = "McBride";
//
//        String name = firstName + " " + lastName;
//
//        System.out.println(name);

//        int num1, num2;
//        num1 = 5;
//        num2 = 8;
//        System.out.println(num1 + num2);
//        float result = (float)num1 / (float)num2;
//        System.out.println(result);
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(++num3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");

        String outName = "Your full name is ";

        for (int i = 0; i < names.length; i++) {
            outName += names[i] + " ";
        }

//        short hand
        for (String name : names) {
            outName += name;
        }




//        System.out.println("Your full name is " + names[0] + " " + names[names.length-1]);
        System.out.println(outName.trim());
        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter a second number");
        int num2 = scanner.nextInt();
        System.out.println("The sum of the two numbers entered is " + (num1 + num2));
    }
}
