interface i1
{
    void display1();
}
interface i2
{
    void display2();
}
class Inter implements i1,i2
{
    public void display1()
    {
        System.out.println("Display for interface1");
    }
    public void display2()
    {
        System.out.println("Display for interface2");
    }
}
class UseOfInterface {
    public static void main(String args[])
    {
        i1 ob1=new Inter();//CREATING OBJECT FOR CLASS INTER & ASSIGNING IT TO THE INTERFACE I1
        ob1.display1();
        i2 ob2=new Inter();
        ob2.display2();
    }
}