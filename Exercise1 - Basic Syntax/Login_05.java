package Exercises.Exercise1_BasicSyntax;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String password = scanner.nextLine();
        String correctPassword = "";

        for (int i = user.length() - 1; i >= 0; i--){
            char letter = user.charAt(i);
            correctPassword = correctPassword + letter;
        }

        int fail = 0;
        while (!password.equals(correctPassword)){
            fail++;
            if (fail <= 3){
                System.out.println("Incorrect password. Try again.");
                password = scanner.nextLine();
            }else {
                System.out.printf("User %s blocked!", user);
                return;
            }
        }

        System.out.printf("User %s logged in.", user);

    }
}
