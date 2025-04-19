// program to display multiple catch against a single try block
class try_mul_catch {
    public static void main(String[] args) {
        int x =12;
        int y=2;
        int p[]={10,4,6,2};
        try {
            int z=x/y;
            System.out.println("the result is " +z);
            p[17]=10;
        } catch (ArithmeticException e) {
            System.out.println("this results to infinity");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("you are trying to reach a value which is out of index of the array");
        }
    }
}
