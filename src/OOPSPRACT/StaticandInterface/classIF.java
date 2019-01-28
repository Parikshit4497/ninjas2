package OOPSPRACT.StaticandInterface;
interface Ax1{
    void method1();
    void method2();
}
interface  Bx1 extends Ax1{
    void method3();
}
class Ax1Bx1 implements  Bx1{

    @Override
    public void method1() {
        System.out.println("Implements method 1 ");
    }

    @Override
    public void method2() {
        System.out.println("Implements method 2");
    }

    @Override
    public void method3() {
        System.out.println("Implements method 3");
    }
}
public class classIF {
    public static void main(String[] args) {
        Ax1Bx1 obj=new Ax1Bx1();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
