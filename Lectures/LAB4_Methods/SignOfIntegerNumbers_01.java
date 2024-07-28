package Lectures.LAB4_Methods;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        printSignInteger(numberInput);
    }

    public static void printSignInteger(int number){
        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        }else if (number < 0){
            System.out.printf("The number %d is negative.",number);
        }else {
            System.out.println("The number 0 is zero.");
        }
    }

}
