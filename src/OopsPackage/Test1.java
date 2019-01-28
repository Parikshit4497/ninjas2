package OopsPackage;

public class Test1 {
    int a,b;
    Test1 (int i,int j)
    {
        a=i;
        b=j;
    }
    void meth(Test1 o)
    {
        o.a*=2;
        o.b/=2;
    }
}
class Test1use
{
    public static void main(String[] args) {
        Test1 ob=new Test1(15,20);
        System.out.println("Ob.a and Ob.b before call " +ob.a+" "+ ob.b);
        ob.meth(ob);
        System.out.println("Ob.a and Ob.b after call " + ob.a+" "+ ob.b );
    }
}