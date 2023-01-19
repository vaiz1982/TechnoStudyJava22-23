package unit11.collections.day42.sortingListByComparable;

public class Student  {
    private Double gpa;

    public Student(Double gpa) {
        this.gpa = gpa;
    }

    public Double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                '}';
    }

}
