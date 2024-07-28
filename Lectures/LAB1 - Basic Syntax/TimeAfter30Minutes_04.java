package Lectures.LAB1_BasicSyntax;

import java.util.Scanner;

public class TimeAfter30Minutes_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumMinutes = (hour * 60) + minutes + 30;

        int newHour = sumMinutes / 60;
        int newMinutes = sumMinutes % 60;

        if (newHour > 23){
            newHour = 0;
        }
        System.out.printf("%d:%02d", newHour, newMinutes);
    }
}
