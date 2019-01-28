package challenge;

public class A {
    int i,j;
    void show()
    {
        System.out.println("i and j: " + i+ " " + j);
    }
}
class B extends A{
    int k;
    void shokwk()
    {
        System.out.println("k: " + k);
    }
    void sumijk()
    {
        System.out.println("i+j+k" +(i+j+k));
    }
}
class simpleInheritance
{
    public static void main(String[] args) {
        A superObj =new A();
        B subObj=new B();
        superObj.i=10;
        superObj.j=20;
        System.out.println("Contents of superObj:");
        superObj.show();
        System.out.println();
        subObj.i=7;
        subObj.j=8;
        subObj.k=9;
        System.out.println("Contents of subOb");
        subObj.shokwk();
        System.out.println("Sum of i,j and k is subObj");
        subObj.sumijk();
    }
}