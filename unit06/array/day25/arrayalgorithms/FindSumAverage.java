package unit06.array.day25.arrayalgorithms;

public class FindSumAverage {
    public static void main(String[] args) {
        int[] numbers = {31, 3, 123};

        System.out.println("The sum of all the numbers in the array is " + returnSum(numbers));
        System.out.println("The average is "  + returnSum(numbers) / numbers.length);
    }

    private static int returnSum(int[] numbers) {
        /*Create your bucket*/
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }

        return sum;
    }

}
