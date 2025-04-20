class EndsWith
{
    public static void main(String args[])
    {
        String Str=new String("This is really not immutable !!");
        boolean retVal;
        retVal = Str.endsWith("Immutable!!");
        System.out.println("Returned Value ="+retVal);
         retVal = Str.endsWith("Immu");
        System.out.println("Returned Value ="+retVal);
    }
}