package unit11.collections.day43.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueString {
    public static void main(String[] args) {
        Queue<String> stringPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        stringPriorityQueue.offer("Tokyo");
        stringPriorityQueue.offer("Trabzon");
        stringPriorityQueue.offer("Trablusgarp");
        stringPriorityQueue.offer("New York");
        stringPriorityQueue.offer("New Orleans");
        stringPriorityQueue.offer("Orlando");
        stringPriorityQueue.offer("Virginia");
        stringPriorityQueue.offer("Alabama");
        System.out.println("-".repeat(15));
        System.out.println(stringPriorityQueue);
        System.out.println("-".repeat(15));
        System.out.println(stringPriorityQueue.poll());
        System.out.println(stringPriorityQueue);
        System.out.println("-".repeat(15));
        System.out.println(stringPriorityQueue.poll());
        System.out.println(stringPriorityQueue);
        System.out.println("-".repeat(15));
        System.out.println(stringPriorityQueue.poll());
        System.out.println(stringPriorityQueue);
        System.out.println("-".repeat(15));
        System.out.println(stringPriorityQueue.poll());
        System.out.println(stringPriorityQueue);
        System.out.println("-".repeat(15));
        System.out.println(stringPriorityQueue.poll());
        System.out.println(stringPriorityQueue);

    }
}
