package chapter13;

/*
Write the following statement and execute:
int c = 30/0;
Update program to handle exception.
Print a statement after division to say "Division is fun".
This statement should be outputted no matter what.
 */

public class DividingByZero {

    public static void main(String[] args) {

        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Not valid division");
            e.printStackTrace();
        } finally {
            System.out.println("Division is fun");
        }
    }
}
