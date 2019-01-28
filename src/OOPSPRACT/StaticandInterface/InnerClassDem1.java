package OOPSPRACT.StaticandInterface;
class Outer2{
        int Outer_x=100;
        void show(){
            System.out.println("Inside void show before object ");
        }

    void test(){
            for(int i=0;i<10;i++) {
                class InnerClassDemo2 {
                    void show() {
                        System.out.println("display outer_x" + Outer_x);
                    }
                }


                InnerClassDemo2 inn=new InnerClassDemo2();
                inn.show();
            }

    }

}

public class InnerClassDem1 {
    public static void main(String[] args) {
     Outer2 out=new Outer2();
     out.show();
     out.test();
    }
}
