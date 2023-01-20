package unit11.collections.day44.set.treeset;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet = new TreeSet<>(Comparator.comparing(Student::getGpa));

        studentTreeSet.addAll(List.of(new Student("John", 3.65), new Student("Mark", 3.79),
                new Student("David", 2.00), new Student("Jessica", 4.00), new Student("Linda", 2.86),
                new Student("Hugh", 2.65), new Student("Michael", 3.12), new Student("Dan", 4.5),
                new Student("Jane", 3.88)));
        System.out.println(studentTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("Highest GPA Student: " + studentTreeSet.last());
        System.out.println("-".repeat(100));
        System.out.println("Lowest GPA Student: " + studentTreeSet.first());
        System.out.println("-".repeat(100));
        System.out.println("Students with gpa between 2.0 and 3.0"
                + studentTreeSet.subSet(new Student("", 2.0), true, new Student("", 3.0), true));
        System.out.println("-".repeat(100));
        System.out.println("Student with gpa lower than 2.5: "
                + studentTreeSet.headSet(new Student("", 2.75)));
        System.out.println("-".repeat(100));
        System.out.println("Students with gpa greater than 3.5"
                + studentTreeSet.tailSet(new Student("", 3.5), false));
        System.out.println("-".repeat(100));
        System.out.println("Student with gpa greater than 3.1: "
                + studentTreeSet.higher(new Student("", 3.1)));
        System.out.println("-".repeat(100));
        System.out.println("Student with gpa less than 2.9: " +
                studentTreeSet.lower(new Student("", 2.9)));


        /**
         * Highest gpa
         * Lowest Gpa student
         * Students between 2.0 and 3.0 gpa (both inclusive)
         * Students gpa lower than 2.5
         * Students gpa greater than 3.5
         * The student gpa greater than 3.1
         * The student gpa is less than 2.9
         * */
    }
}
