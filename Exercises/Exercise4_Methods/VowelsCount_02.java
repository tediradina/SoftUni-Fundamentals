package Exercises.Exercise4_Methods;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine().toLowerCase();
        printCountOfVowels(textInput);
    }

    public static void printCountOfVowels(String text){
        int countVowels = 0;
        for (char element : text.toCharArray()) {
            if (element == 'a' || element == 'o' || element == 'u'
                    || element == 'e' || element == 'i'){
                countVowels++;
            }
        }
        System.out.println(countVowels);

    }
}
