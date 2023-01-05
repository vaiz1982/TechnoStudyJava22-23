package unit06.array.day26.ArrayAlgorithms;

public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {1, 222, 3, 4};
        System.out.println(findMax(numbers));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
