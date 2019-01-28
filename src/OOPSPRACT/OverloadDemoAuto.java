package OOPSPRACT;

public class OverloadDemoAuto {
    void test(){
        System.out.println("No Parameters ");
    }
    void test(int a,int b){
        System.out.println("Value of a and b is " + a+" " +" " +b);
    }
    void test(double a){
        System.out.println("Inside test(double) a " + a);
    }
}
class OverAutoBox{
    public static void main(String[] args) {
        OverloadDemoAuto o1=new OverloadDemoAuto();
        int i=88;
        o1.test();
        o1.test(3,4);
        o1.test(i);
        o1.test(123.5);
    }
}