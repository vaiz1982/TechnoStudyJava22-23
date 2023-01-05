package unit05.classes.oop.day21.gettersandsetters;

public class House {
    private String color;
    private String address;
    private double price;

    public House(String color, String address, double price) {
        this.color = color;
        this.address = address;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }

    /*Color
    * address
    * price
    * constructor
    * getters and setters
    * and toString method
    * use intelliJ*/
}
