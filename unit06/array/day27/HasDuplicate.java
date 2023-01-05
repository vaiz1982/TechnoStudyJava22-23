package unit06.array.day27;

public class HasDuplicate {
    public static void main(String[] args) {
        int[] numbers = {12, 3, 4, 5, 6, 7, 9, 11, 9, 23};
        System.out.println(hasDuplicate(numbers));
    }

    public static boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    return true;
                }
            }
        }
        return false;
    }
}
