package unit09.inheritance.day36.polymorphicExamples;

public class Car extends Vehicle{
    private int numOfPassengers;

    public Car(String color, int numOfPassengers) {
        super(color);
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public void info() {
        super.info();
        System.out.println();
    }
}
