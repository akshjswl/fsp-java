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
class CreationOfThreadByRunnableInterface {
    public static void main(String args[])
    {
        Thread1 ob=new Thread1();
        Thread t=new Thread(ob); //STEP2
        t.start(); //STEP3
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread main's i= "+i);
        }
    }
}