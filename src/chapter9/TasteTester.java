package chapter9;

/*
- Create a superclass called Cake that has two fields: flavor and price,
and a constructor that accepts the flavor. Getter and setter methods should be created
for the fields.
- Create a BirthdayCake class which inherits from Cake and has a field called candles.
Its constructor should set the flavor. Include getter and setter method.
- Create a WeddingCake class which inherits from Cake and has a field called tiers. Its
constructor should set the flavor. Include getter and setter method.
- Create a TasteTester class to test out your inheritance by printing the flavor and
price of each of these types of cakes.
 */

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("coconut");
        cake.setPrice(19.90);

        System.out.println("Wedding cake flavor is " + cake.getFlavor() + " and the price is €" + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(20);

        System.out.println("Birthday cake flavor is " + birthdayCake.getFlavor() + " and the price is €" + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(100);

        System.out.println("Wedding cake flavor is " + weddingCake.getFlavor() + " and the price is €" + weddingCake.getPrice());
    }
}
