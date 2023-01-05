package unit06.array.day26.ArrayAlgorithms;

public class FindAny {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 234, 345, 34, 76, 34, 34, 32, 3, 4};
        System.out.println(findAny(numbers, 34));

    }

    public static boolean findAny(int[] arr, int key) {
        for (int number : arr) {
            if (number == key) {
                return true;
            }
        }
        return false;
    }
}
