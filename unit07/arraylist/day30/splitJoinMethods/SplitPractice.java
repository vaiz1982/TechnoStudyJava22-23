package unit07.arraylist.day30.splitJoinMethods;

public class SplitPractice {
    public static void main(String[] args) {
        /*Get a String and turn the first letter of
         * each word into a uppercase letter and print them
         * on the screen*/
        String sentence = "Java is an object oriented programming language";
        /*Java
         * Is
         * A
         * Object
         * Oriented
         * Programming
         * Language*/
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
        }



    }
}
