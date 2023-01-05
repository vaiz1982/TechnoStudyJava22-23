package unit06.array.day26.ArrayAlgorithms;

public class AnyConsecutiveDuplicate {
    public static void main(String[] args) {
        int[] numbers = {12, 1, 231, 23, 1};
        System.out.println(anyConsecutiveDuplicate(numbers));
    }

    public static boolean anyConsecutiveDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
