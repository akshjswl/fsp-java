// program to display Synchronization of thread

class disp{
    void display (String s1)
    {
        System.out.println("Mr");
        System.out.println(""+s1);
        System.out.println("Roy");
    }
}

class syn implements Runnable{
    disp ob;
    String s1;
    syn (disp ob1, String s2)
    {
        ob=ob1;
        s1=s2;
        Thread t= new Thread(this, s1);
        t.start();
    }
    public void run(){
        synchronized(ob){
        ob.display(s1);
     }
    }
}
class Synchronization{
    public static void main(String[] args) {
        disp ob =new disp();
        new syn(ob, "Aksh");
        new syn(ob, "Harsh");
        new syn(ob, "Ayan");
    }
}