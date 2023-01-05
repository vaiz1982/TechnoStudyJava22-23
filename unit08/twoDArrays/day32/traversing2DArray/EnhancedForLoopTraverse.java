package unit08.twoDArrays.day32.traversing2DArray;

public class EnhancedForLoopTraverse {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11, 12, 13, 14 , 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23 , 24, 25},
                {26, 27, 28, 29 , 30}
        };

        for (int[] row : twoDNumbers){

            for (int element:row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
