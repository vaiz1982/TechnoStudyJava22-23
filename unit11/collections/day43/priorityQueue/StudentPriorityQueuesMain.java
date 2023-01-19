package unit11.collections.day43.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentPriorityQueuesMain {
    public static void main(String[] args) {
        Queue<Student> youngerFirst
                = new PriorityQueue<>(Comparator.comparing(Student::getAge));
        Queue<Student> higherGPAFirst
                = new PriorityQueue<>(Comparator.comparing(Student::getGpa).reversed());
        youngerFirst.offer(new Student(14, 3.98));
        youngerFirst.offer(new Student(17, 3.75));
        youngerFirst.offer(new Student(11, 3.12));
        youngerFirst.offer(new Student(12, 2.7));
        youngerFirst.offer(new Student(9, 4.00));
        System.out.println("-".repeat(20));
        System.out.println(youngerFirst);
        System.out.println(youngerFirst.poll());
        System.out.println("-".repeat(20));
        System.out.println(youngerFirst);

        higherGPAFirst.offer(new Student(14, 3.98));
        higherGPAFirst.offer(new Student(17, 3.75));
        higherGPAFirst.offer(new Student(11, 3.12));
        higherGPAFirst.offer(new Student(12, 2.7));
        higherGPAFirst.offer(new Student(9, 4.00));
        System.out.println("-".repeat(20));
        System.out.println(higherGPAFirst);
        System.out.println("-".repeat(20));
        System.out.println(higherGPAFirst.poll());
        System.out.println(higherGPAFirst);

    }
}
