package unit11.collections.day41.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortIntegerString {
    public static void main(String[] args) {
        List<Integer> integers =
                new ArrayList<>(List.of(312,4,214,236,345,45,345345,3,51,2,145,34));
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        integers.sort(Comparator.naturalOrder());
        integers.sort(Comparator.reverseOrder());
        System.out.println(integers);


        List<String> strings =
                new ArrayList<>(List.of("hello","interfaces","collections"));
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);


    }
}


