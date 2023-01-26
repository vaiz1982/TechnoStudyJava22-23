package unit11.collections.day46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapInterviewStyle {
    public static void main(String[] args) {

        String sentence = "rainy and sunny days are nice but rainy and windy days are also nice too";
        /** Give me the numbers of the words are used in the sentence*/
        /** rainy 2, and 4, windy 1*/
        String[] words = sentence.split(" ");

        System.out.println("Words Array: " + Arrays.toString(words));

        Map<String, Integer> wordFrequency = new HashMap<>();

        /*System.out.println("return: " + wordFrequency.put(words[0],1));
        System.out.println("Map: " + wordFrequency);*/

        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }


        /**
         * Berk's solution
         * for (String word : words) {
         *             wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
         *         }*/

        System.out.println("-".repeat(75));
        System.out.println("Word Frequency Map: " + wordFrequency);
        System.out.println("-".repeat(75));


        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        /** Give me the numbers of the letters are used in the sentence*/
        /** p=5, n=7, */
        char[] letters = word.toCharArray();
        System.out.println("Character Array: " + Arrays.toString(letters));

        Map<Character, Integer> letterFrequency
                = new HashMap<>();
        for (Character letter : letters) {
            if (letterFrequency.containsKey(letter)) {
                letterFrequency.put(letter, letterFrequency.get(letter) + 1);
            } else {
                letterFrequency.put(letter, 1);
            }
        }

        System.out.println("-".repeat(75));
        System.out.println("Letter Frequency Map: " + letterFrequency);
        System.out.println("-".repeat(75));
    }
}
