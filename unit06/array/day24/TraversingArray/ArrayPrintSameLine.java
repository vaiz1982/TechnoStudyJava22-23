package unit06.array.day24.TraversingArray;

public class ArrayPrintSameLine {
    public static void main(String[] args) {
        /*create int array
         * print them on the same line
         * with a space between elements*/
        int[] myArr = {12, 123, 234, 1234, 2, 542, 34, 1234, 123, 42, 13};
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println("\n-------------");
//        Traverse every other element and print them line by line
        for (int i = 0; i < myArr.length; i = i+2) {
            System.out.println(myArr[i]);
        }
    }
}
