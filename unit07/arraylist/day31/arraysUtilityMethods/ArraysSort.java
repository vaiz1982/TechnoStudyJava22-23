package unit07.arraylist.day31.arraysUtilityMethods;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] numbers = {-34, 23, 45, 3245, 234, 52, -2352352, -24525, 23525, -23452};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"asd","gh","ldjrg","aiur","lsjd","qiwe"};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(words));
        System.out.println("After sorting");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
