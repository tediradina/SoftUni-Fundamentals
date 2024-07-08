package Exercises.Exercise2_DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int occupiedSpace  = 0;
        int freeCapacity = 255;
        for (int i = 1; i <= numberOfLines; i++){
            int quantities = Integer.parseInt(scanner.nextLine());

            if (freeCapacity >= quantities){
                occupiedSpace = occupiedSpace + quantities;
                freeCapacity = freeCapacity - quantities;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%d", occupiedSpace);
    }
}
