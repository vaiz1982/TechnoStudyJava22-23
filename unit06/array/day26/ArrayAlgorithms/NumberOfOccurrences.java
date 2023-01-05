package unit06.array.day26.ArrayAlgorithms;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange"};
        System.out.println(numberOfOccurrences(words, "apple"));
        int[] numbers = {21,3,3,2134,21,21,23,23,24,23,42,34,23,234,23,423,4};
        System.out.println(numberOfOccurrences(numbers, 23));

    }

    public static int numberOfOccurrences(String[] arr, String key) {
        int counter = 0;
        for (String word : arr) {
            if (word.equals(key)) {
                counter++;
            }
        }
        return counter;
    }

    public static int numberOfOccurrences(int[] arr, int key){
        int counter = 0;
        for (int number : arr) {
            if (number == key) {
                counter++;
            }
        }
        return counter;
    }
}
