//USE OF FUNCTIONAL INTERFACR
interface A //THIS IS A FUNCTIONAL INTERFACE
{
    void display();
}
class functionalInterface {
    public static void main(String args[])
    {
        A obj = new A()
        {
            //ANONYMOUS INNER CLASS
            public void display()
            {
                 System.out.println("THIS IS IMPLEMENTATION USING ANONYMOUS INNER CLASS ");
            }
        };
        obj.display();
    }
}