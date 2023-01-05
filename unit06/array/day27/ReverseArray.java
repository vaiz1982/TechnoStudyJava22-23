package unit06.array.day27;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9,10};
        numbers = reverseArray(numbers);
        printArray(numbers);
    }

    public static int[] reverseArray(int[] firstArray) {
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[secondArray.length - 1 - i] = firstArray[i];
        }
        return secondArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
