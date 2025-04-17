class co {
    int a, b;
    co() {
        a = 20;
        b = 40;
    }
    co(int x, int y) {
        a = x;
        b = y;
    }
    co(int x) {
        a = x;
        b = 180;
    }

    void disp() {
        System.out.println("The values of a and b are: " + a + " " + b);
    }
}
public class Const_over {
    public static void main(String[] args) {
        co ob1 = new co(50);      
        co ob2 = new co(50, 80);  
        co ob3 = new co();         

        ob1.disp();
        ob2.disp();
        ob3.disp();
    }
}
