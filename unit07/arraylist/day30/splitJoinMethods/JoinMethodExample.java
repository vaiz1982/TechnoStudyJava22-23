package unit07.arraylist.day30.splitJoinMethods;

public class JoinMethodExample {
    public static void main(String[] args) {
//        String sentence = "Java is an object oriented programming language";
//        String[] words = sentence.split(" ");
//        for (String word : words) {
//            System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
//        }
//        String updatedSentence = String.join(" ", words);
//        System.out.println("Updated Sentence: \n" + updatedSentence);

        String[] someWords = {"Hello","World","of", "Java"};
        String joinedWords = String.join("-", someWords);
        System.out.println(joinedWords);

    }
}
