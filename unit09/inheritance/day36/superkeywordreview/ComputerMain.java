package unit09.inheritance.day36.superkeywordreview;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i5", 256);
        computer.info();
        Laptop laptop = new Laptop("m1 max", 1024, 10);
        laptop.info();

    }
}
