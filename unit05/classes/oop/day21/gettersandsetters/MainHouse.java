package unit05.classes.oop.day21.gettersandsetters;

public class MainHouse {
    public static void main(String[] args) {
        House house1 = new House("Blue", "Main Ave, Morocco", 300000);
        House house2 = new House("Yellow", "Florida", 400000);

        System.out.println(house1);
        System.out.println(house2);

        System.out.println(house2.getPrice());

        house1.setAddress("5th Ave, Morocco");
        System.out.println(house1);
    }
}
