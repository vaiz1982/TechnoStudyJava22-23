package unit06.array.day26.ArrayAlgorithms;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 222, 3, -4};
        System.out.println(sum(numbers));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return sum;
    }
}
