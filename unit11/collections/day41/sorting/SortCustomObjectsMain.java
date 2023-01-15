package unit11.collections.day41.sorting;

import java.util.ArrayList;
import java.util.List;

public class SortCustomObjectsMain {
    public static void main(String[] args) {
        Student student1 = new Student("John", 16);
        Student student2 = new Student("Johnny", 17);
        Student student3 = new Student("Little John", 6);
        Student student4 = new Student("Big John", 19);
        Student student5 = new Student("Johannes", 11);
        Student student6 = new Student("John", 9);

        List<Student> students =
                new ArrayList<>(List.of(student1,student2,student3,student4,student5,student6));
    }
}
