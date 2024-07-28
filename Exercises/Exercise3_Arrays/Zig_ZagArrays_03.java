package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zig_ZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Integer[] firstArray = new Integer[n];
        Integer[] secondArray = new Integer[n];

        for(int i = 1; i <= n; i++){
            int[] inputArray = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 == 0){
                firstArray[i-1] = inputArray[1];
                secondArray[i-1] = inputArray[0];
            }else {
                firstArray[i-1] = inputArray[0];
                secondArray[i-1] = inputArray[1];
            }
        }

        for (int firstElementArray : firstArray) {
            System.out.print(firstElementArray + " ");
        }
        System.out.println();
        for (int secondElementArray : secondArray) {
            System.out.print(secondElementArray + " ");
        }

    }
}
