package unit09.inheritance.day38.objectClass;

import java.util.Objects;

public class SportShoes extends Shoe{
    private String sport;

    public SportShoes(int shoeSize, String color, String sport) {
        super(shoeSize, color);
        this.sport = sport;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportShoes that = (SportShoes) o;
        return Objects.equals(sport, that.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sport);
    }
}
