package OOPSPRACT.Thread;

public class AsynchMessage {
    public void CallMe(String message){
        System.out.println("[ "+message );
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("]");
    }
}
class Caller implements  Runnable{
    String message;
    AsynchMessage target;
    Thread t;
    Caller(AsynchMessage asm,String msg){
        target=asm;
        message=msg;
        t=new Thread(this);
        t.start();
    }
    public  void run(){
        target.CallMe(message);
    }
}
class AsynchCallMe {
    public static void main(String[] args) {
        AsynchMessage asm=new AsynchMessage();
        Caller ob1 =new Caller(asm,"Hello");
        Caller ob2=new Caller(asm,"Synchronize");
        Caller ob3=new Caller(asm,"Message");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Main thread InterrupTed");
        }
        System.out.println("Exiting Main Thread");
    }
}