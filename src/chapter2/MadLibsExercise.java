package chapter2;

import java.util.Scanner;

public class MadLibsExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Ask a user for a season of the year
        System.out.println("Enter a season of the year");
        String season = scanner.next();

        //2. Ask for a whole number
        System.out.println("Enter a whole number");
        int randomNumber = scanner.nextInt();

        //3. Ask for an adjective
        System.out.println("Enter an adjective");
        String randomAdjective = scanner.next();

        scanner.close();

        //4. Output the result: "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."
        System.out.println("On a " + randomAdjective + " " + season + " day, I drink a minimum of " + randomNumber + " cups of coffee.");

    }

}
