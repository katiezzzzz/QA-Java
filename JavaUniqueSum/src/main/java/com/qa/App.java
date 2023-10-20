package com.qa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main ( String[] args )
    {
        ArrayList<Integer> numList = takingInput();
        int sum = uniqueSum(numList);

        System.out.println(sum);
    }

//    Writing a method to check if a string can be converted into an integer
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
        System.out.println("Please give 3 integers separated by a space. E.g. 1 2 3");
        String inputNumbers = scanner.nextLine();
//     Separation of the input strings by paragraph
        String[] numbers = inputNumbers.split(" ");
//     While loop to check whether the input numbers are valid if not they will be asked to input the numbers again
        while (!checkInt(numbers[0]) || !checkInt(numbers[1]) || !checkInt(numbers[2]))
        {
            System.out.println("The input was not valid. Please give 3 integers separated by a space. E.g. 1 2 3");
            inputNumbers = scanner.nextLine();
            numbers = inputNumbers.split(" ");
        }
        int int1 = Integer.parseInt(numbers[0]);
        int int2 = Integer.parseInt(numbers[1]);
        int int3 = Integer.parseInt(numbers[2]);

        ArrayList<Integer> outNums = new ArrayList<>();
        outNums.add(int1);
        outNums.add(int2);
        outNums.add(int3);

        return outNums;
    }

    private static int uniqueSum(ArrayList<Integer> outNums)
    {
//        get the distinct numbers from arraylist
        ArrayList<Integer> distinctNums = new ArrayList<>();
        int sum = 0;
        for (int i : outNums) {
            if (!distinctNums.contains(i)) {
                distinctNums.add(i);
                sum += i;
            }
        }

        return sum;
    }
}
