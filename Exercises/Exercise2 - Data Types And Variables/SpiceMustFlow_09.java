package Exercises.Exercise2_DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalYield = 0;
        int days = 0;
        while (startingYield >= 100){
            days++;
            totalYield = totalYield + startingYield - 26;
            startingYield = startingYield - 10;
        }

        if (startingYield >= 26){
            totalYield = totalYield - 26;
            if (totalYield < 26){
                totalYield = 0;
            }
        }

        System.out.println(days);
        System.out.println(totalYield);

    }
}
