package Exercises.Exercise1_BasicSyntax;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double money = 0;
        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 ||
                coins == 1 || coins == 2 ) {
                money = money + coins;
            }else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        String command = scanner.nextLine();


        boolean flag = false;
        while (!command.equals("End")){
            double price = 0;
            switch (command){
                case "Nuts":
                    price = 2;
                    break;

                case "Water":
                    price = 0.7;
                    break;

                case "Crisps":
                    price = 1.5;
                    break;

                case "Soda":
                    price = 0.8;
                    break;

                case "Coke":
                    price = 1;
                    break;

                default:
                    System.out.println("Invalid product");
                    flag = true;
                    break;
            }

            if (!flag) {
                if (money >= price) {
                    System.out.printf("Purchased %s%n", command);
                    money = money - price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}
