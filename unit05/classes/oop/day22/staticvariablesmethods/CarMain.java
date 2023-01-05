package unit05.classes.oop.day22.staticvariablesmethods;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("The number of cars: " + Car.getNumberOfCars());
        Car car1 = new Car("Honda", 100, 2022);
        System.out.println("The number of cars: " + Car.getNumberOfCars());
        Car car2 = new Car("Toyota", 10000, 2012);
        Car car3 = new Car("Chrysler", 0, 2022);
        System.out.println("The number of cars: " + Car.getNumberOfCars());
        Car.print();
    }
}
