package Chapter10;

public class Cherry extends Fruit {

    public Cherry() {
        setCalories(35);
    }

    public void removeSeed() {
        System.out.println("Cherry seed removed.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Cherry juice.");
    }
}
