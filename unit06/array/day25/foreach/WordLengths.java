package unit06.array.day25.foreach;

public class WordLengths {
    public static void main(String[] args) {
        /*print only the words if their length is greater than  or equal to five.*/
        String[] arr = {"BMW", "Mercedes", "Volvo", "Bugatti", "Ferrari", "Audi"};
        for (String brand : arr) {
            if (brand.length() >= 5) {
                System.out.println(brand);
            }
        }
    }
}
