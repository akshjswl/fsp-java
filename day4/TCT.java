class throweg {
    void check(String s1)
    {
        char ch;
        ch=s1.charAt(0);
        if(ch=='A')
        {
            System.out.println("valid id");
        }
        else
        {
            try {
                throw  new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("invalid id");
            }
        }
    }
}

class TCT{
    public static void main(String[] args) {
        throweg ob=new throweg();
        ob.check("Aksh");
    }
}
