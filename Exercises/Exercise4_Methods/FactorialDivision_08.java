package Exercises.Exercise4_Methods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFactorial = getFactorial(firstNumber);
        long secondFactorial = getFactorial(secondNumber);

        double result = firstFactorial * 1.0 / secondFactorial;
        System.out.printf("%.2f",result);
    }

    public  static long getFactorial(int number){
        long factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
