package unit12.exceptions.day47.finallyBlock;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            /** Arithmetic Exception*/
            System.out.println("Before The Exception in try block.");
            /*System.out.println(10/0);*/
            String nullString = null;
            nullString.length();
            System.out.println("After the exception in try block.");
        } catch(ArithmeticException e) {
            System.out.println("The Arithmetic exception is caught.");
        } finally {
            System.out.println("The code from the finally block.");
        }

        System.out.println("*".repeat(75));
        System.out.println("After try...catch...finally blocks.");
        System.out.println("*".repeat(75));
    }
}
