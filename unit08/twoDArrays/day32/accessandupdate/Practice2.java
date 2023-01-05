package unit08.twoDArrays.day32.accessandupdate;

public class Practice2 {
    public static void main(String[] args) {
        String[][] letters = {
                {"a", "b", "c", "d", "e"},
                {"f", "g", "h", "i", "j"},
                {"k", "l", "m", "n", "o"},
                {"p", "q", "r", "s", "t"},
                {"u", "v", "w", "x", "y"}
        };

//        Create a String as "SDET" from the 2D string array above.
//        And print it on the screen.
        String key = letters[3][3] + letters[0][3] + letters[0][4] + letters[3][4];
        key = key.toUpperCase();
        System.out.println(key);

        /*update the elements so it will print "BEST"*/
        letters[3][3] = "b";
        letters[0][3] = "e";
        letters[0][4] = "s";
        key = letters[3][3] + letters[0][3] + letters[0][4] + letters[3][4];
        key = key.toUpperCase();
        System.out.println(key);


    }
}
