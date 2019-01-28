package OopsPackage.Inheritance;

public class ConstructorsA {
    ConstructorsA()
    {
        System.out.println("Inside constructor A:");
    }
}
 class ConstructorB extends ConstructorsA
{
     ConstructorB()
     {
         System.out.println("Inside constructor B:");
     }
}
class ConstructorC extends ConstructorB
{
    ConstructorC()
    {
        System.out.println("Inside constructor C:");
    }
}
class ConstructorUse
{
    public static void main(String[] args) {
        ConstructorC c1=new ConstructorC();
    }
}