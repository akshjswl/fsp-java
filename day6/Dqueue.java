import java.util.*;

public class Dqueue {
    public static void main(String[] args) {

        // Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Sourav");
        deque.add("Amit");
        deque.add("Ajay");
        deque.add("Ashish");

        System.out.println("Initial deque: " + deque);

        // Adding elements to the front and end
        deque.offerFirst("Raj");
        deque.offerLast("Ayan");

        System.out.println("After offerFirst and offerLast: " + deque);

        // Removing elements from front and end
        deque.pollFirst();
        deque.pollLast();

        System.out.println("After pollFirst and pollLast: " + deque);
    }
}