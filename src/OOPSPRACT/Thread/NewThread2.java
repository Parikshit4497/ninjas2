package OOPSPRACT.Thread;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class NewThread2 implements  Runnable {
    Thread t;
    NewThread2(String threadname){
        t=new Thread(this,threadname);
        System.out.println("Thread is" +t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>=0;i--){
                System.out.println("Child thread is" + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Child thread interrupted ");
        }
        System.out.println("Child thread exiting ");
    }
}
class ThreadDemo3 {
    public static void main(String[] args) {
      NewThread2 ob1=new NewThread2("one");
      NewThread2 ob2=new NewThread2("two");
      NewThread2 ob3=new NewThread2("three");

        System.out.println("Thread one is alive " + ob1.t.isAlive());
        System.out.println("Thread two is alive " + ob2.t.isAlive());
        System.out.println("Thread three is alive " + ob3.t.isAlive());
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("The main thread is interrupted");
        }
        System.out.println("Thread one is alive"+ob1.t.isAlive());
        System.out.println("Thread two is alive " +ob2.t.isAlive());
        System.out.println("Thread three is alive" + ob3.t.isAlive());
    }
}