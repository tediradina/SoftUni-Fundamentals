package Exercises.Exercise4_Methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!isPasswordLengthIsValid(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isPasswordConsistOnlyOfLetterAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!isPasswordHaveAtLeast2Digits(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordHaveAtLeast2Digits(password) && isPasswordConsistOnlyOfLetterAndDigits(password)
                && isPasswordLengthIsValid(password)){
            System.out.println("Password is valid");
        }
    }

    public static boolean isPasswordLengthIsValid(String password){
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPasswordConsistOnlyOfLetterAndDigits(String password){
        for (char letter : password.toCharArray()) {
            if (Character.isLetterOrDigit(letter)){

            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPasswordHaveAtLeast2Digits(String password){
        int countDigit = 0;
        for (char letter : password.toCharArray()) {
            if (Character.isDigit(letter)){
                countDigit++;
            }
        }
        if (countDigit >= 2){
            return true;
        }else {
            return false;
        }
    }
}
