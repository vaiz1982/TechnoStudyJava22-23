package unit08.twoDArrays.day32.accessandupdate;

public class AccessAndUpdate2DElements {
    public static void main(String[] args) {
        int[][] numbersArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {11, 12, 13},
                {16, 17},
                {116, 117, 1116, 11117}
        };

        /*Please print 8 to the screen*/
        System.out.println(numbersArray[1][2]);
        /*Please print 491116 to the screen*/
        System.out.println("" + numbersArray[0][3] + numbersArray[1][3] + numbersArray[4][2]);
        /*Please print 13117163*/
        System.out.println("" + numbersArray[2][2] + numbersArray[4][1] + numbersArray[3][0] + numbersArray[0][2]);

        /*updating the elements*/
        numbersArray[1][3] = 111;
        System.out.println(numbersArray[1][3]);

        /*change the 1116 to 6666*/
        numbersArray[4][2] = 6666;
        System.out.println(numbersArray[4][2]);

        /*Please use the same code that you printed 13117163 to print 0123*/

        numbersArray[2][2] = 0;
        numbersArray[4][1] = 1;
        numbersArray[3][0] = 2;
        numbersArray[0][2] = 3;
        System.out.println("" + numbersArray[2][2] + numbersArray[4][1] + numbersArray[3][0] + numbersArray[0][2]);

        /*please print the last element in the last array using the length property*/
        System.out.println(numbersArray[numbersArray.length-1][numbersArray[numbersArray.length-1].length-1]);
        /*please print the first arrays length*/
        System.out.println(numbersArray[0].length);
        /*please print the last array's length*/
        System.out.println(numbersArray[numbersArray.length-1].length);


    }
}
