package unit05.classes.oop.day23.staticvariablesmethods;

public class HomeworkMain {
    public static void main(String[] args) {
        Homework hw1 = new Homework("math1", 100);
        System.out.println(Homework.getNumOfHWs());
        Homework hw2 = new Homework("math2", 100);
        Homework hw3 = new Homework("math3", 100);
        System.out.println(Homework.getNumOfHWs());
    }
}
