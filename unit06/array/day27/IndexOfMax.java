package unit06.array.day27;

public class IndexOfMax {
    public static void main(String[] args) {
        int[] numbers = {1, 23, 12340000, 453, 56567, 4, 4245, 3};
        System.out.println(indexOfMax(numbers));

    }

    public static int indexOfMax(int[] arr) {
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
