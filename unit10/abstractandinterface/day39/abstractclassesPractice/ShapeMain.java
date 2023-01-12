package unit10.abstractandinterface.day39.abstractclassesPractice;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(4, 5, 3);
        Shape rectangle = new Rectangle(5, 5, 10, 7.5);
        ArrayList<Shape> shapes = new ArrayList<>(List.of(circle, rectangle, new Circle(3, 3, 3)));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
