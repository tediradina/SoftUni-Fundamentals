package Lectures.LAB3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        for (int i = 0; i <= (inputArray.length - 1) / 2; i++){
            String firstLetter = inputArray[i];
            String lastLetter = inputArray[inputArray.length - 1 - i];
            inputArray[i] = lastLetter;
            inputArray[inputArray.length - 1 - i] = firstLetter;
        }

        System.out.println(String.join(" ", inputArray));
    }
}
