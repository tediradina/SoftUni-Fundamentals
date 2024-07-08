package Lectures.LAB1_BasicSyntax;

import java.util.Scanner;

public class SumOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= number * 2; i++){
            if (i % 2 != 0){
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
