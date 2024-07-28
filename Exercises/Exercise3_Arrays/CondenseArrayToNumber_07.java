package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (inputArray.length > 1) {
            int[] newArray = new int[inputArray.length - 1];
            for (int i = 0; i < inputArray.length - 1; i++) {
                newArray[i] = inputArray[i] + inputArray[i + 1];
            }
            inputArray = newArray;
        }

        System.out.println(inputArray[0]);
    }
}




