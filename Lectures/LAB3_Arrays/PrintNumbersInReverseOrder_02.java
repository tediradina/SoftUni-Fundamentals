package Lectures.LAB3_Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        Integer[] numbersArray = new Integer[numbers];
        for (int i = 0; i <= numbers - 1; i++){
            int num = Integer.parseInt(scanner.nextLine());
            numbersArray[i] = num;
        }

        for (int i = numbersArray.length - 1; i >= 0; i--){
            System.out.print(numbersArray[i] + " ");
        }
    }
}
