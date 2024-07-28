package Lectures.LAB4_Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (commandInput){
            case "add":
                printAddNumbers(firstNumber,secondNumber);
                break;
            case "multiply":
                printMultiplyNumbers(firstNumber,secondNumber);
                break;
            case "subtract":
                printSubtractNumbers(firstNumber,secondNumber);
                break;
            case "divide":
                printDivideNumbers(firstNumber,secondNumber);
                break;
        }

    }

    public static void printAddNumbers(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void printMultiplyNumbers(int firstNum, int secondNum){
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void printSubtractNumbers(int firstNum, int secondNum){
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void printDivideNumbers(int firstNum, int secondNum){
        int result = firstNum / secondNum;
        System.out.println(result);
    }


}
