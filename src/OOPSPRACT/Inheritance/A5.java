package OOPSPRACT.Inheritance;

public class A5 {
    int x;
    A5(){
        System.out.println("Inside A5 default constructor");
    }
    A5(int x){
        this();
        this.x=x;
        System.out.println("A param constructor call");
    }
}
class B5 extends A5{
    int x;
    B5(){
        super(1000);
        System.out.println("B default constructor " +(super.x+this.x));
    }
    B5(int x){
        this();
        this.x=x;
        int z=super.x+this.x+x;
        System.out.println("B param call " + z );
    }

}
class Construct{
    public static void main(String[] args) {
        B5 b5=new B5(99);
    }
}