package unit07.arraylist.day31.arraylistInClasses;

import java.util.ArrayList;

public class Student {
    private String name;
    private int gradeLevel;
    private static ArrayList<Student> studentsList =
            new ArrayList<>();

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        studentsList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public static ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public static void setStudentsList(ArrayList<Student> studentsList) {
        Student.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}
