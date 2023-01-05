package unit07.arraylist.day28.arraylistmethods;

import java.util.ArrayList;

public class AddMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        System.out.println(numbers);
        numbers.add(20);
        System.out.println(numbers);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        numbers.add(0, 0);
        System.out.println(numbers);
        numbers.add(3, 99);
        System.out.println(numbers);
        /*be careful about exceptions*/
//        numbers.add(100, 100);
//        System.out.println(numbers);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(-10);
        numbers2.add(-20);
        numbers2.add(-30);
        System.out.println(numbers2);
        numbers.addAll(numbers2);
        System.out.println(numbers);
        numbers.addAll(3, numbers2);
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);
    }
}
