package unit07.arraylist.day30.arraylistInClasses;

import java.util.ArrayList;

public class Student {
    /*Student
    name
    grade
    mathGrades - ArrayList<Integer>
    addMathGrade(int score)
    mathAverage()
    removeLessThanSeventy()*/

    /*Instance Variables*/
    private String name;
    private int gradeLevel;
    private ArrayList<Integer> mathGrades;

    /*Class Methods*/
    public void addMathGrade(int score) {
        mathGrades.add(score);
    }

    public double calculateAverageMathGrade() {
        double sum = 0.0;
        for (int score : mathGrades) {
            sum = sum + score;
        }
        double average = sum / mathGrades.size();
        return average;
        /*return sum / mathGrades.size();*/
    }

    public void removeLessThanSeventy() {
        for (int i = 0; i < mathGrades.size(); i++) {
            if (mathGrades.get(i) < 70) {
                mathGrades.remove(i);
                i--;
            }
        }
    }

    /*Constructor, Getters and Setters*/
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        mathGrades = new ArrayList<>();
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

    public ArrayList<Integer> getMathGrades() {
        return mathGrades;
    }

    public void setMathGrades(ArrayList<Integer> mathGrades) {
        this.mathGrades = mathGrades;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", gradeLevel=" + gradeLevel + ", mathGrades=" + mathGrades + '}';
    }
}
