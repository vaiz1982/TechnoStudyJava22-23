package unit04.iteration.day19;

public class NestedLoopExample1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            for (int j = 0; j < 4; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
