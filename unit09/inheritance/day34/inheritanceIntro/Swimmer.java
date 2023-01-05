package unit09.inheritance.day34.inheritanceIntro;

public class Swimmer extends Athlete{
    private String swimStyle;

    public Swimmer(){

        swimStyle = "Free style";

    }

    public void dive(){
        System.out.println("Swimmer is practicing diving");
    }

    public String getSwimStyle() {
        return swimStyle;
    }

    public void setSwimStyle(String swimStyle) {
        this.swimStyle = swimStyle;
    }

    @Override
    public String toString() {
        return "Swimmer{" +
                "swimStyle='" + swimStyle + '\'' +
                '}';
    }
}
