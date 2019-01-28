package OopsPackage;

public class OverloadDemo {
     public  void test()
     {
        System.out.println("No parameter is passes in this method");
     }
    public void test(int a )
    {
        System.out.println("One method is passed in the above method: " + a);
    }
    public void test(int a,int b)
    {
        System.out.println("Two method are passes in the constructor both having the data type:" + a +"," + b);
    }
    public void test(double d)
    {
        System.out.println("One parameter of type double:"+ d);
    }
    public void test(double a,double b)
    {
        System.out.println("Two parameters each of type float :" + a+","+b);
    }
}
