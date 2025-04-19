class nomatch extends Exception //USERDEFINED EXCEPTION
{
    
}
class Throw_eg
{
    void check(String s1) throws nomatch
    {
        char ch;
        ch=s1.charAt(0);
        if(ch=='M')
        {
            System.out.println("VALID ID");
        }
        else
        {
            throw new nomatch();
        }
    }
}
class UserDefinedException {
    public static void main(String args[])
    {
        Throw_eg ob=new Throw_eg();
        try
        {
            ob.check("Ayan");
        }
        catch(nomatch e)
        {
            System.out.println("INVALID ID");
        }
        finally
        {
            System.out.println("THANK YOU");
        }
    }
}