package unit08.twoDArrays.day32.accessandupdate;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
         /*{{false, false, true, false},
      {false, false, false, false},
      {false, true, false, false}} */
        boolean[][] booleans = new boolean[3][4];
        System.out.println(Arrays.deepToString(booleans));
        booleans[0][2] = true;
        booleans[2][1] = true;
        System.out.println(Arrays.deepToString(booleans));
    }

}
