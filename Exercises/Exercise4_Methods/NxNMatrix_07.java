package Exercises.Exercise4_Methods;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s%n", getRepeatTextInRow(n));
        }
    }

    public static String getRepeatTextInRow(int n) {
        String repeatTextInRow = "";
        for (int repeat = 1; repeat <= n; repeat++) {
            repeatTextInRow = repeatTextInRow + n + " ";
        }
        return repeatTextInRow;
    }

}
