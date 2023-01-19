package unit11.collections.day42.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOExample {
    public static void main(String[] args) {
        Queue<Integer> integerQueue
                = new LinkedList<>();
        System.out.println(integerQueue);
        integerQueue.offer(34);
        integerQueue.offer(35);
        integerQueue.offer(111);
        integerQueue.offer(112);
        System.out.println(integerQueue);
        System.out.println("Removed element from the queue: "+integerQueue.poll());
        System.out.println(integerQueue);
        System.out.println("Removed element from the queue: "+integerQueue.poll());
        System.out.println(integerQueue);
        System.out.println("Peek to the next in queue: "+ integerQueue.peek());
        System.out.println("After the peek: " + integerQueue);
        System.out.println("Removed element from the queue: "+integerQueue.poll());
        System.out.println(integerQueue);
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue);
    }
}
