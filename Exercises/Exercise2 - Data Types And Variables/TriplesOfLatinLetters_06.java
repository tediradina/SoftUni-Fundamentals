package Exercises.Exercise2_DataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLetter = Integer.parseInt(scanner.nextLine());


        for (char letter1 = 97; letter1 < 97 + numberOfLetter; letter1++) {
            for (char letter2 = 97; letter2 < 97 + numberOfLetter; letter2++) {
                for (char letter3 = 97; letter3 < 97 + numberOfLetter; letter3++) {
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);
                }
            }
        }
    }
}
