package unit06.array.day26.ArrayShiftAlgorithms;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5,6,7};
        int[] secondArray = new int[firstArray.length];

        for (int i = 1; i < firstArray.length ; i++) {
            secondArray[i-1] = firstArray[i];
        }
        secondArray[secondArray.length-1] = firstArray[0];
    }
}
