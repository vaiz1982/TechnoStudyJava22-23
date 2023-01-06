package unit09.inheritance.day36.superkeywordreview;

public class Laptop extends Computer{
    private int batteryLife;

    public Laptop(String processor, int storage, int batteryLife) {
        super(processor, storage);
        this.batteryLife = batteryLife;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("The battery life is "+batteryLife+" hours.");
    }
}
