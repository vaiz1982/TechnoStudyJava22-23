package unit09.inheritance.day37.polymorphicReview;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("Yellow", 2);
        //car.info();
        Vehicle anotherVehicle = new Vehicle("Blue");

        ArrayList<Vehicle> vehicles =
                new ArrayList<>(List.of(new Vehicle("Yellow"), new Car("Red", 7), car, new Car("Green", 4), anotherVehicle, new Vehicle("Gray")));
        Integer a = 5;
        Integer b = 7;
        List.of(a, b);
        List.of(5, 7);

        Vehicle vehicleA = new Vehicle("Blue");
        Vehicle vehicleB = new Vehicle("Yellow");
        List.of(vehicleB, vehicleA);
        List.of(new Vehicle("Blue"), new Vehicle("Yellow"));

        vehicles.add(new Car("White", 2));

        for (Vehicle vehicle : vehicles) {
            vehicle.info();
        }

    }
}
