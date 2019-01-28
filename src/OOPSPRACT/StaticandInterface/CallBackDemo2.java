package OOPSPRACT.StaticandInterface;

class client1 implements  CallBack{


    @Override
    public void callBack(int param) {
        System.out.println("Implementing another version of callback");
        System.out.println("Implementing callback" +param*param);
    }
}
public class CallBackDemo2 {
    public static void main(String[] args) {
        CallBack c=new client();
        c.callBack(42);
        client1 c1=new client1();
        c1.callBack(42);
        }
    }

