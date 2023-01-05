package unit07.arraylist.day28.arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class GetMethod {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi","Bye", "Why"));
        System.out.println("words: " + words);
        System.out.println(words.get(2));
    }
}
