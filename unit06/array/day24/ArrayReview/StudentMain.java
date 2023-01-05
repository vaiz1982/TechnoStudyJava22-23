package unit06.array.day24.ArrayReview;

public class StudentMain {
    public static void main(String[] args) {
        int[] myGrades = {100,97, 99};
        Student student1 = new Student(myGrades, "John Doe");
        int[] studentGrades = student1.getGrades();
        System.out.println(studentGrades[2]);
    }
}
