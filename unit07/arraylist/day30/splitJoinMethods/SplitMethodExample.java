package unit07.arraylist.day30.splitJoinMethods;

public class SplitMethodExample {
    public static void main(String[] args) {
        String sentence = "SDET stands for Software Development Engineer in Test";
        String[] words = sentence.split(" ");
//        System.out.println(Arrays.toString(words));
        for (String word : words) {
            System.out.println(word);
        }

        String anotherSentence = "Testing and development goes hand by hand";
        String[] newWords = anotherSentence.split(" ");
        System.out.println("the length of the array is: " + newWords.length);

    }
}
