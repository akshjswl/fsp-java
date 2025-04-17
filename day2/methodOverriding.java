class Parent{
    int a=15, b=20;
    void display()
    {
        int c=a+b; 
        System.out.println("the sum is " +c);
    }
}
class child extends Parent {
    void display()
    {
        super.display();
        int d=a*b;
        System.out.println("the product is " +d);
    }
}

class methodOverriding {
    public static void main(String[] args) {
        child ob =new child();
        ob.display();
    }
}