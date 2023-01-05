package unit07.arraylist.day31.CollectionsUtilityMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(42, 234, 2345, 2345, 23, -56, 3456111, 4567, 45));

        System.out.println(numbers);

        System.out.println("the max is: " + Collections.max(numbers));
        System.out.println("the min is: " + Collections.min(numbers));
    }
}
