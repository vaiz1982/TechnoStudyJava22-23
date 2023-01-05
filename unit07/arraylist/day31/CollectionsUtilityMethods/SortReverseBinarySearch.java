package unit07.arraylist.day31.CollectionsUtilityMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortReverseBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(42, 234, 2345, 2345, 23, -56, 3456111, 4567, 45));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("After sorting");
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println("After reversing");
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println("Reverse again");
        System.out.println(numbers);
        System.out.println("42 is found in index of: " + Collections.binarySearch(numbers, 42) + "using binary search");
    }
}
