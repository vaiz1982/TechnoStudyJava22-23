package unit07.arraylist.day29.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoALValues {
    public static void main(String[] args) {
        /*Sum the indices of
        two ArrayLists and save them into a third ArrayList.*/
        ArrayList<Integer> nums1 =
                new ArrayList<>(Arrays.asList(1,23,34,2345,36,34));
        ArrayList<Integer> nums2 =
                new ArrayList<>(Arrays.asList(1,-45,-34,10,3,-100));
        ArrayList<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < nums1.size(); i++) {
            int sumValue = nums1.get(i) + nums2.get(i);
            sumList.add(sumValue);
        }

        System.out.println("nums1: " + nums1);
        System.out.println("nums2: " + nums2);
        System.out.println("Sum List: " + sumList);


    }
}
