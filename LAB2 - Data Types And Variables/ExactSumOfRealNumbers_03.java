package Lectures.LAB2_DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= numbers; i++){
            BigDecimal num = new BigDecimal(scanner.nextLine());
            sum = sum.add(num);
        }

        System.out.println(sum);
    }
}
