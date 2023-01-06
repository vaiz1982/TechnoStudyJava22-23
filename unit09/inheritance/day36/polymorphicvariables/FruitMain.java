package unit09.inheritance.day36.polymorphicvariables;

public class FruitMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Grape grape = new Grape();
        RedGrapes redGrapes = new RedGrapes();
        YellowGrape yellowGrape = new YellowGrape();


        Fruit polyApple = new Apple();
        Fruit polyGrape = new Grape();
        Fruit polyRedGrape = new RedGrapes();
        Grape polyYellowGrape = new YellowGrape();


        System.out.println(polyRedGrape instanceof Grape);
        System.out.println(polyApple instanceof Fruit);
        System.out.println(polyGrape instanceof Apple);


//        Apple polymorphicApple = new Fruit();
    }
}
