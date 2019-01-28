package OopsPackage.Inheritance;

public class A {
    int i,j;
    void showij()
    {
        System.out.println("The value of i and j is: " + i +","+ j);
    }
}
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("K:" + k);
    }
    void sumIJK()
    {
        System.out.println("The sum of (i+j+k): "+ (i+j+k));
    }
}
class SimpleInheritance
{
    public static void main(String[] args) {
        A superObj=new A();
        B subObj=new B();
        superObj.i=20;
        superObj.j=30;
        superObj.showij();
        System.out.println();
        subObj.i=2;
        subObj.j=3;
        subObj.k=5;
        subObj.showij();
        subObj.showk();
        subObj.sumIJK();

    }
}