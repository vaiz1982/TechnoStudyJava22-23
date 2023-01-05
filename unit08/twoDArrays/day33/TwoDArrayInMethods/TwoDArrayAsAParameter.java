package unit08.twoDArrays.day33.TwoDArrayInMethods;

import java.util.Arrays;

public class TwoDArrayAsAParameter {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11,12,13,14,},
                {16,17,18,19,20},
                {21,22,23},
                {26,27,28,29},
        };
        printThe2DArray(twoDNumbers);
        String[][] someArray =  produce2DStringArray();
        System.out.println(Arrays.deepToString(someArray));
    }

    public static void printThe2DArray(int[][] arr){
        System.out.println(Arrays.deepToString(arr));
    }

    /*Create a method which produces a 2D String array and
    * return that array*/
    public static String[][] produce2DStringArray(){
        String[][] a2DArray = new String[5][2];
        return a2DArray;
    }
}
