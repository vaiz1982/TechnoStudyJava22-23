package unit06.array.day24.TraversingArray;

public class ArrayInitializeWithLoop {
    public static void main(String[] args) {
        /*
        create an integer array with new keyword with 5 elements
        Traverse each element and set their values with ten times their indices.*/
        int[] myArr = new int[5];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i * 10;
        }

//        create 7 elements int array set every other element with index*10 using for loop
        int[] myArr2 = new int[7];
        for (int i = 0; i < myArr2.length; i = i +2) {
            myArr2[i] = i * 10;
        }

        for (int i = 0; i < myArr2.length; i++) {
            System.out.println(myArr2[i]);
        }

    }
}
