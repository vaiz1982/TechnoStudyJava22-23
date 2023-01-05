package unit06.array.day25.foreach;

public class OddNumbersPrint {
    public static void main(String[] args) {
        /*print only the odd numbers using enhanced for loop*/
        System.out.println("\nOdd Numbers");
        int[] numbers = {123, 234, 234, 45, 235, 1234, 4, 523, 45, 23456, 2345, 23, 452};
        for (int number : numbers) {
            if(number%2==1){
                System.out.print(number + " ");
            }
        }
        /*print only the even numbers using enhanced for loop
         */
        System.out.println("\nEven Numbers");
        for (int number : numbers) {
            if(number%2==0){
                System.out.print(number + " ");
            }
        }
    }
}
