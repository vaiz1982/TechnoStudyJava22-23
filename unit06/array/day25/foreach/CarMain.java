package unit06.array.day25.foreach;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(10000);
        Car car2 = new Car(50000);
        Car car3 = new Car(100000);

        Car[] cars = {car1, car2, car3};
//        for (Car car : cars) {
//            System.out.println(car.getMileage());
//        }

        /*print the car objects only with mileage less than 50K.*/
        for (Car car : cars) {
            if (car.getMileage() < 50000) {
                System.out.println(car);
            }
        }
    }
}
