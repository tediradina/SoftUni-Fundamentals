package Lectures.LAB2_DataTypesAndVariables;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstInput = scanner.nextLine().charAt(0);
        char secondInput = scanner.nextLine().charAt(0);
        char thirdInput = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdInput, secondInput, firstInput);
    }
}
