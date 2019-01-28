package OopsPackage;

public class OverloadTestDemo {
    public static void main(String[] args) {
        OverloadDemo o1=new OverloadDemo();
        o1.test();
        o1.test(5);
        o1.test(6.6666666666666);
        o1.test(7,9);
        o1.test(4.5,5.6);
    }
}
