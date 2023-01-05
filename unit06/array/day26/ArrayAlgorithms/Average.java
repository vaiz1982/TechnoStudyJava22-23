package unit06.array.day26.ArrayAlgorithms;

public class Average {
    public static void main(String[] args) {
        int[] numbers = {1, 222, 3, -4};
        System.out.println(average(numbers));
    }

    public static double average(int[] arr){
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return (double)sum/arr.length;
    }
}
