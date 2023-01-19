package unit11.collections.day42.sortingListByComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarListMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(180, "Honda"));
        cars.add(new Car(170, "Hyundai"));
        cars.add(new Car(160, "Kia"));
        cars.add(new Car(200, "BMW"));
        cars.add(new Car(220, "Porsche"));

        System.out.println(cars);

        cars.sort(Comparator.naturalOrder());
        System.out.println("After ordering by the top speed");
        System.out.println(cars);

    }
}
