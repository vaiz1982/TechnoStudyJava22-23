package unit08.twoDArrays.day33.twoDArrayPracticeQuestions;

public class TotalNumberOfElements {
    public static void main(String[] args) {
        String[][] words = {{"apple", "banana"}, {"kiwi", "lemon", "lime"}, {"strawberry", "coconut", "pineapple", "dragon fruit"}};

        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            counter = counter + words[i].length;
        }

        System.out.println("Total number of elements is: " + counter);

    }
}
