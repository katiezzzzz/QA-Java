package com.qa;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ifPractice();
//        randomExercise();
        switchPractice();
        loops();
    }

    public static void ifPractice(){
//        if statement
        int luckyNumber = 13;
        if (luckyNumber % 2 == 0) {
            System.out.println("Your lucky number is EVEN");
        }
        else {
            System.out.println("Your lucky number is ODD");
        }

//        else if statement
        Random rand = new Random();

        int speed = rand.nextInt(100);
        if (speed < 20) {
            System.out.println("Your speed is " + speed + ", you are a turtle");
        } else if (speed >= 20 && speed < 50) {
            System.out.println("Your speed is " + speed + ", you are a perfect driver");
        } else {
            System.out.println("Your speed is " + speed + ", NOOOOOOOOO TOOOOOOO FASTTTT");
        }

    }

//    ternary operator
    public static void ternaryPractice() {
        int value1 = 120, value2 = 105, maxValue=0;
        maxValue = (value1 > value2) ? value1 : value2;
        System.out.println("Max value is " + maxValue);
    }

    public static void randomExercise() {
        int x = 3, y = 5;
        if (x > 0) {
            if (y > x)
                System.out.println("y is less than x");
        } else {
            System.out.println("x is negative");
        }

        int z = 7;
        if (z == 0)
            System.out.println("x is zero");
    }

    public static void switchPractice() {
        int choice = 13;

        switch (choice) {
            case 37:
            case 38:
            case 39:
                System.out.println("Coffee");
                break;

            case 45:
            case 46:
                System.out.println("Tea");
                break;
            default:
                System.out.println("Water");
                break;
        }

        if (choice >= 37 && choice <=39) {
            System.out.println("Coffee");
        } else if (choice == 45 || choice ==46) {
            System.out.println("Tea");
        } else {
            System.out.println("Water");
        }
    }

    public static void loops() {
        boolean isRaining = true;
        boolean armsHurt = true;

        while (isRaining) {
            System.out.println("Hold up umbrella");
            if (armsHurt) {
                System.out.println("My arms are too tired, I'd rather get rained on.");
                break;
            }
        }

        int i = 8;
        while (i < 8){
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("=========================================");

        int j = 8;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 8);

        for (int k = 0; k < 3; k++) {
            System.out.println("k = " + k);
        }
    }
}
