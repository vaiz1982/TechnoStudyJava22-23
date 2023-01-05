package unit06.array.day25.foreach;

public class ForEachExample {
    public static void main(String[] args) {
        int[] arr = {234, 234, 2, 5234, 54, 35, 467, 5, 25, 24, 63546, 34};

        for (int num : arr) {
            System.out.print(num + " ");
        }

        /*Create a 4 elements string array
         * print them on the screen one by one using
         * foreach loop*/
        String[] names = {"Jack", "Joe", "Tom", "Thomas"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
