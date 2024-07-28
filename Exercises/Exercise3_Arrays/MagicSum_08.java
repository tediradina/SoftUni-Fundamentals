package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int givenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= inputArray.length - 1; i++){
            int sum = 0;
            int firstNum = inputArray[i];
            sum = sum + firstNum;
            if (sum > givenNumber){

            }else {
                for (int j = i + 1; j <= inputArray.length - 1; j++) {
                    sum = firstNum;
                    int secondNum = inputArray[j];
                        sum = sum + secondNum;

                        if (sum == givenNumber) {
                            System.out.printf("%d %d%n", firstNum, secondNum);
                        }

                    }
                }

        }

    }
}
