public class DeleteStringBuffer {
    public static void main(String[] args) {
        StringBuffer s3=new StringBuffer("Integes are not Immutable.");
        s3.delete(1,3);//now original string has been changed
        System.out.println(s3);

    }
}
