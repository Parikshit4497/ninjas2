package OOPSPRACT.Thread;

import java.util.concurrent.Callable;

class CallMe{
    public void printMessage(String message){
        System.out.print("[" +message);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("The chile thread has been interrupted");
        }
        System.out.print("]");
    }
}
public class SynchCallMe implements  Runnable{
    Thread t ;
    CallMe target;
    String message ;
    SynchCallMe(String msg,CallMe targ){
        target=targ;
        message=msg;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (target){
            target.printMessage(message);
        }
    }
}
class SynchCall{
    public static void main(String[] args) {
        CallMe target =new CallMe();
        SynchCallMe  c1=new SynchCallMe("Hello",target);
        SynchCallMe c2=new SynchCallMe("Messge",target);
        SynchCallMe c3=new SynchCallMe("String ",target);
        try{
            c1.t.join();;
            c2.t.join();
            c3.t.join();
        }catch(InterruptedException e){
            System.out.println("The ");
        }
    }
}
