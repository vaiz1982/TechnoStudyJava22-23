package unit02.objects.day11;

public class Car {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "color='" + color + '\'' + '}';
    }
}
