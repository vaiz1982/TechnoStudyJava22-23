package unit06.array.day26.ArrayShiftAlgorithms;

public class ShiftRight {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length - 1; i++) {
            secondArray[i + 1] = firstArray[i];
        }
        secondArray[0] = firstArray[firstArray.length - 1];
        System.out.print("original array: ");
        printArr(firstArray);
        firstArray = secondArray;
        System.out.print("shifted array: ");
        printArr(firstArray);
    }

    public static void printArr(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
