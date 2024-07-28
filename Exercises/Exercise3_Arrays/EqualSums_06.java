package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEquals = false;
        for (int i = 0; i <= inputArray.length - 1; i++){
            int leftSum = 0;

            for (int left = i - 1; left >= 0; left--){
                leftSum = leftSum + inputArray[left];
            }

            int rightSum = 0;
            for (int right = i + 1; right <= inputArray.length - 1; right++){
                rightSum = rightSum + inputArray[right];
            }
            if (leftSum == rightSum){
                isEquals = true;
                System.out.println(i);
                break;
            }
        }
        if (!isEquals){
            System.out.println("no");
        }
    }
}
