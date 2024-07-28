package Lectures.LAB1_BasicSyntax;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        if (day.equals("Weekday")){
            if (age >= 0 && age <= 18){
                ticketPrice = 12;
            }else if (age > 18 && age <= 64){
                ticketPrice = 18;
            }else if (age > 64 && age <= 122){
                ticketPrice = 12;
            }else {
                System.out.println("Error!");
                return;
            }

        }else if (day.equals("Weekend")){
            if (age >= 0 && age <= 18){
                ticketPrice = 15;
            }else if (age > 18 && age <= 64){
                ticketPrice = 20;
            }else if (age > 64 && age <= 122){
                ticketPrice = 15;
            }else {
                System.out.println("Error!");
                return;
            }

        }else if (day.equals("Holiday")){
            if (age >= 0 && age <= 18){
                ticketPrice = 5;
            }else if (age > 18 && age <= 64){
                ticketPrice = 12;
            }else if (age > 64 && age <= 122){
                ticketPrice = 10;
            }else {
                System.out.println("Error!");
                return;
            }
        }
        System.out.println(ticketPrice + "$");
    }
}
