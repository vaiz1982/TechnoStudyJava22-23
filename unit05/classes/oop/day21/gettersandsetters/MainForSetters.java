package unit05.classes.oop.day21.gettersandsetters;

public class MainForSetters {
    public static void main(String[] args) {
        Car car1 = new Car("White", 200, 2022);
        Car car2 = new Car("Purple", 150000, 1995);
        System.out.println(car1);
        car1.setColor("Blue");
        System.out.println(car1);
        System.out.println(car2);
        car2.setColor("Metallic Blue");
        car2.setMileage(100000);
        System.out.println(car2);


    }
}
