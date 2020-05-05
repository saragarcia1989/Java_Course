package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {

        //Declare variables you already know

        double cent10 = .10;
        double cent20 = .20;
        double cent50 = .50;

        double euro = 1.00;

        //Ask for the quantity

        System.out.println("How many 10c coins?");
        Scanner scanner = new Scanner(System.in);
        int tens = scanner.nextInt();

        System.out.println("How many 20c coins?");
        int twenties = scanner.nextInt();

        System.out.println("How many 50c coins?");
        int fifties = scanner.nextInt();

        scanner.close();


        //Count up the value of all of the change that they answered

        double total = cent10 * tens + cent20 * twenties + cent50 * fifties;

        double overTotal = total - euro;

        double belowTotal = euro - total;


        //Print the message

        if (total == euro) {
            System.out.println("Congrats! You enter exactly 1€");
        } else if (total > euro) {
            System.out.println("Sorry, but you enter " + String.format("%.2f", overTotal) + " cents over 1€.");
        } else if (total < euro) {
            System.out.println("Sorry, but you enter " + String.format("%.2f", belowTotal) + " cents below 1€.");
        }
    }
}
