package Lectures.LAB4_Methods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        switch (operator) {
            case "/":
                System.out.printf("%.0f", getDivideResult(firstNumber, secondNumber));
                break;
            case "*":
                System.out.printf("%.0f", getMultiplyResult(firstNumber, secondNumber));
                break;
            case "+":
                System.out.printf("%.0f", getAddResult(firstNumber, secondNumber));
                break;
            case "-":
                System.out.printf("%.0f", getSubtractResult(firstNumber, secondNumber));
                break;
        }
    }

    public static double getAddResult(double firstNum, double secondNum) {
        double resultAdd = firstNum + secondNum;
        return resultAdd;
    }
    public static double getMultiplyResult(double firstNum, double secondNum) {
        double resultMultiply = firstNum * secondNum;
        return resultMultiply;
    }
    public static double getSubtractResult(double firstNum, double secondNum) {
        double resultSubtract = firstNum - secondNum;
        return resultSubtract;
    }
    public static double getDivideResult(double firstNum, double secondNum) {
        double resultDivide = firstNum / secondNum;
        return resultDivide;
    }
}



// Друго решение на задачата:
//        int number1 = Integer.parseInt(scanner.nextLine());
//        String operator = scanner.nextLine();
//        int number2 = Integer.parseInt(scanner.nextLine());
//
//        DecimalFormat df = new DecimalFormat ("##.##");
//
//        System.out.println(df.format(operations(number1, operator, number2)));
//    }
//
//    public static double operations (int number1, String operator, int number2) {
//        double res = 0;
//        switch (operator) {
//            case "*":
//                res = number1 * number2;
//                break;
//            case "/":
//                res = number1 * 1.0 / number2;
//                break;
//            case "+":
//                res = number1 + number2;
//                break;
//            case "-":
//                res = number1 - number2;
//                break;
//        }
//        return res;
//    }
//}
