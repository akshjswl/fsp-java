class M_Lvl {
    int a=50;
}
class B extends M_Lvl
{
    int b=a*a;
}
class C extends B
{
    void display()
    {
        System.out.println("The value of a= "+a);
        System.out.println("The value of b= "+b);
    }
}
class multilevelInheritance{
    public static void main(String args[])
    {
        C ob=new C();
        ob.display();
    }
}