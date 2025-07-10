import java.util.*;

class MyCircularQueue {
    
    private List<Integer> circularQueue;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueue(int k) {
        circularQueue = new ArrayList<Integer>(k);
        head = -1;
        tail = -1;
        size = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue full");
            return false;
        }
        if (isEmpty()) {
            head = 0;
            tail = 0;
        } else {
            tail = (tail + 1) % size;
        }
        if (circularQueue.size() <= tail) {
            circularQueue.add(value);
        } else {
            circularQueue.set(tail, value);
        }
        System.out.printf("Queued %d at %d%n", value, tail);
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return false;
        }
        int value = circularQueue.get(head);
        System.out.printf("Dequeued %d at %d%n", value, head);
        if (head == tail) {
            // Queue becomes empty
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % size;
        }
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return circularQueue.get(head);
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return circularQueue.get(tail);
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}


public class CircularQueue {
    public static void main(String[] args) {
        // Create a circular queue of capacity 3
        MyCircularQueue queue = new MyCircularQueue(3);

        // Enqueue elements
        System.out.println("Enqueue 1: " + queue.enQueue(1)); // true
        System.out.println("Enqueue 2: " + queue.enQueue(2)); // true
        System.out.println("Enqueue 3: " + queue.enQueue(3)); // true
        System.out.println("Enqueue 4 (should fail - full): " + queue.enQueue(4)); // false

        // Get the rear element
        System.out.println("Rear element: " + queue.Rear()); // 3

        // Check if the queue is full
        System.out.println("Is full: " + queue.isFull()); // true

        // Dequeue one element
        System.out.println("Dequeue: " + queue.deQueue()); // true

        // Enqueue another element
        System.out.println("Enqueue 4: " + queue.enQueue(4)); // true

        // Get front and rear
        System.out.println("Front element: " + queue.Front()); // 2
        System.out.println("Rear element: " + queue.Rear()); // 4

        // Dequeue all elements
        System.out.println("Dequeue: " + queue.deQueue()); // true
        System.out.println("Dequeue: " + queue.deQueue()); // true
        System.out.println("Dequeue: " + queue.deQueue()); // true

        // Try to dequeue from empty queue
        System.out.println("Dequeue (should fail - empty): " + queue.deQueue()); // false

        // Check if queue is empty
        System.out.println("Is empty: " + queue.isEmpty()); // true
    }
}
