package unit06.array.day23.arraycreation;

public class CreateArrays {
    public static void main(String[] args) {
        int[] numberArray = new int[5];
        double[] doubleArray = new double[10];
        String[] strings = new String[3];
        boolean[] booleans = new boolean[7];
        /*how to update and reach the elements*/
        numberArray[2] = 30;
        System.out.println(numberArray[2]);
        numberArray[0] = numberArray[2] * 3;
        System.out.println(numberArray[0]);
        System.out.println(numberArray[1]);
        /*how to get the length*/
        System.out.println(booleans.length);
        /*assignment*/
        doubleArray[1] = 33.5;
        doubleArray[5]=doubleArray[1]/2;
        System.out.println(doubleArray[1]);
        System.out.println(doubleArray[5]);

        doubleArray[doubleArray.length-1] = 100;
        System.out.println(doubleArray[doubleArray.length-1]);
        /*it will throw an .ArrayIndexOutOfBoundsException*/
        /*doubleArray[doubleArray.length] = 100;*/

    }
}
