package unit08.twoDArrays.day32.twoDArrayInitialization;

import java.util.Arrays;

public class TwoDArrayInitializerExamples {
    public static void main(String[] args) {
        /*Create a 2D String array with favorite fruits. 3 arrays, the number of elements
        * is up to you. Use Initializer.*/
        String[][] words = {
                {"apple","banana"},
                {"kiwi","lemon","lime"},
                {"strawberry","coconut","pineapple","dragon fruit"}
        };

        System.out.println("The length of the 2D Array is " + words.length);
        System.out.println("The length of the 2D Array's index 0's array is " + words[0].length);
        System.out.println("The length of the 2D Array's index 1's array is " + words[1].length);
        System.out.println("The length of the 2D Array's index 2's array is " + words[2].length);


        System.out.println(Arrays.deepToString(words));
//        System.out.println(Arrays.toString(words[0]) + Arrays.toString(words[1]));
    }
}
