package unit12.exceptions.day47.multipleCatchBlocks;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            /** Null pointer exception*/
            String nullString = "lksjdflk";
            nullString.length();
            /** array out of bound*/
            int[] numbers = new int[2];
            numbers[5] = 7;
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e ){
            /** | with this character you can put two different exceptions in one line.*/
            e.printStackTrace();
            System.out.println("Array out of bound exception happened...");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer exception occurred..");
        } catch(Exception e){
            System.out.println("An exception happened:" + e.getMessage());
        }

        System.out.println("*".repeat(75));
        System.out.println("After try...catch block.");
        System.out.println("*".repeat(75));

    }
}
