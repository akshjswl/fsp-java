class this_eg{
    int a,b;
    this_eg(int a, int b)
    {
        a=a;
        b=b;
    }
    void disp(){
        System.out.println(a+ " " +b);
    }
}

public class thisC{
    public static void main(String args[]){
        this_eg ob=new this_eg(20,40);
        ob.disp();
    }
}