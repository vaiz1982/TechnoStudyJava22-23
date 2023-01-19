package unit11.collections.day43.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class StudentSetExample {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("John", 21));
        studentSet.add(new Student("John", 16));
        System.out.println(studentSet);
        studentSet.add(new Student("John", 16));
        System.out.println(studentSet);
    }
}
