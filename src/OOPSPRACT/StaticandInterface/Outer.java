package OOPSPRACT.StaticandInterface;

public class Outer {
    private int Outer_X=100;
    void display(){
        System.out.println("Inside outer class display");
        InnerClass inner=new InnerClass();
        inner.test();
    }
    class InnerClass{
        void test(){
            System.out.println("Invoking inner class method showing val of outer class variable" +Outer_X);
        }
    }
}
class OuterDemo{
    public static void main(String[] args) {
        Outer out=new Outer();
        out.display();
    }
}