package unit06.array.day24.TraversingArray;

public class PrintArray {
    public static void main(String[] args) {
        int[] myArr = {2313, 123, 12, 312, 3123123, 1, 3131, 3};
        printArray(myArr);
    }

    /*this method print the elements of a given array
     * to the screen...*/
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
