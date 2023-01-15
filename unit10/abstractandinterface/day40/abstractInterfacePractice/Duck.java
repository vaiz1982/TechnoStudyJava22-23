package unit10.abstractandinterface.day40.abstractInterfacePractice;

public class Duck extends Bird implements Swimmer {
    public Duck(String species) {
        super(species);
    }

    @Override
    public void animalSound() {
        System.out.println("Quack Quack.");
    }

    @Override
    public void fly() {
        System.out.println("The Duck is flying in the sky.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water.");
    }
}
