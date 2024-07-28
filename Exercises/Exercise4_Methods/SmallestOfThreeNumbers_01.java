package Exercises.Exercise4_Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printMaxNumber(firstNumber, secondNumber,thirdNumber);
    }

    public static void printMaxNumber(int firstNum, int secondNum, int thirdNum){
        if (firstNum <= secondNum && firstNum <= thirdNum){
            System.out.println(firstNum);
        }else if (secondNum <= firstNum && secondNum <= thirdNum){
            System.out.println(secondNum);
        }else if (thirdNum <= firstNum && thirdNum <= secondNum){
            System.out.println(thirdNum);
        }

    }
}
