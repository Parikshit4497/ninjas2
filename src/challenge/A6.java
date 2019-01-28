package challenge;

import OopsPackage.Box6;
import com.sun.javaws.Cache6UpgradeHelper;

public class A6{
    void callme()
    {
        System.out.println("You are in A's call me method :");
    }
}
class B6 extends A6{
    void callme()
    {
        System.out.println("You are in b's call me method");
    }
}
class C6 extends B6
{
    void callme()
    {
        System.out.println("You are in c's call me method ");
    }
}
class Test
{
    public static void main(String[] args) {
        A6 a=new A6();
        B6 b=new B6();
        C6 c=new C6();

        A6 r;
        r=a;
        r.callme();
        r=b;
        r.callme();
        r=c;
        r.callme();
    }
}