package Exercises.Exercise1_BasicSyntax;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        double totalPriceOrders = 0;
        for (int i = 1; i <= orders; i++){
            double priceOrder = 0;
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());

            priceOrder = (days * countCapsules) * priceCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", priceOrder);

            totalPriceOrders = totalPriceOrders + priceOrder;
        }

        System.out.printf("Total: $%.2f", totalPriceOrders);

    }
}
