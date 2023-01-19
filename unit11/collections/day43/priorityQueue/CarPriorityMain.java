package unit11.collections.day43.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CarPriorityMain {
    public static void main(String[] args) {
        Queue<Car> carsByYear
                = new PriorityQueue<>(Comparator.comparing(Car::getYear).reversed());
        carsByYear.offer(new Car("BMW", 2013));
        carsByYear.offer(new Car("Toyota", 2023));
        carsByYear.offer(new Car("Honda", 1999));
        carsByYear.offer(new Car("Mazda", 2021));
        carsByYear.offer(new Car("Jeep", 2023));
        System.out.println(carsByYear);
        System.out.println(carsByYear.poll());
        System.out.println(carsByYear);
        System.out.println(carsByYear.poll());
        System.out.println(carsByYear);
        System.out.println(carsByYear.poll());
        System.out.println(carsByYear);

    }
}
