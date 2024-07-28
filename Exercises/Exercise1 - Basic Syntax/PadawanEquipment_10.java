package Exercises.Exercise1_BasicSyntax;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes  = Double.parseDouble(scanner.nextLine());
        double priceBelts  = Double.parseDouble(scanner.nextLine());

        double neededMoneyForLightsabers = ((Math.ceil(countStudents * 0.1)) + countStudents) * priceLightsabers;
        double neededMoneyForRobes = countStudents * priceRobes;
        double neededMoneyForBelts = (countStudents) * priceBelts;

        int freeBelts = countStudents / 6;
        neededMoneyForBelts = neededMoneyForBelts - (freeBelts) * priceBelts;

        double neededTotalMoney = neededMoneyForBelts + neededMoneyForRobes + neededMoneyForLightsabers;

        if (neededTotalMoney <= amountMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", neededTotalMoney);
        }else {
            double neededMoney = Math.abs(neededTotalMoney - amountMoney);
            System.out.printf("George Lucas will need %.2flv more.",neededMoney );
        }

    }
}
