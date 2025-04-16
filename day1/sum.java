//wap to take two nnumber and display their sum using the concept of class and object

class Test1{
    int a,b,c,d;
    void input(){
        a=10;
        b=20;
        c=30;
    }
    void calculate(){
        d=a+b+c;
    }
    void disp(){
        System.out.println("the result are " +d);
    }
}
public class sum {

    public static void main(String[] args) {
        Test1 ob =new Test1();
        ob.input();
        ob.calculate();
        ob.disp();
    }
}