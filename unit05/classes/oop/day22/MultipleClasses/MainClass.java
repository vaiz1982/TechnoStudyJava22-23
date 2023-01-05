package unit05.classes.oop.day22.MultipleClasses;

public class MainClass {
    public static void main(String[] args) {
        Address address1 = new Address("4 Main Ave", "Brooklyn","NY","12345");
        Address address2 = new Address("4 Main Ave", "Princeton","NY","12333");
        Student student1 = new Student("John", 4.0, address1);
        System.out.println(student1.getAddress());

        System.out.println(student1.isSameState(address2));
    }
}
