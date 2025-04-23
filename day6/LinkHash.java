import java.util.*;

public class LinkHash {
    public static void main(String args[]) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Viki");
        set.add("Vijay");
        set.add("Ayan");
        set.add("Viki"); // Duplicate, won't be added again

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

