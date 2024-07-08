package Exercises.Exercise2_DataTypesAndVariables;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double numberOfElevate = numberOfPeople * 1.00/ capacity ;

        System.out.printf("%.0f", Math.ceil(numberOfElevate));
    }
}
