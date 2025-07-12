import java.util.*;

public class QueueInBuilt {
    public static void main (String[] args) {

        // Initialize queue using linked list as underlying data structure => Bilt-in Java Queue
        Queue<Integer> queue = new LinkedList<>();

        // get the first element
        System.out.printf("The first element in the queue is: %d%n", queue.peek());

        // add an element to the queue
        queue.offer(5);
        queue.offer(3);
        queue.offer(7);
        System.out.printf("The first element in the queue is: %d%n", queue.peek());

        // remove the first element
        queue.poll();

        System.out.printf("The first element in the queue is: %d%n", queue.peek());

        // Get queue sizr
        System.out.printf("The queue size is: %d%n", queue.size());
    }
}