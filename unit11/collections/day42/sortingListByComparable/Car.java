package unit11.collections.day42.sortingListByComparable;

public class Car implements Comparable<Car> {
    private int maxSpeed;
    private String make;

    public Car(int maxSpeed, String make) {
        this.maxSpeed = maxSpeed;
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", make='" + make + '\'' +
                '}';
    }


    @Override
    public int compareTo(Car o) {
        return this.maxSpeed - o.maxSpeed;
    }
}
