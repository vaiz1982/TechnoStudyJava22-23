package unit06.array.day27;

import static unit06.array.day27.ShiftRight.printArray;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4};

        int[] secondArray = new int[firstArray.length];
        for (int i = 1; i < firstArray.length; i++) {
            secondArray[i - 1] = firstArray[i];
        }
        secondArray[secondArray.length - 1] = firstArray[0];
        printArray(firstArray);
        printArray(secondArray);
    }
}
