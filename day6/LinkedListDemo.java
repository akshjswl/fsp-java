import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Creating a LinkedList with mixed data types using generics (Object allows any type)
        LinkedList<Object> list = new LinkedList<>();

        // Adding elements
        list.add("Ayan");
        list.add("Roy");
        list.add("S");
        list.add(25);

        System.out.println("Size after addition of elements: " + list.size());

        // Traversing using Iterator
        System.out.println("\nTraversing with Iterator:");
        Iterator<Object> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Removing elements
        list.remove("Roy");   // Remove by value
        list.remove(2);       // Remove by index

        System.out.println("\nSize after deletion of elements: " + list.size());

        // Traversing using enhanced for loop
        System.out.println("\nTraversing with for-each loop:");
        for (Object element : list) {
            System.out.println(element.toString());
        }
    }
}
