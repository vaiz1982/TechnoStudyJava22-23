package unit06.array.day26.ArrayAlgorithms;

public class IfAll {
    public static void main(String[] args) {
        int[] numbers = {2,2,1,2,2,2,2,2,2};
        System.out.println(ifAll(numbers, 2));

    }

    public static boolean ifAll(int[] arr, int key) {
        for (int number : arr) {
            if (number != key) {
                return false;
            }
        }
        return true;
    }
}
