package unit12.exceptions.day46.multipleCatchBlocks;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            //  arithmetic one
            //  System.out.println(10/0);
            //  ArrayOut-ofBoundINdx...
            int[] numbers = new int[3];
            System.out.println(numbers[100]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
            //write your business logic
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are out of bound of the array");
            //write your business logic
        }
    }
}
