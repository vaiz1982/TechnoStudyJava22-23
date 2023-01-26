package unit12.exceptions.day46.trycatchblock;

public class TryCatchExample {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The exception message is: " + e.getMessage());
            System.out.println("An exception occurred...");
        }

        System.out.println("After try...catch block.");

    }
}
