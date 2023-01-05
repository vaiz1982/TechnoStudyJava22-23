package unit08.twoDArrays.day31.usingInitializer;

import java.util.Arrays;

public class UseInitializer {
    public static void main(String[] args) {
        int[][] numbersArray = {
                {1,2,3,4},{10,20},{100},{0}
        };

        System.out.println(Arrays.deepToString(numbersArray));

        /*Create a 2d String array with 4 elements and initialize them with
        * initializer*/
        String[][] myWords ={{"Ali", "Ayse"},{"Veli", "Deli"},{"a", "B", "c", "D"}};
        System.out.println(Arrays.deepToString(myWords));
    }
}
