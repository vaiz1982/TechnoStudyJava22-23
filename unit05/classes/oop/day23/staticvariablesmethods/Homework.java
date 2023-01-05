package unit05.classes.oop.day23.staticvariablesmethods;

public class Homework {
    private String name;
    private int maxPoint;
    private static int numOfHWs = 0;

    public Homework(String name, int maxPoint) {
        this.name = name;
        this.maxPoint = maxPoint;
        numOfHWs++;
    }

    public static int getNumOfHWs() {
        return numOfHWs;
    }

    public void printName() {
        System.out.println(name);
        System.out.println(numOfHWs);
    }

    public static void printInfo(int a, int b) {
        /*Cannot reach instance variables*/
        /*System.out.println(name);*/
        /*Cannot reach nonstatic methods*/
        /*printName();*/
        System.out.println(numOfHWs);
        System.out.println(a + b);
    }
}
