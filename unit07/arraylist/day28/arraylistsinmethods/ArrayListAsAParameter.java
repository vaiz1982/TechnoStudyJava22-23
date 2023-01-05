package unit07.arraylist.day28.arraylistsinmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAsAParameter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        printTheLastElement(numbers);

    }
    public static void printTheLastElement(ArrayList<Integer> arr){
        System.out.println(arr.get(arr.size()-1));
    }
}
