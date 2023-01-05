package unit07.arraylist.day29.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        /*Remove all evens from the list*/
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-34, 45, 23, 78, 90, 12, 33, -12, 45));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println("Updated list: " + numbers);
    }
}
