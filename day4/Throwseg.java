import java.io.*;

class Throwseg {
    public static void main(String[] args) throws Exception {
        DataInputStream ds = new DataInputStream(System.in);//System.in represents keyboard inputs

        System.out.println("Input 3 nos: ");
        int a = Integer.parseInt(ds.readLine());
        float b = Float.parseFloat(ds.readLine());
        double c = Double.parseDouble(ds.readLine());

        System.out.println("enter a string");
        String ch = ds.readLine();

        System.out.println("string= " + ch);
        System.out.println("3 Nos= " + a + " " + b + " " + c);
    }
}
