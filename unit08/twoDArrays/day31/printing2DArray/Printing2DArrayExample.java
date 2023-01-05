package unit08.twoDArrays.day31.printing2DArray;

import java.util.Arrays;

public class Printing2DArrayExample {
    public static void main(String[] args) {
        boolean[][] booleans = new boolean[4][4];
        System.out.println(booleans);
        System.out.println(Arrays.deepToString(booleans));
        /*Create a 2D String array with 5 arrays of 12 elements*/
        String[][] words = new String[5][12];
        System.out.println(Arrays.deepToString(words));
        /*Create a 2D int array with 10 arrays of 2 elements*/
        int[][] numbers = new int[10][2];
        System.out.println(Arrays.deepToString(numbers));
    }
}
