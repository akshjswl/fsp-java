class A1 extends Thread //STEP1
{
    A1()
    {
        start(); //STEP2
    }
    public void run() //STEP3
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("A1's i= "+i);
        }
    }
}
class CreationOfThreadByExtendingThreadClass {
    public static void main(String args[])
    {
        new A1();
        for(int i=0;i<=20;i++)
        {
            System.out.println("Main i= "+i);
        }
    }
}