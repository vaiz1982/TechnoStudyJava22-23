package unit09.inheritance.day36.superkeywordreview;

public class Computer {
    private String processor;
    private int storage;

    public Computer(String processor, int storage) {
        this.processor = processor;
        this.storage = storage;
    }

    public void info(){
        System.out.println("The " + this.getClass().getSimpleName() + " has " + processor +" processor and "+ storage+
                " gb of " +
            "storage.");
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
