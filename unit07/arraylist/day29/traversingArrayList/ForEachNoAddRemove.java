package unit07.arraylist.day29.traversingArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachNoAddRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(120, 300, 85, 33, 195));
        for (int number : numbers) {
            /*IT will throw an exception
            * concurrentModificationException*/
            numbers.add(10);
        }
    }
}
