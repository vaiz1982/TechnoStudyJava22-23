package unit09.inheritance.day38.objectClass;

public class ShirtMain {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt(34, "White");
        Shirt shirt2 = new Shirt(33, "White");
        System.out.println(shirt1.equals(shirt2));

        Jersey jersey1 = new Jersey(41, "Black", "Football");
        Jersey jersey2 = new Jersey(41, "Black", "Basketball");
        Jersey jersey3 = new Jersey(41, "Black", "Football");
        System.out.println(jersey1.equals(jersey2));
        System.out.println(jersey1.equals(jersey3));
    }
}
