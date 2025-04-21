import java.util.*;

class StackExample {
    public static void main(String args[]) {
        Stack<String> stack1 = new Stack<>();

        // Pushing elements into the stack
        stack1.push("Ayan");
        stack1.push("Sourav");
        stack1.push("Amit");
        stack1.push("Ashish");
        stack1.push("Manoj");

        System.out.println("Before popping any values:");
        Iterator<String> itr = stack1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Pop the top element
        stack1.pop();

        System.out.println("\nAfter popping:");
        Iterator<String> itr2 = stack1.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // Removing element at index 2
        stack1.remove(2);

        System.out.println("\nAfter removing element at index 2:");
        Iterator<String> itr3 = stack1.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        // Display top element of the stack
        String s1 = stack1.peek();
        System.out.println("\nTop element: " + s1);

        // Check if the stack is empty
        boolean b = stack1.empty();
        System.out.println("Is stack empty? " + b);

        // Search for elements in the stack
        int pos = stack1.search("Ashish");
        System.out.println("The element 'Ashish' is at position: " + pos);

        int pos1 = stack1.search("Ayan");
        System.out.println("The element 'Ayan' is at position: " + pos1);

        // Remove all elements from stack
        stack1.removeAllElements();
        System.out.println("Stack after removing all elements: " + stack1);
    }
}