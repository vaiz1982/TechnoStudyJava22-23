package unit06.array.day24.ArrayReview;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = {111, 2 , 3 , 4 ,5};
        printFirst(arr2);
        int[] arr3 = produceArray();
        printFirst(arr3);

    }

    /*method which creates and integer array with
     * 3 elements as 20,30,40 and return the array*/
    public static int[] produceArray(){
        int[] arr = {202,30,40};
        return arr;
    }

    /*method takes int array as a parameter
    * prints the first element to the screen*/
    public static void printFirst(int[] arr) {
        System.out.println(arr[0]);
    }




}
