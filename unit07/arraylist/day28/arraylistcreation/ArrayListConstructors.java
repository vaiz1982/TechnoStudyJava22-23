package unit07.arraylist.day28.arraylistcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConstructors {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("numbers: " + numbers);
        ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
        System.out.println("numbers2: " + numbers2);
        /*Arrays.asList() method returns a collection*/
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(30, 40, 50, 60));
        System.out.println("numbers3: " + numbers3);
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(100,200,300,400));
        System.out.println("numbers4: " + numbers4);

        String[] wordsArray = {"a", "an", "on", "at"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(wordsArray));
        System.out.println("words: " + words);
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList("hi","bye","why"));
        System.out.println("words2: " + words2);

        ArrayList<String > cities = new ArrayList<>(List.of("Trabzon", "Almaty", "Casablanca", "New York"));
        System.out.println("cities: " + cities);
    }
}
