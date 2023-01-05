package unit09.inheritance.day34.ConstructorPractice;

public class CarMain {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("Toyota", 15000, 6 );
        System.out.println("The taxi is a " + taxi.getMake() + " with "
        +taxi.getNumOfPassengers() + " seats.");
    }
}
