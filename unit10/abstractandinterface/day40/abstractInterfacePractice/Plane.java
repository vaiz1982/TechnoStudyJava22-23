package unit10.abstractandinterface.day40.abstractInterfacePractice;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("The pilot is flying the plane.");
    }
}
