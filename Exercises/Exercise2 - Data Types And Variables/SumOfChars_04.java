package Exercises.Exercise2_DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countRows = Integer.parseInt(scanner.nextLine());

        int sumASCIICodes = 0;
        for (int i = 1; i <= countRows; i++){
            char letter = scanner.nextLine().charAt(0);
            sumASCIICodes = sumASCIICodes + letter;
        }

        System.out.printf("The sum equals: %d", sumASCIICodes);

    }
}
