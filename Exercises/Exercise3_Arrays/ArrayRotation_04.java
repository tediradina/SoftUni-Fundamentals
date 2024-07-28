package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++){
            String firstNumber = inputArray[0];
            for (int rotation = 0; rotation <= inputArray.length - 1; rotation++){
                if (rotation == inputArray.length-1){
                    inputArray[rotation] = firstNumber;
                }else {
                    inputArray[rotation] = inputArray[rotation + 1];
                }
            }
        }

        for (String elementArray : inputArray) {
            System.out.print(elementArray + " ");

        }
    }
}
