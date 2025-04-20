class Startswith 
{
    public static void main(String s[])
    {
        String s3=new String("Integes are not immutable");
        boolean retval;
        retval=s3.startsWith("immutable");
        System.out.println("Returned value is:"+retval);
        retval=s3.startsWith("In");
        System.out.println("Returned value is:"+retval);
    }
}