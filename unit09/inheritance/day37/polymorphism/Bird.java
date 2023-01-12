package unit09.inheritance.day37.polymorphism;

public class Bird extends Animal {
    @Override
    public void animalSound() {
        System.out.println(this.getClass().getSimpleName() + " is tweeting.");
    }
    public void fly(){
        System.out.println("Flying");
    }
}
