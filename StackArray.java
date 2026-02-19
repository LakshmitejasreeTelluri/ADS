import java.util.ArrayDeque;
import java.util.Queue;
public class QueueArray{
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Apple"); 
        queue.offer("Banana");
        queue.offer("Cherry");
        System.out.println("Queue after enqueue: " + queue);
        String head = queue.peek(); 
        System.out.println("Head of queue (peek): " + head);
        String removed = queue.poll(); 
        System.out.println("Removed element (poll): " + removed); 
        System.out.println("Queue after dequeue: " + queue); 
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty); 
    }
}

