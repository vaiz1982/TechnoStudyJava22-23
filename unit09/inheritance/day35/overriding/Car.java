package unit09.inheritance.day35.overriding;

public class Car {
    public String drive(){
        return "Driving around the city";
    }
    public String fill(){
        return "Filling up the gas tank.";
    }
    /*Create a Car class with drive(), fill() methods return String messages.
Extend the ElectricVehicle class from the Car class. Add instance variable int batteryLevel.
Create a constructor.
Override fill() method with returning "charging the battery" and setting the battery level to 100.
\Create a getter for battery level.*/
}
