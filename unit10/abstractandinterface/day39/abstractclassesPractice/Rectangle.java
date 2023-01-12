package unit10.abstractandinterface.day39.abstractclassesPractice;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(int xCoordinate, int yCoordinate, double width, double height) {
        super(xCoordinate, yCoordinate);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
