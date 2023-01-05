package unit07.arraylist.day28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethods {
    public static void main(String[] args) {
        ArrayList<String> cities =
                new ArrayList<>(Arrays.asList("Tokyo","London","Toronto"));
        System.out.println("cities: before remove" + cities);
        String removed = cities.remove(0);
        System.out.println("removed element: " + removed);
        System.out.println("cities: " + cities);

        cities.remove("London");
        System.out.println(cities);
        cities.remove("Trabzon");
        System.out.println(cities);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11,22,3,33, 3 ,4,5,65,7));
        System.out.println("numbers: " + numbers);

        numbers.remove(0);
        System.out.println("numbers: " + numbers);

        numbers.remove(Integer.valueOf(33));
        System.out.println("numbers: " + numbers);

        numbers.removeAll(Arrays.asList(2,3,5,11,10));
        System.out.println("numbers: " + numbers);




    }
}
