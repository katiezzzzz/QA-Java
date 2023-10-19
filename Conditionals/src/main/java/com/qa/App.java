package com.qa;
import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        exercise3();
    }

    private static void exercise3(){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter two numbers separated by space");
//        String inputNums = scanner.nextLine();
//        String[] numbers = inputNums.split(" ");
//        int num1 = Integer.parseInt(numbers[0]);
//        int num2 = Integer.parseInt(numbers[1]);
//        System.out.println(Math.max(num1, num2));
//
//        System.out.println("Please enter another number");
//        int num3 = scanner.nextInt();
//        System.out.println((num3 % 2 == 0) ? "Even" : "Odd");

//        System.out.println("Please choose a colour from green, red, amber");
//        String colour = scanner.nextLine().toLowerCase();
//        switch (colour) {
//            case "green":
//                System.out.println("Go!!!!!!!!!!!!!!");
//                break;
//            case "red":
//                System.out.println("STOP!!!!!!!!!!!!");
//                break;
//            case "amber":
//                System.out.println("Wait for a bit, just a few seconds");
//                break;
//            default:
//                System.out.println("Incorrect colour");
//        }

        System.out.println("Please give me a number between 1 and 12");
        int number = scanner.nextInt();

        while (number < 1 || number > 12) {
            System.out.println("Incorrect number! Please try again");
            number = scanner.nextInt();
        }

        switch(number) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Autumn");
        }
    }
}
