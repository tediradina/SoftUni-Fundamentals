package Exercises.Exercise1_BasicSyntax;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int strongNumber = number;

        int sum = 0;
        while (number > 0){
            int lastNumber = number % 10;
            int factoriel = 1;
            for (int i = 1; i<= lastNumber; i++){
                factoriel = factoriel * i;
            }
            sum = sum + factoriel;
            number = number / 10;
        }

        if (strongNumber == sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
