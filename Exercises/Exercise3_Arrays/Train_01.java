package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        Integer [] wagonsArray = new Integer[wagons];
        int sum = 0;
        for(int i = 0; i <= wagons - 1; i++){
            int people = Integer.parseInt(scanner.nextLine());
            sum = sum + people;
            wagonsArray[i] = people;
        }
        for (int elements : wagonsArray) {
            System.out.print(elements + " ");
        }

        System.out.printf("%n%d", sum);
    }
}
