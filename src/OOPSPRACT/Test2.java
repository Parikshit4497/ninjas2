package OOPSPRACT;

public class Test2 {
    void method(int i,int j){
        i*=2;
        j/=2;
    }
}
class CallByValue{
    public static void main(String[] args) {
        Test2 test=new Test2();
        int a=10,b=15;
        System.out.println("The value of a and b before call " + a +" "+ b );
        test.method(a,b);
        System.out.println("The value of a and b after call " + a + " "+ b);
    }
}
