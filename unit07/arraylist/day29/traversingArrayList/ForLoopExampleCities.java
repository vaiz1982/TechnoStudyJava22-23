package unit07.arraylist.day29.traversingArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ForLoopExampleCities {
    public static void main(String[] args) {
        ArrayList<String> cities =
                new ArrayList<>(Arrays.asList("Manhattan", "Boston","Chicago"));
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }

        int index=0;
        while(index<cities.size()){
            System.out.print(cities.get(index) + " ");
            index++;
        }
    }
}
