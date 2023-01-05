package unit08.twoDArrays.day31.twoDArrayInitialization;

import java.util.Arrays;

public class Initialize2DArrayExamples {
    public static void main(String[] args) {
        /*Create a 2D String Array with 2 arrays and 2 elements in each array
        * create 2 different 1D String arrays with 2 elements and initialize them
        * assign these two string arrays to the elements of the 2D String array*/
        String[][] words = new String[2][2];
        String[] words1 = {"SDET", "Rocks"};
        String[] words2 = {"Testing", "is a must!"};
        System.out.println(Arrays.deepToString(words));
        words[0] = words1;
        System.out.println(Arrays.deepToString(words));
        words[1] = words2;
        System.out.println(Arrays.deepToString(words));



    }
}
