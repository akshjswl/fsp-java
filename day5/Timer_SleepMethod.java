import java.util.Scanner;

class Timer_SleepMethod {
    public static void main(String s[])
    {
        System.out.println("The timer is on...");
        for(int i=10;i>=0;i--)
        {
            try
            {
                Thread.sleep(2000);
                System.out.println(i);
                if(i==0)
                    System.out.println("Boom!!");
            }
            catch(InterruptedException e)
            {}
        }
    }
}