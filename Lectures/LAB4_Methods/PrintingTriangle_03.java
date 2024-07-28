package Lectures.LAB4_Methods;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        printTriangles(numberInput);
    }

    public static void printTriangles(int number){
        for (int i = 1; i <= number; i++){
            for (int rows = 1; rows <= i; rows++){
                System.out.print(rows + " ");
            }
            System.out.println();
        }

        for (int j = number - 1; j >= 1; j--){
            for (int rowReverse = 1; rowReverse <= j; rowReverse++){
                System.out.print(rowReverse + " ");
            }
            System.out.println();
        }
    }
}
