package unit06.array.day27;

public class FindShortestWord {
    public static void main(String[] args) {
        String[] words = {"cat", "ok", "fine", "yeah", "a"};
        System.out.println(findShortestWord(words));
    }

    public static String findShortestWord(String[] arr) {
        String shortest = arr[0];
        for (String word : arr) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }
}
