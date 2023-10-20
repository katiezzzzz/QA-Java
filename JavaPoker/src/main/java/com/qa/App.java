package com.qa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to Blackjack!!! :)");
        ArrayList<Integer> outNums = takingInput();
        int max = blackJack(outNums);
        System.out.println(max);
    }
    private static boolean checkInt(String num)
    {
        try
        {
            Integer.parseInt(num);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    private static ArrayList<Integer> takingInput( )
    {
//     Initialising the Scanner instance
        Scanner scanner = new Scanner(System.in);

//     The three Input variables
        System.out.println("Please give 2 integers separated by a space. E.g. 1 2");
        String inputNumbers = scanner.nextLine();
//     Separation of the input strings by paragraph
        String[] numbers = inputNumbers.split(" ");
//     While loop to check whether the input numbers are valid if not they will be asked to input the numbers again
        while (!checkInt(numbers[0]) || !checkInt(numbers[1]))
        {
            System.out.println("The input was not valid. Please give 2 integers separated by a space. E.g. 1 2 3");
            inputNumbers = scanner.nextLine();
            numbers = inputNumbers.split(" ");
        }
        int int1 = Integer.parseInt(numbers[0]);
        int int2 = Integer.parseInt(numbers[1]);

        ArrayList<Integer> outNums = new ArrayList<>();
        outNums.add(int1);
        outNums.add(int2);

        return outNums;
    }
//    method that sees if the sum is bigger than 21
    private static int blackJack(ArrayList<Integer> outNums)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        for (int i : outNums) {
            if (i <= 21) {
                nums.add(i);
            }
        }
        return max(nums);
    }
    public static int max(ArrayList<Integer> nums)
    {
        int max = 0;
        for (int i: nums)
        {
            if (i > max)
            {
                max = i;
            }
        }
//        return largest number of a given array
        return max;
    }
}
