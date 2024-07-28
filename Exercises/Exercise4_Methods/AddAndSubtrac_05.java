package Exercises.Exercise4_Methods;

import java.util.Scanner;

public class AddAndSubtrac_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int resultOutput = getSumFirstAndSecondNumber(firstNumber, secondNumber) - thirdNumber;
        System.out.println(resultOutput);

    }

    public static int getSumFirstAndSecondNumber(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        return result;
    }

}
