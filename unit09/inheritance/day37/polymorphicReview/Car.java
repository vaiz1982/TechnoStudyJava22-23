package unit09.inheritance.day37.polymorphicReview;

public class Car extends Vehicle{
    private int numOfPassengers;

    public Car(String color, int numOfPassengers) {
        super(color);
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public void info() {
        super.info();
        System.out
                .println("You can ride with " + numOfPassengers+ " passengers.");
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }
}
