package unit09.inheritance.day35.overriding;

/*Extend the SportsCar class from the Car class.
Add instance variable maxSpeed. Create a constructor.
Override drive() method by returning "driving at high speed."
Write a getMaxSpeed() getter method.*/

public class SportsCar extends Car {
    private int maxSpeed;

    public SportsCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String drive(){
        return "driving at high speed.";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
