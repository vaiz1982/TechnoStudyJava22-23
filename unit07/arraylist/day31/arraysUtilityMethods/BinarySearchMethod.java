package unit07.arraylist.day31.arraysUtilityMethods;

import java.util.Arrays;

public class BinarySearchMethod {
    public static void main(String[] args) {
        int[] numbers = {-34, 23, 45, 3245, 234, 52, -2352352, -24525, 23525, -23452};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Don't run binary search on unsorted arrays");
        System.out.println(Arrays.binarySearch(numbers, -2352352));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 45));
        System.out.println(Arrays.binarySearch(numbers, 9));
        System.out.println(Arrays.binarySearch(numbers, 234));
        System.out.println(Arrays.binarySearch(numbers, -2352352));
    }
}
