package unit04.iteration.day19;

import static java.lang.Math.abs;
import static java.lang.System.out;

public class DecreasingStars {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                out.print("* ");
            }
            out.println();
            abs(-3);
        }
    }
}
