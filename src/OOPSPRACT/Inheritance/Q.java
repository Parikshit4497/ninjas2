package OOPSPRACT.Inheritance;

public class Q {
    final void show(){
        System.out.println("Final method implementation Q class");
    }
    final void print(){
        System.out.println("Print function Q class");
    }
}
class T extends Q{
    /*void show(){

    } The method cannot be overidden as it is final in parent class Q*/
   /* @Override
    void print(){

    } same reason as show*/
   void show1(){
       System.out.println("Show1 method class T");
   }
   void print1(){
       System.out.println("Print function class T  ");
   }

}
class FinalA{
    private final int MAX ;
    FinalA(){
        MAX=100;
    }
    void show(){
        final int Q=100;
        System.out.println("Inside show " +MAX);
    }
}
class useOfFinalDemo{
    public static void main(String[] args) {
        FinalA e=new FinalA();
        e.show();
        T t1=new T();
        t1.print();
        t1.show();
        t1.print1();
        t1.show1();
    }
}