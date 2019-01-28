package OopsPackage.Inheritance;

public class A1 {
    public int i;
    /*private int j;*/
    public int j;
    void setIJ(int x,int y)
    {
        i=x;
        j=y;
    }
}
class B1 extends A1
{
    int total ;
    void sum()
    {
        total=i+j;/*this will give error for private as they cannot be inherited
        but works fine for public:*/
    }
}
class Acess
{
    public static void main(String[] args) {
        B1 subob=new B1();
        subob.setIJ(5,4);
        subob.sum();
        System.out.println("The total is: " + subob.total );
    }
}