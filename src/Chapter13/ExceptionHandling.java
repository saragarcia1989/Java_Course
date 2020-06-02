package Chapter13;

/*
Write a program that creates a new file.
Handle exceptions that may occur.
 */
/*
Write a program that reads decimal number from a file.
Handle exceptions FileNotFoundException and
InputMismatchException.
 */
/*
Write a program that creates a new file
but does not catch the exceptions.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

//        createNewFile();
        numbersExceptionHandling();

    }

    public static void createNewFile() {

        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();

        } catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }
    public static void createNewFileRethrow() throws IOException {

        File file = new File("resources/nonexistent.txt");
            file.createNewFile();
    }

    public static void numbersExceptionHandling() {

        File file = new File("Resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }
}
