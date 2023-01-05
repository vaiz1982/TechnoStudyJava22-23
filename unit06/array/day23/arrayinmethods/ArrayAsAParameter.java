package unit06.array.day23.arrayinmethods;

public class ArrayAsAParameter {
    public static void main(String[] args) {
        int[] intArr = {100, 2, 333};
        int[] intArr2 = {1,7,3,4};

        printFirstElement(intArr);
        printLastElement(intArr);
        System.out.println(returnMiddleElement(intArr));
        System.out.println(returnMiddleElement(intArr2));
        int[] myArray = returnFirstLastArray(intArr);
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
    }

    /*return a new array with two elements, first, and last.*/
    public static int[] returnFirstLastArray(int[] numbers){
        int[] arr = new int[2];
        arr[0] = numbers[0];
        arr[1] = numbers[numbers.length-1];
        return arr;
    }

    public static void printFirstElement(int[] numbers) {
        System.out.println(numbers[0]);
    }

    /*print the last element*/
    public static void printLastElement(int[] numbers) {
        System.out.println(numbers[numbers.length - 1]);
    }

    /*return the middle element
     * */
    public static int returnMiddleElement(int[] numbers) {
        if (numbers.length % 2 == 0) {
            int index = numbers.length / 2 - 1;
            return numbers[index];
        }
        int index = numbers.length / 2;
        return numbers[index];
    }


}
