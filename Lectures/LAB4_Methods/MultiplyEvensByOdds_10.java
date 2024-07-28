package Lectures.LAB4_Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        numberInput = Math.abs(numberInput);
        int result = getMultipleOfEvensAndOdds(numberInput);
        System.out.println(result);
    }

    public static int getOddSumNumbers(int numbers) {
        int sumOddNumbers = 0;
        while (numbers > 0) {
            int lastNum =  Math.abs(numbers % 10);
            if (lastNum % 2 != 0) {
                sumOddNumbers = sumOddNumbers + lastNum;
            }
            numbers = numbers / 10;
        }
        return sumOddNumbers;
    }

    public static int getEvenSumNumbers(int numbers){
        int evenSum = 0;
        while (numbers > 0){
            int lastNumber = Math.abs(numbers % 10);
            if (lastNumber % 2 == 0){
                evenSum = evenSum + lastNumber;
            }
            numbers = numbers / 10;
        }
        return evenSum;
    }

    public static int getMultipleOfEvensAndOdds(int n){
        int evenSum = getEvenSumNumbers(n);
        int oddSum = getOddSumNumbers(n);

        int result = evenSum * oddSum;
        return result;
    }
}
