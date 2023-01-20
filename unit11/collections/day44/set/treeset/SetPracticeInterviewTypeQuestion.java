package unit11.collections.day44.set.treeset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPracticeInterviewTypeQuestion {
    public static void main(String[] args) {
        String str = "this is a nice day in a nice way on a good day";

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        /** Give me the (distinct - no duplicate) words*/
        Set<String> distinctWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Distinct words: " + distinctWords);
        /** give me the distinct words in alphabetical order*/
        Set<String> distinctWordsByOrder = new TreeSet<>(Arrays.asList(words));
        System.out.println("Distinct words: " + distinctWordsByOrder);

        /** Give me the words repeat itself*/

    }
}
