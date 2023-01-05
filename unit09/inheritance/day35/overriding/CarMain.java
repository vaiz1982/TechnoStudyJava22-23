package unit09.inheritance.day35.overriding;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricVehicle electricVehicle = new ElectricVehicle();
        SportsCar sportsCar = new SportsCar(220);

        System.out.println(car.drive());
        System.out.println(sportsCar.drive());
        System.out.println(electricVehicle.fill());
        System.out.println(sportsCar.fill());
        System.out.println(electricVehicle.drive());
        /*System.out.println(car.getBatteryLevel());*/
        System.out.println(electricVehicle.getBatteryLevel());
    }
}
