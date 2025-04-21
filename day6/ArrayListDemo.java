
import java.util.*;
class ArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList a1=new ArrayList();
        a1.add("u");
        a1.add("r");
        a1.add("i");
        a1.add("t");
        a1.add("u");
        a1.add("Arunima");
        a1.add(1,"A2");//adding element in the middle
        System.out.println("Size after addition of elements:"+a1.size());//display the array list size
        System.out.println("Contents of a1:"+a1);//display the array lis
        //remove elements of the array list
        a1.remove("u");
        a1.remove("Arunima");
        a1.remove(1);//removing using index
        System.out.println("Size after deletion of elements:"+a1.size());
        System.out.println("Contents of a1:"+a1);
        //traversing the arraylist using iterator
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //traversing list through iterator but converting to string
        String s;
        Iterator itr2=a1.iterator();
        while(itr2.hasNext())
        {
            s=itr2.next().toString();
            System.out.println(s);
        }
        //traversing list using for but converting to string
        String s2;
        for(int i=0;i<a1.size();i++)
        {
            s2=a1.get(i).toString();
            System.out.println(s2);
        }
    }
    
}