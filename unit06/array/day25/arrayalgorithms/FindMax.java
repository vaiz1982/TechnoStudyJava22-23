package unit06.array.day25.arrayalgorithms;

public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {31, 3, 123, 1111111124, 123, 43, 46, 47, 4567, 3, 6, 578, 1, 2353456, 4587, 58, 4};

        System.out.println("The maximum number is " + returnMax(numbers));

    }

    /*returnMax method*/
    public static int returnMax(int[] arr){
        //        int maximum = Integer.MIN_VALUE;
        int max = arr[0];

        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
