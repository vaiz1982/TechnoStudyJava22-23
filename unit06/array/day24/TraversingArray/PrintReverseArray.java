package unit06.array.day24.TraversingArray;

public class PrintReverseArray {
    public static void main(String[] args) {
        int[] myArr = {2313, 123, 12, 312, 3123123, 1, 3131, 3};
        printReversedArray(myArr);
//      PrintArray.printArray(myArr);
    }

    public static void printReversedArray(int[] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }
}
