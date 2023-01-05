package unit09.inheritance.day34.ConstructorPractice;

public class SubClass extends SuperClass{
    private String subClassVariable;

    public SubClass(){
        subClassVariable = "Subclass: Initialized in No Parameter Constructor";
        /*super() call to the superclass constructor
        must be done in the first line of the constructor
        super();*/
    }

    public SubClass(String forSuperClass, String subClassVariable){

       super(forSuperClass);
        this.subClassVariable = subClassVariable;

    }

    public String getSubClassVariable() {
        return subClassVariable;
    }

    public void setSubClassVariable(String subClassVariable) {
        this.subClassVariable = subClassVariable;
    }
}
