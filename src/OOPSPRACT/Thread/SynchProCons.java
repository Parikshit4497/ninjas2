package OOPSPRACT.Thread;
class Q1 {
    int n;
    boolean valueSet = false;

    synchronized void put(int n) {
        while(valueSet){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Interrupted exception");
            }
        }
        valueSet=false;
        this.n = n;
        notify();
        System.out.println("Put " + n);
    }

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted ");
            }
        }
            System.out.println("Get " + n);
            valueSet = true;
            notify();
            return n;

    }
}
class Consumer implements  Runnable{
    Q1 q;
    Consumer(Q1 q){
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    public void run(){
        while(true){
            q.get();
        }
    }

}
class Producer implements  Runnable{

    Q1 q;
    Producer (Q1 q){
        this.q=q;
        new Thread(this,"Producer").start();
    }
    public  void run(){
        int i=0;
        while(true){
            q.put(i++);
        }
    }

}
public class SynchProCons {
    public static void main(String[] args) {
        Q1 q=new Q1();
        new Producer(q);
        new Consumer(q);
    }
}
