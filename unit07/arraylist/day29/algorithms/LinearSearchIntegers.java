package unit07.arraylist.day29.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(1,3,45,436,45,645,6));
        System.out.println(returnIndex(numbers, 45));
        System.out.println(numbers.indexOf(45));

    }
    public static int returnIndex(ArrayList<Integer> arr, int key){
        for (int i = 0; i < arr.size() ; i++) {
            if(arr.get(i) == key){
                return i;
            }
        }
        return -1;
    }
}
