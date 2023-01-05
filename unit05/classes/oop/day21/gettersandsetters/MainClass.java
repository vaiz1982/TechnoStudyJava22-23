package unit05.classes.oop.day21.gettersandsetters;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student("221345bh", "John Doe", 3.96);
        System.out.println(student1);
        System.out.println(student1.getId());
        System.out.println(student1.getGpa());
        System.out.println(student1.getName());

        Car car1 = new Car("Yellow", 300, 2022);
        Car car2 = new Car("Red", 10000, 2017);
        System.out.println("Car 1 mileage is:  " +car1.getMileage());
        System.out.println("Car 2 mileage is: " + car2.getMileage());

        System.out.println(car2.getYear());

//        System.out.println(car2.toString());
        System.out.println(car2);
        /*If a constructor is declared, Java won't provide
        * default constructor anymore
        Student student2 = new Student();*/
    }
}
