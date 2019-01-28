package OOPSPRACT;

public class OverloadDemo {
    void test(){
        System.out.println("No parameter ");
    }
    void test(int a){
        System.out.println("Single parameter " + a) ;
    }
    void test(int a,int b ){
        System.out.println("a and b " + a+" "+" "+ b);
    }

    double test(double a){
        System.out.println("double a:" + a);
        return a*a;
    }
}
class Demo{
    public static void main(String[] args) {
        OverloadDemo over=new OverloadDemo();
        double result;

        over.test();
        over.test(5);
        over.test(5,7);
        result=over.test(123.25);
        System.out.println("Result of over.test(5,7) "+ result );
    }
}
