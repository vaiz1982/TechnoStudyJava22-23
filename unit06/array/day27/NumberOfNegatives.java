package unit06.array.day27;

public class NumberOfNegatives {
    public static void main(String[] args) {
        int[] numbers = {1, -4, 5, -9, -3, -11, -87, -9, -5};
        System.out.println(numOfNegatives(numbers));
    }

    public static int numOfNegatives(int[] arr) {
        int counter = 0;
        for (int number : arr) {
            if (number < 0) {
                counter++;
            }
        }
        return counter;
    }
}
