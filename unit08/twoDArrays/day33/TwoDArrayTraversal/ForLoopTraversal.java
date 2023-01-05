package unit08.twoDArrays.day33.TwoDArrayTraversal;

public class ForLoopTraversal {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };

        for (int i = 0; i < words.length; i++) {
            System.out.print("Array " + i + ": ");
            for (int j = 0; j < words[i].length; j++) {
                System.out.print(words[i][j] + " ");
            }
            System.out.println();
        }
    }
}
