package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int [] availableSpace = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int waiting = people;
        int availableSeat = 0;
        for (int emptySeat : availableSpace) {
            availableSeat = availableSeat + (4 - emptySeat);
        }

            for (int wagons = 0; wagons <= availableSpace.length - 1; wagons++){
                int boardedPassengers = availableSpace[wagons];
                while (waiting > 0){
                    if (availableSpace[wagons] < 4) {
                        boardedPassengers = boardedPassengers + 1;
                        waiting -= 1;
                        availableSeat -= 1;
                        availableSpace[wagons] = boardedPassengers;
                    } else {
                        break;
                    }

                }
            }

            if (waiting > 0){
                System.out.printf("There isn't enough space! %d people in a queue!%n", waiting);
            }else {
                if (availableSeat > 0) {
                    System.out.println("The lift has empty spots!");
                } else {

                }
            }

        for (int peopleInWagons : availableSpace) {
            System.out.print(peopleInWagons + " ");
        }

    }
}
//
//
//
//
//
//
//package Exercises.Exercise3_Arrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class TheLift_10 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int people = Integer.parseInt(scanner.nextLine());
//        int[] availableSpace = Arrays
//                .stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        int waiting = people;
//        int maxCapacity = availableSpace.length * 4;
//        int availableSeats = 0;
//
//        // Calculate initial available seats
//        for (int seats : availableSpace) {
//            availableSeats += 4 - seats;
//        }
//
//        for (int wagons = 0; wagons < availableSpace.length; wagons++) {
//            int boardedPassengers = availableSpace[wagons];
//            while (waiting > 0 && boardedPassengers < 4) {
//                boardedPassengers++;
//                waiting--;
//                availableSeats--;
//            }
//            availableSpace[wagons] = boardedPassengers;
//        }
//
//        boolean hasEmptySpots = false;
//        for (int seats : availableSpace) {
//            if (seats < 4) {
//                hasEmptySpots = true;
//                break;
//            }
//        }
//
//        if (waiting > 0) {
//            System.out.printf("There isn't enough space! %d people in a queue!%n", waiting);
//        } else if (hasEmptySpots) {
//            System.out.println("The lift has empty spots!");
//        }
//
//        for (int peopleInWagons : availableSpace) {
//            System.out.print(peopleInWagons + " ");
//        }
//    }
//}
