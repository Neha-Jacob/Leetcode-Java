import java.util.*;

class MyQueue {
    // store elements
    private List<Integer> data;         
    // a pointer to indicate the start position
    private int p_start;            
    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    /** Insert an element into the queue. Return true if the operation is successful. */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    };    
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        data.remove(0);
        return true;
    }
    /** Get the front item from the queue. */
    public int Front() {
        return data.get(0);
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return data.size() == 0;
    }     
};

public class QueueImplementation {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        while (q.isEmpty() == false) {
            System.out.println("Dequeueing " + q.Front());
            q.deQueue();
        }
        System.out.println("Queue emptied");
    }
}