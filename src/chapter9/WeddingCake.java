package chapter9;

public class WeddingCake extends Cake {

    public WeddingCake() {
        super("mocha");
    }

    private int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
