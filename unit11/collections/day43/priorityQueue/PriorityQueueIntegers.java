package unit11.collections.day43.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIntegers {
    public static void main(String[] args) {
        Queue<Integer> priorityIntegers
                 = new PriorityQueue<>();
        priorityIntegers.offer(45);
        priorityIntegers.offer(13);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers);
        priorityIntegers.offer(25);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers.poll());
        System.out.println(priorityIntegers);
        priorityIntegers.offer(22);
        priorityIntegers.offer(11);
        priorityIntegers.offer(85);
        priorityIntegers.offer(111);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers.poll());
        System.out.println(priorityIntegers);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers.poll());
        System.out.println(priorityIntegers);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers.poll());
        System.out.println(priorityIntegers);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers.poll());
        System.out.println(priorityIntegers);
        priorityIntegers.offer(85);
        priorityIntegers.offer(85);
        priorityIntegers.offer(85);
        System.out.println("-".repeat(15));
        System.out.println(priorityIntegers.poll());
        System.out.println(priorityIntegers);
    }
}
