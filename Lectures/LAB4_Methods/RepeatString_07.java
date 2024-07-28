package Lectures.LAB4_Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String output = getTextRepeat(inputText,n);
        System.out.println(output);
    }

    public static String getTextRepeat(String text, int n){
        String result = "";
        for (int i = 1; i <= n; i++){
            result += text;
        }
        return result;
    }
}
