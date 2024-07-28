package Exercises.Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){
            String commandName = command[0];
            if (commandName.equals("swap")) {
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);

                int firstNumber = inputArray[index1];
                int secondNumber = inputArray[index2];

                inputArray[index1] = secondNumber;

                inputArray[index2] = firstNumber;

            }else if (commandName.equals("multiply")) {
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);

                int multiply = inputArray[index1] * inputArray[index2];
                inputArray[index1] = multiply;

            }else if (commandName.equals("decrease")){
                for (int i = 0; i <= inputArray.length - 1; i++){
                    inputArray[i] = inputArray[i] - 1;
                }

            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i <= inputArray.length - 1; i++){
            if (i == inputArray.length - 1){
                System.out.print(inputArray[i]);
            }else {
                System.out.print(inputArray[i] + ", ");
            }
        }
    }
}
