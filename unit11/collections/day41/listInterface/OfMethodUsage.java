package unit11.collections.day41.listInterface;

import java.util.*;

public class OfMethodUsage {
    public static void main(String[] args) {
        List<String> words =
                List.of("Hey","Hi","How are you?");
        /*words.add("no addition to the immutable collection");*/
        List<String> wordsArrayList =
                new ArrayList<>(words);
        wordsArrayList.add("another word");
        System.out.println(wordsArrayList);

        /*Common practice to declare as list
        * and create as different list class types*/
        List<String> stringsArrayList = new ArrayList<>(words);


        List<String> stringsLinkedList = new LinkedList<>(Arrays.asList("hi","bye"));
       /* strings = new Stack<>();
        strings = new Vector<>(words);*/

        stringsLinkedList.add("Something");
        stringsArrayList.add("Something");
        stringsLinkedList.get(1);
        stringsArrayList.get(2);
        stringsArrayList.add(0, "another thing");



    }
}
