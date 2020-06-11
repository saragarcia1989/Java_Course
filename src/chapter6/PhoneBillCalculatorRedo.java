package chapter6;

import java.util.Scanner;

public class PhoneBillCalculatorRedo {

    static double overagePrice = 0.25;
    static double taxPrice = 0.15;

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PhoneBillCalculatorRedo billCalculator = new PhoneBillCalculatorRedo();
        PhoneBill user123 = billCalculator.getData();

        double baseCost = user123.getBaseCost();
        double overage = user123.calculateOverage(overagePrice);
        double taxAmount = user123.calculateTax(overage, taxPrice);
        double total = user123.calculateTotal(overage, taxAmount);

        user123.printBill(baseCost, overage, taxAmount, total);

        billCalculator.scanner.close();
    }

    public PhoneBill getData() {

        System.out.println("Enter phone bill ID:");
        int ID = scanner.nextInt();

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter allotted minutes:");
        double allottedMinutes = scanner.nextDouble();

        System.out.println("Enter minutes used:");
        double minutesUsed = scanner.nextDouble();

        return new PhoneBill(ID, baseCost, allottedMinutes, minutesUsed);
    }
}
