package unit02.objects.day06;

public class Car {

    private String color;
    private double mileage;

    public Car(String theColor, double theMileage){
        color = theColor;
        mileage = theMileage;
    }
    public Car(String theColor){
        color = theColor;
        mileage = 0;
    }
    public Car(){
        color = "Black";
        mileage = 0;
    }
    public void printCarInfo(){
        System.out.println("The car color is:");
        System.out.println(color);
        System.out.println("The mileage is: ");
        System.out.println(mileage);
    }

}
