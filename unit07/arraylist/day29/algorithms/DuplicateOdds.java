package unit07.arraylist.day29.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateOdds {
    public static void main(String[] args) {
        /*add a duplicate element if the element is an odd number.*/
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(2,4,6,9,10,11,28));

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 1){
                int oddNumber = numbers.get(i);
                numbers.add(i, oddNumber);
                i++;
            }
        }

        System.out.println("Updated List: " + numbers);
    }
}
