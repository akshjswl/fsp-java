class Thread1 implements Runnable //STEP1
{
    public void run() //STEP4
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread1's i= "+i);
        }
    }
}
class Thread2 implements Runnable //STEP1
{
    public void run() //STEP4
    {
        for(int j=0;j<10;j++)
        {
            System.out.println("Thread2's j= "+j);
        }
    }
}
class Thread3 implements Runnable //STEP1
{
    public void run() //STEP4
    {
        for(int k=0;k<10;k++)
        {
            System.out.println("Thread3's k= "+k);
        }
    }
}
class FourThreadCalling {
     public static void main(String args[])
    {
        Thread1 ob1=new Thread1();
        Thread2 ob2=new Thread2();
        Thread3 ob3=new Thread3();
        Thread t1=new Thread(ob1); //STEP2
        Thread t2=new Thread(ob2);
        Thread t3=new Thread(ob3);
        t1.start(); //STEP3
        t2.start();
        t3.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread main's i= "+i);
        }
    }
}