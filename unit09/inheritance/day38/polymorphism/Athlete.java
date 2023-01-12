package unit09.inheritance.day38.polymorphism;

public class Athlete {
    private String name;

    public Athlete(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void practice(){
        System.out.println(this.getClass().getSimpleName() + " is practicing.");
    }
}
