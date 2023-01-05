package unit08.twoDArrays.day33.twoDArrayPracticeQuestions;

public class FindMinimumValue {
    public static void main(String[] args) {
        int[][] twoDNumbers = {{11, 12, 13, 14}, {16, 17, -18, 19, 20}, {21, -22, 23}, {26, 27, 28, -29}};
        System.out.println(returnMinimumValue(twoDNumbers));
    }

    public static int returnMinimumValue(int[][] numbers) {
        int min = numbers[0][0];
        /*loops*/
        for (int[] numbersArray : numbers) {
            for (int number : numbersArray) {
                if (number < min) {
                    min = number;
                }
            }
        }
        return min;
    }
}
