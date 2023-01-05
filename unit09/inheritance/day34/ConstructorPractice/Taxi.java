package unit09.inheritance.day34.ConstructorPractice;

public class Taxi extends Car{
    private int numOfPassengers;

    public Taxi(String make, double price, int numOfPassengers) {
        super(make, price);
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    /*Create a taxi class extended from the car class
add int numberOfPassengers instance variable
Create a constructor using
the super() constructor with parameters from the superclass.*/
}
