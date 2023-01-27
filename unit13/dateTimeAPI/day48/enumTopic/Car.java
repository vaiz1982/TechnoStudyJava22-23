package unit13.dateTimeAPI.day48.enumTopic;

public class Car {
    private String make;
    private Color color;

    public enum Color {
        YELLOW, WHITE, RED, BLUE, MAROON, BLACK, GREEN
    }

    public Car(String make, Color color) {
        this.make = make;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color=" + color +
                '}';
    }
}
