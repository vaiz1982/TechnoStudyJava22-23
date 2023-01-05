package unit08.twoDArrays.day33.twoDArrayPracticeQuestions;

public class NumberOfTrues {
    public static void main(String[] args) {
        boolean[][] booleanValues = {
                {true,true,false,true},
                {true,true,false,true},
                {false,true,false,true},
                {false,true,false,false}
        };
        System.out.println(numberOfTrueElements(booleanValues));
    }

    public static int numberOfTrueElements(boolean[][] booleans){
        int counter = 0;
        for (boolean[] booleanArray: booleans) {
            for (boolean element: booleanArray) {
                if(element == true){
                    counter++;
                }
            }
        }
        return counter;
    }
}
