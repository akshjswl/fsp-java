// wap to display use of static nested class

class outer {
    static int a=10;
    int c=30;
    void disp1()
    {
        Inner ob =new Inner();
        ob.disp2();
    }
    static class Inner
    {
        int b=20;
        void disp2(){
            System.out.println(b);
            System.out.println(a);
            Outer ob2=new Outer();
            system
        }
    }
}