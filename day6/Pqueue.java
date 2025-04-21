import java.util.*;

class Pqueue {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Adding elements to the priority queue
        queue.add("Sumit");
        queue.add("Vijay");
        queue.add("Jai");
        queue.add("Raj");

        System.out.println("Initial Queue: " + queue);

        // Displaying the head of the queue
        System.out.println("Head: " + queue.peek());

        // Iterating through the queue
        System.out.println("Iterating the queue elements:");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Removing head using remove()
        System.out.println("After first removal:");
        queue.remove();
        System.out.println(queue);

        // Removing head using poll()
        queue.poll();
        System.out.println("After second removal:");
        System.out.println(queue);

        // Another poll
        queue.poll();
        System.out.println("After third removal:");
        System.out.println(queue);
    }
}