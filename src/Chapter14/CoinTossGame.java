package Chapter14;

import java.util.Scanner;

import static Chapter14.Coin.*;

public class CoinTossGame {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        boolean isValid;

        do {
            System.out.println("Choose heads or tails");
            String guess1 = scanner.next();
            isValid = optionValidation(guess1);
            player1.setGuess(guess1);
        } while (!isValid);

        if (player1.getGuess().equalsIgnoreCase(HEADS)) {
            player2.setGuess(TAILS);
        } else {
            player2.setGuess(HEADS);
        }

        String side = flip();

        System.out.println(side);

        if (side.equals(player1.getGuess())) {
            System.out.println("Player1 is the winner!");
        } else {
            System.out.println("Player2 is the winner!");
        }

        scanner.close();
    }

    public static boolean optionValidation(String guess) {
        if (guess.equalsIgnoreCase(HEADS) || guess.equalsIgnoreCase(TAILS)) {
            return true;
        }
        return false;
    }
}
