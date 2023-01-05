package unit08.twoDArrays.day33.TwoDArrayTraversal;

public class ForEachTraversal {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };

        for ( String[] wordArray : words ) {
            for ( String word : wordArray) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}
