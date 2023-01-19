package unit11.collections.day42.sortingList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStringList {
    public static void main(String[] args) {
        /**
         * Create a String List
         * print it in insertion order
         * print it in sorted by natural order
         * print it in sorted by reverse order
        * */

        ArrayList<String> cityList=
                new ArrayList<>(List.of("Rutherford","Brooklyn","Salem","Boston"));

        System.out.println("Insertion Order:");
        System.out.println(cityList);
        System.out.println("Sorted By Natural Order:");
        cityList.sort(Comparator.naturalOrder());
        System.out.println(cityList);
        cityList.sort(Comparator.reverseOrder());
        System.out.println("Sorted By Reverse Order:");
        System.out.println(cityList);
    }
}
