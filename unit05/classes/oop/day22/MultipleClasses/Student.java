package unit05.classes.oop.day22.MultipleClasses;

public class Student {

    private String name;
    private double gpa;
    private Address address;

    public Student(String name, double gpa, Address address) {
        this.name = name;
        this.gpa = gpa;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /*check if the given address is in the same state*/
    public boolean isSameState(Address otherAddress){
        String myState;
        String otherState;
        myState = address.getState();
        otherState = otherAddress.getState();

        return myState.equals(otherState);
    }
}
