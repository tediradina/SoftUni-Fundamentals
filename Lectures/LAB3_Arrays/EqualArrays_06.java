package Lectures.LAB3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean foundDifference = false;
        int sum = 0;
        for (int i = 0; i <= firstArray.length - 1; i++){
            if (firstArray[i] == secondArray[i]){
                sum = sum + firstArray[i];
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                foundDifference = true;
                break;
            }
        }

        if (!foundDifference){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
