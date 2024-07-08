package Exercises.Exercise2_DataTypesAndVariables;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance  = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor  = Integer.parseInt(scanner.nextLine());

        int firstPower = pokePower;
        int countPoke = 0;
        while (pokePower >= distance){
           pokePower = pokePower - distance;
           countPoke++;
           if (pokePower == firstPower / 2){
               if (exhaustionFactor != 0){
                   pokePower = pokePower / exhaustionFactor;
               }
           }
        }
        System.out.println(pokePower);
        System.out.println(countPoke);
    }
}
