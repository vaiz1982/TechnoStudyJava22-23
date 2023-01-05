package unit08.twoDArrays.day33.twoDArrayPracticeQuestions;

public class SearchAValue {

    public static void main(String[] args) {
        String[][] words = {{"apple", "banana"}, {"kiwi", "lemon", "lime"}, {"strawberry", "coconut", "pineapple", "dragon fruit"}};
        System.out.println(search(words, "banana"));
        System.out.println(search(words, "banane"));
    }

    public static boolean search(String[][] arr, String key) {
        for (String[] wordsArray : arr) {
            for (String word : wordsArray) {
                if (word.equals(key)) {
                    return true;
                }
            }
            /*Alternative Way to Solve it*/
            /*if(Arrays.asList(wordsArray).indexOf(key)>=0){
                return true;
            }*/
        }
        return false;
    }
}
