package unit07.arraylist.day29.questions;

import java.util.ArrayList;

public class EvenNumbersArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumberList = returnEvenNumbers();
        System.out.println("Even Numbers:\n"+ evenNumberList);
        ArrayList<Integer> oddNumberList = returnOddNumbers();
        System.out.println("Odd Numbers:\n" + oddNumberList);
        /*Create an integer arraylist named as allNumbers
         * Than add all evenNumberList to that ArrayList
         * then add all oddNumberList to that ArrayList*/
        ArrayList<Integer> allNumbers = new ArrayList<>();
        allNumbers.addAll(evenNumberList);
        System.out.println("All Numbers first step:\n"+ allNumbers);
        allNumbers.addAll(oddNumberList);
        System.out.println("All Numbers second step:\n"+ allNumbers);
        /*remove all even numbers from the allNumbers list using
        * ArrayList methods*/
        allNumbers.removeAll(evenNumberList);
        System.out.println("All Numbers third step:\n"+ allNumbers);
        allNumbers.clear();
        System.out.println("All Numbers fourth step:\n"+ allNumbers);    }

    /*Create a method to create an Integer ArrayList
    consisting of all even numbers
    from 0 to 100, both inclusive.*/
    public static ArrayList<Integer> returnEvenNumbers() {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= 100; i = i + 2) {
            evenNumbers.add(i);
        }
        return evenNumbers;
    }
    /*Create a method to create an Integer ArrayList
    consisting of all odd numbers
    from 0 to 100, both inclusive.*/
    public static ArrayList<Integer> returnOddNumbers() {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1; i <= 100; i = i + 2) {
            oddNumbers.add(i);
        }
        return oddNumbers;
    }
}
