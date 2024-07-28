package Lectures.LAB3_Arrays;

import java.sql.Array;
import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String[] day =  {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

            if (number >= 1 && number <= 7){
                String dayName = day[number -1];
                System.out.println(dayName);
            }else {
                System.out.println("Invalid day!");
            }

    }
}
