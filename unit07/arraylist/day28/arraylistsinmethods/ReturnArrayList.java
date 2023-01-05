package unit07.arraylist.day28.arraylistsinmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = favoriteCities();
        System.out.println(cityList);
        System.out.println(favoriteCities());

    }

    public static ArrayList<String> favoriteCities(){
        ArrayList<String> cities =
                new ArrayList<>(Arrays.asList("Istanbul","Izmir","Ankara"));
        return cities;
    }
}
