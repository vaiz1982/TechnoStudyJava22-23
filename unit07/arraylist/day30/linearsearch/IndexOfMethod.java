package unit07.arraylist.day30.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(1, 23, 123, 1234, 124, 9, 123, 41, 234));

        System.out.println(numbers.indexOf(9));
        System.out.println(numbers.get(5));

        System.out.println(numbers.indexOf(11));

        ArrayList<String> countries =
                new ArrayList<>(Arrays.asList("Morocco", "USA" , "Turkiye", "Kazakhstan", "Palestine"));

        System.out.println(countries.indexOf("USA"));
        System.out.println(countries.indexOf("Palestine"));
        System.out.println(countries.indexOf("England"));
    }
}
