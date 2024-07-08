package Exercises.Exercise1_BasicSyntax;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double neededMoney = 0;
        for (int countGamesLost = 1; countGamesLost <= lostGames; countGamesLost++) {
            if (countGamesLost % 2 == 0) {
                neededMoney = neededMoney + headsetPrice;
            }

            if (countGamesLost % 3 == 0) {
                neededMoney = neededMoney + mousePrice;
            }
            if (countGamesLost % 6 == 0) {
                neededMoney = neededMoney + keyboardPrice;
            }
            if (countGamesLost % 12 == 0) {
                neededMoney = neededMoney + displayPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", neededMoney);

    }
}
