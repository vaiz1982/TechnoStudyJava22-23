package unit08.twoDArrays.day32.traversing2DArray;

public class ForLoopTraverse {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11,12,13,14},
                {16,17,18,19,20},
                {21,22,23},
                {26,27,28,29},
        };

        for (int row = 0; row < twoDNumbers.length; row++) {
            for (int column = 0; column < twoDNumbers[row].length; column++) {
                System.out.print(twoDNumbers[row][column] + " ");
            }
            System.out.println();
        }
    }
}
