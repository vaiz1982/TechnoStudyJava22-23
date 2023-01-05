package unit08.twoDArrays.day31.differentSizeArrays;

import java.util.Arrays;

public class DifferentSizeArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[3][];

        System.out.println(Arrays.deepToString(numbers));

        int[] numbers0 = {2,3,4,5,6};
        numbers[0] = numbers0;
        System.out.println(Arrays.deepToString(numbers));
        int[] numbers1 = {2,9};
        numbers[1] = numbers1;
        System.out.println(Arrays.deepToString(numbers));
        int[] numbers2 = {};
        numbers[2] = numbers2;
        System.out.println(Arrays.deepToString(numbers));
        int[] numbersAnother = {1,45,74,78,58};
        numbers[2] = numbersAnother;
        System.out.println(Arrays.deepToString(numbers));



    }
}
