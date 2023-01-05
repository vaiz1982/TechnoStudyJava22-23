package unit08.twoDArrays.day33.twoDArrayPracticeQuestions;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        int[][] twoDNumbers = {{11, 12, 13, 14}, {16, 17, -18, 19, 20}, {21, -22, 23}, {26, 27, 28, -29}};
        System.out.println(sumOfAllNumbers(twoDNumbers));
        /* Inside the psvm without the method...
        int sum = 0;
        for (int i = 0; i < twoDNumbers.length; i++) {
            for (int j = 0; j < twoDNumbers[i].length; j++) {
                sum = sum + twoDNumbers[i][j];
            }
        }
        System.out.println(sum);*/
    }
    public static int sumOfAllNumbers(int[][] numbers){
        int sum = 0;
        /*for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];
            }
        }*/
        for (int[] intArray :numbers ) {
            for ( int number : intArray ) {
                sum = sum + number;
            }
        }
        return sum;
    }
}
