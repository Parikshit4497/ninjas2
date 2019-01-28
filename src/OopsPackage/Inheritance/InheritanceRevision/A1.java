package OopsPackage.Inheritance.InheritanceRevision;

public class A1 {
    public int i;
    private int j;
    void setIJ(int x,int y)
    {
        i=x;
        j=y;
    }
}
class B1 extends A1{
    int total ;
    void sum()
    {
        /*total=i+j;*//*gives error because j has aprivate access modifiers*/
    }
}
class Acess
{
    public static void main(String[] args) {
        B1 subOb=new B1();
        subOb.setIJ(5,6);
        subOb.sum();
        System.out.println("The total of  i and j:"+subOb.total);
    }
}