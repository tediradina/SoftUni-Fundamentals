package Exercises.Exercise2_DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        int maxSnowballSnow = Integer.MIN_VALUE;
        int maxSnowballTime = Integer.MIN_VALUE;
        int maxSnowballQuality = Integer.MIN_VALUE;
        for (int i = 1; i <= numberOfSnowballs; i++){
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow * 1.0 / snowballTime),snowballQuality );
            if (snowballValue >= maxValue){
                maxValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow, maxSnowballTime,maxValue, maxSnowballQuality );
    }
}
