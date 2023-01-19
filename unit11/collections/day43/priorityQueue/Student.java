package unit11.collections.day43.priorityQueue;

public class Student {
    private int age;
    private double gpa;

    public Student(int age, double gpa) {
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
