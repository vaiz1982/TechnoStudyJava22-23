package unit07.arraylist.day29.traversingArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingProblem {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(120, 300, 85, 33, 195));
        System.out.println("before removal: " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<100){
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("after removal: " + numbers);
        numbers.add(78); numbers.add(12); numbers.add(111);

        System.out.println("-".repeat(15));
        System.out.println(numbers);
        for (int i = numbers.size()-1; i >=0 ; i--) {
            if(numbers.get(i)<100){
                numbers.remove(i);
            }
        }
        System.out.println("after removal: " + numbers);
    }
}
