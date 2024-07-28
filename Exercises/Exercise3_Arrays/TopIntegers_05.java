package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= inputArray.length - 1; i++) {
            int topInteger = inputArray[i];
            boolean isTopInteger = true;
            for (int rightIntegerPosition = i + 1; rightIntegerPosition <= inputArray.length - 1; rightIntegerPosition++) {
                int rightInteger = inputArray[rightIntegerPosition];
                if (topInteger > rightInteger) {
                    isTopInteger = true;
                } else {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                System.out.print(topInteger + " ");
            }
        }
    }
}
