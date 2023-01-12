package unit09.inheritance.day38.polymorphism;

import java.util.Objects;

public class Mail {
    private double weight;

    public Mail(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateShipping(){
        return weight * 0.15;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mail mail = (Mail) o;
        return Double.compare(mail.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}
