package unit05.classes.oop.day22;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3, 3);
        System.out.println(rect1.getArea());
        System.out.println(rect1.isSquare());
        System.out.println(rect1.calculateArea(10, 10));
        rect1.printInfo();
    }
}
