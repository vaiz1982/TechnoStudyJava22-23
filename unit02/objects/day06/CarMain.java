package unit02.objects.day06;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Blue",30);
        Car car2 = new Car("White", 1000);
        Car car3 = new Car("Burgundy");
        Car car4 = new Car();

        car1.printCarInfo();
        car2.printCarInfo();
        car3.printCarInfo();
        car4.printCarInfo();
    }
}
