package unit10.abstractandinterface.day40.abstractInterfacePractice;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Duck ducky = new Duck("Waterfowl Specie");
        Dog dog = new Dog("Pekin", "Husky");
        Plane boeing = new Plane();
//        dog.animalSound();
//        dog.swim();
//
//        ducky.fly();
//        ducky.swim();
//        ducky.animalSound();
//
//        boeing.fly();

        ArrayList<Flyable> flyables = new ArrayList<>();
        flyables.add(ducky);
        flyables.add(boeing);

        for (Flyable flyable : flyables) {
            flyable.fly();
        }

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(dog);
        swimmers.add(ducky);

        for (Swimmer swimmer : swimmers) {
            swimmer.swim();
        }

    }
}
