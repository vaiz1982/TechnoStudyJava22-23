package unit10.abstractandinterface.day39.abstractclassesPractice;

import java.util.ArrayList;

public class Farm {
    public static void main(String[] args) {
        ArrayList<Animal> farm = new ArrayList<>();
        farm.add(new Pig());
        farm.add(new Pig());
        farm.add(new Pig());
        farm.add(new Pig());
        farm.add(new Pig());
        farm.add(new Dog());
        farm.add(new Cat());
        farm.add(new Cow());
        farm.add(new Cow());
        farm.add(new Cow());
        farm.add(new Cow());
        farm.add(new Cow());
        farm.add(new Cow());

        for (Animal animal:farm) {
            animal.makeSound();
        }
    }
}
