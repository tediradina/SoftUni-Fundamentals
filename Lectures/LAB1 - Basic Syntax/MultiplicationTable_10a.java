package Lectures.LAB1_BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable_10a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = times; i <= 10; i++){
            int sum = number * i;
            System.out.printf("%d X %d = %d%n", number, i, sum);
        }

        if (times > 10){
            int sum = number * times;
            System.out.printf("%d X %d = %d%n", number, times, sum);
        }
    }
}
