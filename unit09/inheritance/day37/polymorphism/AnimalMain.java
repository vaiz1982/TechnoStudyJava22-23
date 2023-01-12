package unit09.inheritance.day37.polymorphism;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> farm = new ArrayList<>();
        farm.add(new Dog());
        farm.add(new Pig());
        farm.add(new Bird());
        farm.add(new Cat());
        farm.add(new Animal());

        System.out.println(farm.get(2) instanceof Animal);
        System.out.println(farm.get(2) instanceof Bird);
        System.out.println(farm.get(2) instanceof Cat);

//        for (AnimalAbstract animal : farm) {
//            animal.animalSound();
//            if(animal instanceof Cat){
//                ((Cat) animal).sleep();
//            } else if(animal instanceof Bird){
//                ((Bird) animal).fly();
//            }
//        }

//        AnimalAbstract cat = new Cat();
//        cat.animalSound();
//        ((Cat) cat).sleep();


    }
}
