package Exercises.Exercise4_Methods;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            System.out.println(isPalindromeThisInteger(input));

            input = scanner.nextLine();
        }
    }

    public static boolean isPalindromeThisInteger(String input){
        String reverseInput = "";
        for (int i = input.length() - 1; i >= 0; i--){
            char letter = input.charAt(i);
            reverseInput = reverseInput + letter;
        }

        if (input.equals(reverseInput)) {
            return true;
        }else {
            return false;
        }

    }
}
