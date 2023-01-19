package unit11.collections.day42.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LIFOStackExample {
    public static void main(String[] args) {
        Deque<Integer> integerStack
                = new LinkedList<>();
        integerStack.push(99);
        System.out.println(integerStack);
        integerStack.push(11);
        System.out.println(integerStack);
        integerStack.push(55);
        System.out.println(integerStack);
        System.out.println("Popped from the stack: " + integerStack.pop());
        System.out.println(integerStack);
        System.out.println("Peeked from the stack: " + integerStack.peek());
        System.out.println(integerStack);
        System.out.println("Popped from the stack: " + integerStack.pop());
        System.out.println("Popped from the stack: " + integerStack.pop());
        /*pop works as removeFirst() which
        * will throw an exception if
        * the queue is empty.*/
        System.out.println("Popped from the stack: " + integerStack.pollFirst());
    }
}
