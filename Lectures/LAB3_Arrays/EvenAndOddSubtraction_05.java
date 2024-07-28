package Lectures.LAB3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        for (int i = 0; i <= numbersArray.length - 1; i++){
            if (numbersArray[i] % 2 == 0){
                sumEvenNumbers = sumEvenNumbers + numbersArray[i];
            }else {
                sumOddNumbers = sumOddNumbers + numbersArray[i];
            }
        }
        System.out.println(sumEvenNumbers - sumOddNumbers);
    }
}
