package unit09.inheritance.day38.objectClass;

import java.util.Objects;

public class Jersey extends Shirt{
    private String sport;

    public Jersey(int size, String color, String sport) {
        super(size, color);
        this.sport = sport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jersey jersey = (Jersey) o;
        return Objects.equals(sport, jersey.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sport);
    }
}
