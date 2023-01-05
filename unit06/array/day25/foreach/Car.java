package unit06.array.day25.foreach;

public class Car {
    private double mileage;


    public Car(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" + "mileage=" + mileage + '}';
    }
}
