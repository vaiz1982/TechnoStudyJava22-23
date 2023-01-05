package unit08.twoDArrays.day31.twoDArrayInitialization;

import java.util.Arrays;

public class Initialize2DArrayByAssigningOneByOne {
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];
        System.out.println(Arrays.deepToString(numbers));

        int[] nums0 = {2,45};
        int[] nums1 = {2,19};
        int[] nums2 = {2,4};

        numbers[0] = nums0;
        numbers[1] = nums1;
        numbers[2] = nums2;

        System.out.println(Arrays.deepToString(numbers));
    }
}
