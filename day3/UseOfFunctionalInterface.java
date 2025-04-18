//USE OF FUNCTIONAL INTERFACR
interface A //THIS IS A FUNCTIONAL INTERFACE
{
    void display();
}
class UseOfFunctionalInterface{
    public static void main(String args[])
    {
        A obj = ()->
        {
            //THIS IS THE LAMBDA EXPRESSION REPLACING THE FUNCTIONAL INTERFACE
            System.out.println("THIS IS IMPLEMENTATION USING ANONYMOUS INNER CLASS");
        };
        obj.display();
    }
}