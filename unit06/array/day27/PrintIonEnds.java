package unit06.array.day27;

public class PrintIonEnds {
    public static void main(String[] args) {
        String[] words = {"television", "lion","celebration", "zion", "solution","microphone"};
        printIonEnds(words);
    }

    /*print the words ending with ion*/
    public static void printIonEnds(String[] arr) {
        for (String word : arr) {
            if (word.endsWith("ion")) {
                System.out.println(word);
            }
        }
    }
}
