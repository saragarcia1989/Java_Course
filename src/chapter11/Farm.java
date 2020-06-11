package chapter11;

/*
Create an abstract class called Animal, which declares an
abstract method called makeSound(), and implements a
non-abstract method called eat().
Create a Pig class and a Duck class that both extend the
Animal class.
Create a Farm class to test the implementations.
 */

public class Farm {

    public static void main(String[] args) {

        Animal lucas = new Duck();
        lucas.eat();
        lucas.makeSound();

        lucas = new Pig();
        lucas.eat();
        lucas.makeSound();

        Pig peggy = new Pig();
        peggy.eat();
        peggy.makeSound();

        Duck donald = new Duck();
        donald.makeSound();
    }
}
