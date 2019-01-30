package OOPSPRACT.Thread;
class A{
    synchronized  void foo(B b){
        String name=Thread.currentThread().getName();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread A has been interrupted ");
        }
        System.out.println(name+"Trying to call b.last()");
        b.last();
    }
    synchronized  void last(){
        System.out.println("The message last for A has been displayed");
    }
}
class B{
    synchronized  void bar(A a){
        String name= Thread.currentThread().getName();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread B has been interrupted");
        }
        System.out.println(name+"Trying to call thread a.last()");
        a.last();
    }
    synchronized  void last(){
        System.out.println("The class B last has been called");
    }
}
public class Deadlock implements  Runnable {
    A a=new A();
    B b=new B();
    Deadlock(){
        Thread.currentThread().setName("Main thread ");
        Thread t=new Thread(this,"Racing Thread");
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }
    public  void run(){
        b.bar(a);
        System.out.println("Back in other thread");
    }
    public static void main(String[] args) {
        new Deadlock();
    }
}
