package unit08.twoDArrays.day31.usingInitializer;

import java.util.Arrays;

public class UseInitializerWithPreWrittenArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {6, 7, 8, 9, 10};
        int[] nums3 = {11, 12, 13, 14, 15};
        int[] nums4 = {16, 17, 18, 19, 20};

        int[][] numbersArray = {nums1, nums2, nums3, nums4};

        System.out.println(Arrays.deepToString(numbersArray));

    }
}
