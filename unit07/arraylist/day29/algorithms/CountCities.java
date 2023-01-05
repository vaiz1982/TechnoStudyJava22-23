package unit07.arraylist.day29.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class CountCities {

    public static void main(String[] args) {
        /*Count the cities starting with "A"*/
        ArrayList<String> cities =
                new ArrayList<>(Arrays.asList("Athens", "Angara", "Boston", "Alabama", "Adana"));
        System.out.println(numberOfACities(cities));
    }

    public static int numberOfACities(ArrayList<String> cities) {
        int counter = 0;

        for (String city : cities) {
            if (city.startsWith("A")) {
                counter++;
            }
        }

        return counter;
    }
}
