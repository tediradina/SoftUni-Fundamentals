package Lectures.LAB4_Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();
        switch (typeInput){
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());

                int result = getMax(firstNumber,secondNumber);
                System.out.println(result);
                break;

            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);

                char resultChar = getMax(firstChar, secondChar);
                System.out.println(resultChar);
                break;

            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();

                String resultString = getMax(firstString, secondString);
                System.out.println(resultString);
                break;
        }
    }

    public static int getMax(int firstNum, int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }else {
            return secondNum;
        }
    }

    public static char getMax(char firstChar, char secondChar){
        if (firstChar > secondChar){
            return firstChar;
        }else {
            return secondChar;
        }
    }

    public static String getMax(String firstString, String secondString){
        if (firstString.compareTo(secondString) >= 0){
            return firstString;
        }else {
            return secondString;
        }
    }
}
