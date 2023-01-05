package unit09.inheritance.day34.ConstructorPractice;

public class SuperClass {
    private String superVariable;

    public SuperClass() {
        superVariable = "Superclass: Created by No parameter Constructor";
    }

    public SuperClass(String superVariable) {
        this.superVariable = superVariable;
    }

    public String getSuperVariable() {
        return superVariable;
    }

    public void setSuperVariable(String superVariable) {
        this.superVariable = superVariable;
    }
}
