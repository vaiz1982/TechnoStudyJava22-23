package unit11.collections.day45.setQuestions;

import java.util.*;

public class SetInterviewStyleQuestion {
    public static void main(String[] args) {
        String str = "this is a nice day in a nice way on a good day";

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        /** Give me the (distinct - no duplicate) words*/
        Set<String> distinctWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Distinct words: " + distinctWords);
        /** give me the distinct words in alphabetical order*/
        Set<String> distinctWordsByOrder = new TreeSet<>(Arrays.asList(words));
        List<String> sortedList = new ArrayList<>(distinctWords);
        System.out.println("Arraylist of the set" +sortedList);
        sortedList.sort(Comparator.naturalOrder());
        System.out.println("Arraylist of the set as sorted: " +sortedList);
        System.out.println();
        System.out.println("Distinct words sorted by order: " + distinctWordsByOrder);

        /** Give me the words repeat itself*/
        Set<String> distinctOnes = new HashSet<>();
        Set<String> repeatedOnes = new HashSet<>();
        for (String word : words) {
            if(!distinctOnes.add(word)){
                repeatedOnes.add(word);
            }
        }
        /*Ipek 's solution*/
        Set<String> repeatingWords = new HashSet<>();
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            if (wordSet.contains(word)) {
                repeatingWords.add(word);
            } else {
                wordSet.add(word);
            }
        }
        System.out.println("Repeated words: " + repeatedOnes);

        /**
         * Last part:
         * Print the list of the unique elements
         * */
        distinctOnes.removeAll(repeatedOnes);
        System.out.println("Unique Words: " + distinctOnes);
    }
}
