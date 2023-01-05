package unit07.arraylist.day28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Tokyo","London","Toronto"));
        cities.set(0, "Trabzon");
        System.out.println("cities: " + cities);
        System.out.println(cities.set(1,"Casablanca"));
        System.out.println(cities);

    }
}
