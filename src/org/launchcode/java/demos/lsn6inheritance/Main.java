package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat(); //the eat method was defined in cat, but may be called in HouseCat bc of inheritance.
        System.out.println(garfield.isTired()); //prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); //prints 13

        // showing what the @Override annotation does //
        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

        //Casting//
        Cat suki = new HouseCat("Suki", 8);

        // Calls HouseCat's noise() method
        suki.noise(); // Hello, my name is Suki!

        // Results in a compiler error, since Cat
        // doesn't have such a method
//        suki.isSatisfied();
    }
}