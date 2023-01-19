package unit11.collections.day42.sortingList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer> integerList
                = new ArrayList<>(List.of(23,45,56,345,34,534,5,345,23));

        System.out.println("Insertion Order:");
        System.out.println(integerList);
        integerList.sort(Comparator.naturalOrder());
        System.out.println("Sorted by Natural Order:");
        System.out.println(integerList);
        integerList.sort(Comparator.reverseOrder());
        System.out.println("Sorted by Reverse Order:");
        System.out.println(integerList);

    }
}
