package OopsPackage.Inheritance.InheritanceRevision;

public class A {
    int i,j;
    void showIJ()
    {
        System.out.println("show the value of i and j"+i+","+j);
    }
}
class B extends A{
    int k;
    void showK()
    {
        System.out.println("show value of k:" + k );
    }
}
class InheritanceUse
{
    public static void main(String[] args) {
        A superObj=new A();
        B subObj=new B();
        superObj.i=10;
        superObj.j=20;
        superObj.showIJ();
        System.out.println();
        subObj.i=7;
        subObj.j=8;
        subObj.k=9;
        subObj.showIJ();
        subObj.showK();

    }
}