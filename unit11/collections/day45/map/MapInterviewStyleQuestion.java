package unit11.collections.day45.map;

public class MapInterviewStyleQuestion {
    public static void main(String[] args) {
        String sentence = "rainy and sunny days are nice but rainy and windy days are also nice too";

        /** Give me the numbers of the words are used in the sentence*/
        /** rainy 2, and 4, windy 1*/

        String[] words = sentence.split(" ");

        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        /** Give me the numbers of the letters are used in the sentence*/
        /** p=5, n=7, */

        char[] letters = word.toCharArray();
    }
}
