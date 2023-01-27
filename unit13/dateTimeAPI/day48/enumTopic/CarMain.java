package unit13.dateTimeAPI.day48.enumTopic;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", Car.Color.WHITE);
        Car car2 = new Car("Honda", Car.Color.BLACK);
        Car car3 = new Car("Mazda", Car.Color.BLUE);
        Car car4 = new Car("Acura", Car.Color.RED);

        List<Car> cars = new ArrayList<>(List.of(car1, car2, car3, car4));

        System.out.println(cars);

        System.out.println("Black Cars: ");
        for (Car car : cars) {
            if (car.getColor().equals(Car.Color.BLACK)) {
                System.out.println(car);
            }
        }
    }
}
