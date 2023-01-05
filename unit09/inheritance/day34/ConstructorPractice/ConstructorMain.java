package unit09.inheritance.day34.ConstructorPractice;

public class ConstructorMain {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.getSuperVariable());
        System.out.println(subClass.getSubClassVariable());
        SubClass subClass1 = new SubClass("Super", "Sub");
        System.out.println(subClass1.getSuperVariable());
        System.out.println(subClass1.getSubClassVariable());
    }
}
