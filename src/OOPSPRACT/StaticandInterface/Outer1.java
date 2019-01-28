package OOPSPRACT.StaticandInterface;

public class Outer1 {
    private int Outer_x = 100;

    void display() {
     InnerClass in=new InnerClass();
     in.show();
    }

    class InnerClass {
        int y = 90;

        void show() {
            System.out.println("Inner class methods displaying value of outer_x " + Outer_x);
        }
    }
    void showy(){
       // System.out.println("Outer class method trying to access inner class variable " + y);
    //won't work outer class does not have access to inner class variables
    }
}
class InnerClassDemo{
    public static void main(String[] args) {
        Outer1 out1=new Outer1();
        out1.display();
        out1.showy();
    }
}
