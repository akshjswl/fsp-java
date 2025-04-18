// wap to display use of abstract class.

abstract class parent{
    abstract void display1();
    void display2()
    {
        System.out.println("testing for abstract class");
    }
}
class Child extends parent{
    void display1()
    {
        System.out.println("this body is provided by child class");
    }
    void display3()
    {
        System.out.println("Child");
    }
}
class abstractCl{
    public static void main(String[] args) {
        Child t=new Child();
        t.display1();
        t.display2();
        t.display3();
    }
}