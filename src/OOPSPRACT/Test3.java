package OOPSPRACT;

import javax.xml.bind.SchemaOutputResolver;

public class Test3 {
    int a, b;
    Test3(int i,int j) {
        a = i;
        b=j;
    }
    void method(Test3 o) {
        o.a*=2;
        o.b/=2;
    }
}
class calllByRef{
    public static void main(String[] args) {
        Test3 test=new Test3(4,6);
        System.out.println("The value of a and b before call " + test.a+" " +test.b);
        test.method(test);
        System.out.println("The value of a and b after call " +test.a +" " +test.b);

    }
    }
