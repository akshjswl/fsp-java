import java.util.*;
class UseOfVector
{
    public static void main(String args[]){
        Vector v = new Vector();
        v.add(8);
        v.add(10);
        v.add("Ashish");
        v.add("Garima");
        v.add("Garima");
        Iterator itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
