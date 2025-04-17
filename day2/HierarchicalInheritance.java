class A {
    int i = 100;

    void show() {
        System.out.println("Value of i from class A: " + i);
    }
}

class B extends A {
    void displayB() {
        System.out.println("Inside class B");
    }
}

class C extends A {
    void displayC() {
        System.out.println("Inside class C");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();

        // Accessing members from class A using object of class B
        objB.show();
        objB.displayB();

        // Accessing members from class A using object of class C
        objC.show();
        objC.displayC();
    }
}
