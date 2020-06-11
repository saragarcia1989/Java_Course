package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double overagePrice = 0.25;
    static double tax = 0.15;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double plan = getPlan();
        double overageMinutes = getOverageMinutes();
        double overage = calculateOverage(overageMinutes);
        double tax = calculateTax(plan, overage);

        System.out.println("Phone Bill Statement" +
                "\n Plan: €" + String.format("%.2f", plan)
                + "\n Overage : €" +  String.format("%.2f",overage)
                + "\n Tax : €" +  String.format("%.2f",tax)
                + "\n Total : €" +  String.format("%.2f",calculateTotal(plan, overage, tax)));

        scanner.close();
    }

    public static double getPlan() {
        System.out.println("Enter base cost of the plan:");
        double plan = scanner.nextDouble();
        return plan;
    }

    public static double getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        double overage = scanner.nextDouble();
        return overage;
    }

    public static double calculateTax(double plan, double overPay) {
        double taxAmount = (plan + overPay) * tax;
        return taxAmount;
    }

    public static double calculateOverage(double overageMinutes) {
        double overageAmount = overageMinutes * overagePrice;
        return overageAmount;
    }

    public static double calculateTotal(double plan, double overage, double tax) {
        double total = plan + overage + tax;
        return total;
    }
}