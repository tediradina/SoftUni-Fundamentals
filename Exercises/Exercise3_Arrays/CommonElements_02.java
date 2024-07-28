package Exercises.Exercise3_Arrays;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstArray = firstInput.split(" ");
        String[] secondArray = secondInput.split(" ");

            for (String elementSecondArray : secondArray) {
                for (String elementFirstArray : firstArray) {
                    if (elementFirstArray.equals(elementSecondArray)){
                        System.out.print(elementFirstArray + " ");
                        break;
                }
            }

        }
    }
}
