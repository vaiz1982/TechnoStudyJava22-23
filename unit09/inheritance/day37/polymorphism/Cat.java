package unit09.inheritance.day37.polymorphism;

public class Cat extends Animal{

    @Override
    public void animalSound() {
        System.out.println("Cat is meowing.");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}
