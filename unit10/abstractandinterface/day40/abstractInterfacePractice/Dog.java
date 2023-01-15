package unit10.abstractandinterface.day40.abstractInterfacePractice;

public class Dog extends Animal implements Swimmer{
    private String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    @Override
    public void animalSound() {
        System.out.println("Woof woof.");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming in dog swim style.");
    }
}
