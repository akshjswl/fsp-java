// wap to display use of static nested class

class Outer {
    int a=10;
    static int d=40;
    void disp1()
    {
        System.out.println(a);
        Inner ob =new Inner();
        ob.disp2();
    }
    class Inner
    {
        int b=20;
        void disp2(){
            System.out.println(b);
            System.out.println(a);
            System.out.println(d);
        }
    }
}

class non_static{
    public static void main(String[] args) {
        Outer ob=new Outer();
        ob.disp1();
    }
}