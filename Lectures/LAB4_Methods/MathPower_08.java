package Lectures.LAB4_Methods;

import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());
        double output = getMathPower(numberInput,powerInput);
        System.out.printf("%.0f",output);

    }

    public static double getMathPower(double number, double power){
        double result = 1;
        for (int i = 1; i <= power; i++){
            result = result * number;
        }
        return result;
    }
}
