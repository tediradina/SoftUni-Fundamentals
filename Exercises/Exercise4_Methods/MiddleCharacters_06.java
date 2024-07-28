package Exercises.Exercise4_Methods;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        System.out.printf("%s", getMiddleCharacter(textInput));
    }

    public static String getMiddleCharacter(String text){
        String middleChar = "";

            if (text.length() % 2 == 0){
                int firstIndex = (text.length() / 2) - 1;
                int secondIndex = text.length() / 2;

                middleChar = text.charAt(firstIndex) + "" + text.charAt(secondIndex);
            }else {
                int index = text.length() / 2;
                middleChar = "" + text.charAt(index);
            }
        return middleChar;
    }
}
