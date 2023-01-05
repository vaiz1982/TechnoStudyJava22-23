package unit09.inheritance.day35.overriding;

public class ElectricVehicle extends Car{
    private int batteryLevel;

    public ElectricVehicle() {
        batteryLevel = 100;
    }

    public String fill(){
        batteryLevel = 100;
        return "Battery is charging.";
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
