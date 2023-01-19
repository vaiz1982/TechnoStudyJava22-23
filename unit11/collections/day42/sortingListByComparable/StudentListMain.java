package unit11.collections.day42.sortingListByComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentListMain {
    public static void main(String[] args) {
        List<Student> students
                = new ArrayList<>();

        students.add(new Student(3.90));
        students.add(new Student(2.76));
        students.add(new Student(3.2));
        students.add(new Student(2.1));
        students.add(new Student(3.31));
        students.add(new Student(2.41));

        students.sort(Comparator.comparing(Student::getGpa).reversed());
        System.out.println(students);
    }
}
