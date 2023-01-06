package unit09.inheritance.day36.polymorphicvariables;

public class CupMain {
    public static void main(String[] args) {
        Cup teaCup = new TeaCup();
        Cup britishTeaCup = new BritishTeaCup();
        Cup morocconCoffeCup = new MorocconCoffeeCup();
        System.out.println(morocconCoffeCup instanceof Cup);
        System.out.println(britishTeaCup instanceof CoffeeCup);
    }
}
