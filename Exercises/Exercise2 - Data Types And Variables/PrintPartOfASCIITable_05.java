package Exercises.Exercise2_DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());

        for (int i = firstSymbol; i <= lastSymbol; i++){
            char asciiCode = (char) i;
            System.out.printf("%c ", asciiCode);
        }
    }
}
