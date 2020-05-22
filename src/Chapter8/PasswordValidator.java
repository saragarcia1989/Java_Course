package Chapter8;
/*
Validate the complexity of a proposed password by assuring it meets
these rules:
* at least eight characters long
* contain an uppercase letter
* contain a special character
* not contain the username
* not be the same as the old password.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your user name");
        String userName = scanner.next();

        System.out.println("Enter your old password:");
        String oldPassword = scanner.next();

        System.out.println("Enter your new password:");
        String newPassword = scanner.next();


        scanner.close();

        if (!validatePasswordLength(newPassword)) {
            System.out.println("Password must be at least eight characters long.");
        } else if (!validateUpperCase(newPassword)) {
            System.out.println("Password must contain an uppercase letter");
        } else if (!validateSpecialCharacter(newPassword)) {
            System.out.println("Password must contain an special character");
        } else if (!checkUserName(newPassword, userName)) {
            System.out.println("The new password cannot contain username");
        } else if (!checkOldPassword(newPassword, oldPassword)) {
            System.out.println("The new password cannot be the same as the old password");
        } else
            System.out.println("Valid password.");

    }

    public static boolean validatePasswordLength(String newPassword) {

        if (newPassword.length() < PASSWORD_LENGTH) {
            return false;
        } else
            return true;
    }

    public static boolean validateUpperCase(String newPassword) {

        Pattern pattern = Pattern.compile("[^a-z]");
        Matcher matcher = pattern.matcher(newPassword);
        boolean hasUpperCaseLetter = matcher.find();

        return hasUpperCaseLetter;
    }

    public static boolean validateSpecialCharacter(String newPassword) {
        Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(newPassword);
        boolean hasSpecialCharacter = matcher.find();

        return hasSpecialCharacter;

    }

    public static boolean checkUserName(String newPassword, String userName) {
        if (newPassword.toUpperCase().contains(userName.toUpperCase())) {
            return false;
        } else
            return true;
    }

    public static boolean checkOldPassword(String newPassword, String oldPassword) {
        if (newPassword.equals(oldPassword)) {
            return false;
        }
        return true;
    }
}

