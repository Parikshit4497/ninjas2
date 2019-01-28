package OOPSPRACT.Thread;

class Q{
    int n;
    synchronized void put(int n){
        this.n=n;
        System.out.println("Put  " + n);
    }
    synchronized  int get(){
        System.out.println("Get " +n);
        return n;
    }
}
class producer implements  Runnable{
    Q q;
    producer(Q q){
        this.q=q;
        new Thread( this,"Producer").start();
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
        }
    }
}
class consumer implements  Runnable {
    Q q;

    consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer");
    }

    public void run() {
        while (true) {
        q.get();
        }
    }
}
public class ProducerConsumAsynch {
    public static void main(String[] args) {
        Q q=new Q();
        new producer(q);
        new  consumer(q);

    }
}
