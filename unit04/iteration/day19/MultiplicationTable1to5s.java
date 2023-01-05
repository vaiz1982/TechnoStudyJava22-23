package unit04.iteration.day19;

public class MultiplicationTable1to5s {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
