package com.qa;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )S
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers separated by a space");
        String inputNums = scanner.nextLine();
        String[] numbers = inputNums.split(" ");

        while (!checkIfNum(numbers[0]) || !checkIfNum(numbers[1])) {
            System.out.println("Please give us two numbers separated by a space :(");
            inputNums = scanner.nextLine();
            numbers = inputNums.split(" ");
        };

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        System.out.println("Please enter an operator: +, -, / or * :");
        String operator = scanner.next();

        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.println("Please give us a proper operator: ");
            operator = scanner.next();
            System.out.println(operator);
        }

        switch(operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("no idea what's going on here but never mind Im not really gonig to do anything anyway so who cares");
        }

    }

    private static boolean checkIfNum(String num) {
        try {
            Integer.parseInt(num);
            return true;
        }

        catch (NumberFormatException e) {
            return false;
        }
}
}
