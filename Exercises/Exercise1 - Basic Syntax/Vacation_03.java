package Exercises.Exercise1_BasicSyntax;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double totalSum = 0;
        if (day.equals("Friday")){
            if (typeOfGroup.equals("Students")){
                price = 8.45;
            }else if (typeOfGroup.equals("Business")){
                price = 10.9;
            }else if (typeOfGroup.equals("Regular")){
                price = 15;
            }

        }else if (day.equals("Saturday")){
            if (typeOfGroup.equals("Students")){
                price = 9.8;
            }else if (typeOfGroup.equals("Business")){
                price = 15.6;
            }else if (typeOfGroup.equals("Regular")){
                price = 20;
            }

        }else if (day.equals("Sunday")){
            if (typeOfGroup.equals("Students")){
                price = 10.46;
            }else if (typeOfGroup.equals("Business")){
                price = 16;
            }else if (typeOfGroup.equals("Regular")){
                price = 22.5;
            }
        }

        if (typeOfGroup.equals("Students")){
            totalSum = price * groupOfPeople;
            if (groupOfPeople >= 30){
                totalSum = totalSum - (totalSum * 0.15);
            }
        }else if (typeOfGroup.equals("Business")){
            totalSum = price * groupOfPeople;
            if (groupOfPeople >= 100){
                totalSum = totalSum - (price * 10);
            }
        }else if (typeOfGroup.equals("Regular")){
            totalSum = price * groupOfPeople;
            if (groupOfPeople >= 10 && groupOfPeople <= 20){
                totalSum = totalSum - (totalSum * 0.05);
            }
        }

        System.out.printf("Total price: %.2f", totalSum);

    }
}
