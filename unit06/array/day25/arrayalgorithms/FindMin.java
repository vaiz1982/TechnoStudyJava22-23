package unit06.array.day25.arrayalgorithms;

public class FindMin {
    public static void main(String[] args) {
        int[] numbers = {31, 3, 123, 124, 123, 43, 46, -47, 4567, 3, 6, 578, 1, 2353456, 4587, 58, 4, -1};

//        int min = Integer.MAX_VALUE;
        int min = numbers[0];

        for (int number : numbers) {
            if(number<min){
                min = number;
            }
        }

        System.out.println("The minimum number is " + min);

    }
}
