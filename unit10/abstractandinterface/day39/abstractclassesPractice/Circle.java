package unit10.abstractandinterface.day39.abstractclassesPractice;

/*
 * Circle => double radius
 * */
public class Circle extends Shape {
    private double radius;

    public Circle(int xCoordinate, int yCoordinate, double radius) {
        super(xCoordinate, yCoordinate);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
