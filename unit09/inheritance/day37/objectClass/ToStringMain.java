package unit09.inheritance.day37.objectClass;

public class ToStringMain {
    public static void main(String[] args) {
        ToStringMethodExample anObject = new ToStringMethodExample();
        System.out.println(anObject.toString());
        ToStringMethodExample anotherObject = new ToStringMethodExample();
        System.out.println(anObject.equals(anotherObject));
    }
}
