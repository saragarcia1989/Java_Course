package chapter10;

public class Orange extends Fruit {

    public Orange(){
        setCalories(55);
    }

    public void peel() {
        System.out.println("Orange peeled.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Orange juice.");
    }
}
