package unit06.array.day27;

public class ShiftRight {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length - 1; i++) {
            secondArray[i+1] = firstArray[i];
        }
        secondArray[0] = firstArray[firstArray.length - 1];



        firstArray = secondArray;


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
