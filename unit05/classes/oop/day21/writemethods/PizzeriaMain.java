package unit05.classes.oop.day21.writemethods;

public class PizzeriaMain {
    public static void main(String[] args) {
        Pizzeria fratelliPizza = new Pizzeria("Fratelli", 9.99, 14.99, 12.99, 1.0);
        System.out.println(fratelliPizza);

        double plainPizzas = 3;
        int drinks = 7;

        double totalPrice = fratelliPizza.plainTotal(plainPizzas, drinks);

        System.out.println("Your total is: " + totalPrice);
    }
}
