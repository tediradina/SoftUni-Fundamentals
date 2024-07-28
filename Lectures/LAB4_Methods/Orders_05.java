package Lectures.LAB4_Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String orderInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());

        double priceOrders = 0;
        switch (orderInput){
            case "coffee":
                priceOrders = 1.5;
                break;
            case "water":
                priceOrders = 1;
                break;
            case "coke":
                priceOrders = 1.4;
                break;
            case "snacks":
                priceOrders = 2;
                break;

        }
        printTotalSum(quantityInput, priceOrders);

    }

    public static void printTotalSum(int quantity, double price){
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);
    }


}
