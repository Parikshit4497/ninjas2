package OopsPackage.Inheritance.InheritanceRevision;

public class classA {
    int i;
}
class classB2 extends classA
{
    int i;
    void setB2(int x,int y)
    {
        super.i=x;
        i=y;
    }
    void showB2()
    {
        System.out.println(" i in superclass: " +super.i);
        System.out.println("i in subclass: " + i);
    }

    public static void main(String[] args) {
     classB2 b2= new classB2();
     b2.setB2(5,6);
     b2.showB2();
    }

}