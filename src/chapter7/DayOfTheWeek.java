package chapter7;

/*
Make an array that holds the textual values of the days of the week.
Have the user input a number corresponding to the day of the week.
Assume the week starts on Monday.
Your program should output the String that represents the day of the week.
Example: User inputs the number 1, your program should print "Monday".
 */

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Choose a day by inputting a number");
        int index = scanner.nextInt();

        System.out.println("The day you chose is " + assignNumberToDay(week, index));

        scanner.close();
    }

    public static String assignNumberToDay(String[] array, int index) {
        String day;
        day = array[index - 1];

        return day;
    }

}