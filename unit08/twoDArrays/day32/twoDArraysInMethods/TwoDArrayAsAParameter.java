package unit08.twoDArrays.day32.twoDArraysInMethods;

import java.util.Arrays;

public class TwoDArrayAsAParameter {
    public static void main(String[] args) {
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };

        printAllElements(words);

    }

    /*name of the method printAllElements
    * it will get a 2d String array as a parameter
    * and it will print all the elements in the 2D array to the screen
    * using the for or foreach loop. it is up to you to select one over other*/
    public static void printAllElements(String[][] arrays){
        System.out.println(Arrays.deepToString(arrays));
    }
}
