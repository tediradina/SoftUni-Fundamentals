package Exercises.Exercise4_Methods;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if (isHaveOddDigits(i) && isSumOfDigitsIsDivisibleBy8(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSumOfDigitsIsDivisibleBy8(int n){
        int sum = 0;
        while (n > 0){
            int lastDigits = n % 10;
            sum = sum + lastDigits;
            n = n / 10;
        }
        if (sum % 8 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isHaveOddDigits(int n){

        while (n > 0){
            int lastDigits = n % 10;
            if (lastDigits % 2 == 1){
                return true;
            }
            n = n / 10;

        }
        return false;
    }
}
