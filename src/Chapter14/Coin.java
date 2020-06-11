package chapter14;

import java.util.Random;

public class Coin {

    private static String side;

    public static final String HEADS = "heads";

    public static final String TAILS = "tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public static String flip() {

        String[] array = {HEADS, TAILS};
        Random random = new Random();

        side = array[random.nextInt(array.length)];

        return side;
    }
}
