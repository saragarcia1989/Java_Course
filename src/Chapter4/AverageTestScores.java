package Chapter4;

/*
NESTED LOOPS:
Find the average test scores for each student in the class.
There are 24 students and 4 tests.
 */

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOFTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all the students
        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;
            for (int j = 0; j < numberOFTests; j++) {
                System.out.println("Enter the score for test #" + (j + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numberOFTests;
            System.out.println("The test average for student #" + (i + 1) + " is " + average);
        }
        scanner.close();
    }

}
