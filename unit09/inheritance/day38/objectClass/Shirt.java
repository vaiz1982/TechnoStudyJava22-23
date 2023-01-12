package unit09.inheritance.day38.objectClass;

import java.util.Objects;

public class Shirt {
    private int size;
    private String color;

    public Shirt(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shirt shirt = (Shirt) o;
        return size == shirt.size && Objects.equals(color, shirt.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }
}
