package chapter10;

/*
Create a class called Fruit. This class should contain a field called calories and a method called makeJuice(),
which prints a statement (e.g. “juice is made”).
Then create two subclasses of the Fruit class. For example, you can do Apple and Banana, or Orange and Lemon.
Create method(s) in these classes that are specific to them (e.g. removeSeeds, peel).
Set the calories within the constructors of these subclasses. Override the
makeJuice method to print the specific type of juice that's made.
Create a Market class which tests polymorphism by creating several variations of these objects.
 */

public class Market {

    public static void main(String[] args) {

        Fruit orange = new Orange();
        ((Orange) orange).peel();
        orange.makeJuice();

        Cherry cherry = new Cherry();
        cherry.removeSeed();
        orange.makeJuice();

        Fruit cherry2 = new Cherry();
        ((Cherry) cherry2).removeSeed();
        cherry2.makeJuice();

        squeeze(cherry);
        squeeze(orange);
        squeeze(cherry2);

        System.out.println(orange.getCalories());
        System.out.println(cherry.getCalories());
    }

    public static void squeeze(Fruit fruit) {
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
