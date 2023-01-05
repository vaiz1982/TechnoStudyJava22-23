package unit07.arraylist.day28.questions;

import java.util.ArrayList;

public class CreateHundredNumbers {
    public static void main(String[] args) {
        /*Create a method to create 
        an Integer ArrayList consist of 
        all even numbers from 0 to 100 both inclusive.*/
        ArrayList<Integer> numbers = createEvenNumbersList();
        System.out.println(numbers);
    }

    public static ArrayList<Integer> createEvenNumbersList() {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= 100; i = i + 2) {
            evenNumbers.add(i);
        }
        return evenNumbers;
    }
}
