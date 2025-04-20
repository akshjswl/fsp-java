public class ReplaceMStringBuffer {
     public static void main(String s[])
    {
        StringBuffer s3=new StringBuffer("Integes are not Immutable.");
        s3.replace(1,3,"Java");//now original string has been changed
        System.out.println(s3);
}
}
