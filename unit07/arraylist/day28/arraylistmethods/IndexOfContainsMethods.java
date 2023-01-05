package unit07.arraylist.day28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfContainsMethods {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi","Bye", "Why"));
        System.out.println(words.indexOf("Why"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("numbers:" + numbers);
        System.out.println(numbers.indexOf(5));
        System.out.println(words.indexOf("My"));

        System.out.println(words.contains("Bye"));
        System.out.println(words.contains("bye"));
        System.out.println(words.isEmpty());
        words.clear();
        System.out.println(words.isEmpty());
        System.out.println("words: " + words);

    }
}
