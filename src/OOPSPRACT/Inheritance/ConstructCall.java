package OOPSPRACT.Inheritance;
class A3{
    A3(){
        System.out.println("Inside constructor A");
    }
}
class B3 extends  A3{
    B3(){
        System.out.println("Inside constructor B");
    }
}
class C3 extends B3{
    C3(){
        System.out.println("Inside  constructor C");
    }
}
public class ConstructCall {
    public static void main(String[] args) {
        C3 c3 =new C3();
    }
}
