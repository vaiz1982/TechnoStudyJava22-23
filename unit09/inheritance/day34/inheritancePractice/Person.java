package unit09.inheritance.day34.inheritancePractice;

public class Person {
    public void study(){
        System.out.println(this.getClass().getSimpleName()
                + " is studying.");
    }
}
