import java.util.*;

public class Tree1{
    public static void main(String args[]) {

        // Creating TreeSet and adding elements
        TreeSet<String> set = new TreeSet<>();

        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi"); // Duplicate, will be ignored
        set.add("Ajay");

        // Traversing elements
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}