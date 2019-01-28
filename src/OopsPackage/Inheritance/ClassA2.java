package OopsPackage.Inheritance;

public class ClassA2 {
    int i;

}
class ClassB2 extends ClassA2
{
    int i;
    ClassB2(int a,int b) {
        super.i = a;
        i = b;
    }
    void show()
    {
        System.out.println("i in superclass :" +super.i );
        System.out.println("i in subclass :" + i);
    }
}
class UseSuper
{
    public static void main(String[] args) {
       ClassB2 subObj=new ClassB2(3,4);
        subObj.show();
    }
}