package OopsPackage.Inheritance.InheritanceRevision;

public class ConstructA {
    ConstructA()
    {
        System.out.println("Inside A 's constructor:");
    }
}
class ConstructB extends ConstructA
{
    ConstructB()
    {
        System.out.println("Inside constructor B:");
    }
}
class ConstructC extends  ConstructB
{
    ConstructC()
    {
        System.out.println("Inside construct C:");
    }
}
class ConstructUse
{
    public static void main(String[] args) {
        ConstructC c=new ConstructC();
    }
}