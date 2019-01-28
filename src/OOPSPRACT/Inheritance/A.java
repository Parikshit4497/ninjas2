package OOPSPRACT.Inheritance;

public class A {
    int i,j ;
    void showij(){
        System.out.println("The value of i and j" + i+" "+ j+" " );
    }
}
class B extends A{
    int k;
    void shok(){
        System.out.println("k:" + k);
    }
    void sum(){
        System.out.println("i+j+k " +(i+j+k));
    }
}
class SimpleInhertitance{
    public static void main(String[] args) {
        A superOb=new A();
        B subOb=new B();

        superOb.i=10;
        superOb.j=20;
        System.out.println("Contents of superob:");
        superOb.showij();
        subOb.i=10;
        subOb.j=30;
        subOb.k=40;
        System.out.println("The contents of subclass");

        subOb.showij();
        subOb.shok();
        System.out.println("The sum of i ,j and k ");
        subOb.sum();
    }
}