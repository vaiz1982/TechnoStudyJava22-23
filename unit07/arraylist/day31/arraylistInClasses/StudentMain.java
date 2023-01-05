package unit07.arraylist.day31.arraylistInClasses;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 11);
        System.out.println(Student.getStudentsList());

        Student student2 = new Student("Bryan Schmidt", 12);

        System.out.println(Student.getStudentsList());

    }
}
