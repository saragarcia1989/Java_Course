package Chapter4;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.

After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.

Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {

        //Declare variables you know
        int totalSpaces = 20;
        int roll = 5;

        //Proceed to get and sum random numbers

        int total = 0;
        for (int i = 0; i < roll; i++) {

            Random random = new Random();
            int die = random.nextInt(6) + 1;

            int currentSpace = die + total;
            int spacesLeft = totalSpaces - currentSpace;
            total = total + die;

            if (currentSpace < totalSpaces) {
                System.out.println("Roll # " + (i + 1) + ": you've rolled a " + die + ". You are now on space " + currentSpace + " and have " + spacesLeft + " more to go.");
            }

            if (currentSpace == totalSpaces) {
                System.out.println("Roll # " + (i + 1) + ": you've rolled a " + die + ". You're on space 20. Congrats! You win.");
                break;
            } else if (currentSpace > totalSpaces) {
                System.out.println("Roll # " + (i + 1) + ": you've rolled a " + die + ". Sorry, you lost. You got over 20. Good luck for the next time!");
                break;
            }

        }
        if (total < totalSpaces)
            System.out.println("Sorry, you lost. You don't reach 20. Good luck for the next time!");

    }

}

