package unit09.inheritance.day38.polymorphism;

public class FastMail extends Mail {
    public FastMail(double weight) {
        super(weight);
    }

    @Override
    public double calculateShipping() {
        return super.calculateShipping() + 5;
    }

    @Override
    public String toString() {
        return "FastMail{} with the weight of " + getWeight();
    }
}
