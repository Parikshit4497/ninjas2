package OopsPackage;

public class OverloadAuto {
    void test()
    {
        System.out.println("No parameter is passed:");
    }
    void test(int a,int b)
    {
        System.out.println("The two parameter were passed first is a " + a+","+"b "+b);
    }
    void test(double a)
    {
        System.out.println("One parameter is passed with data type double: " + a);
    }
}
class OverloadTestDemo2
{
    public static void main(String[] args) {
        OverloadAuto o1=new OverloadAuto();
        o1.test();
        o1.test(5,6);
        o1.test(5.666);
    }
}