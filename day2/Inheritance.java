class A {
    int i = 10;
}

// Inheriting the parent class
class B extends A {
    void disp() {
        System.out.println(i);  // Accessing variable from class A
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B ob = new B();
        ob.disp();  // Output will be: 10
    }
}
