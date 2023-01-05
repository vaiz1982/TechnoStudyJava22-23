package unit06.array.day24.ArrayReview;

public class Student {
    private int[] grades;
    private String name;

    public Student(int[] grades, String name) {
        this.grades = grades;
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
