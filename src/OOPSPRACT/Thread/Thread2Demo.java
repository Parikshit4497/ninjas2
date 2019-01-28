package OOPSPRACT.Thread;
class ThreadImplement implements Runnable{
     Thread t;

    ThreadImplement() {
         t = new Thread(this, "Demo2");
         System.out.println("Inside thread constructor child thread " + t);
         t.start();
     }
    @Override
    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(" Child Thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
    }

}
public class Thread2Demo {
    public static void main(String[] args) {
      new ThreadImplement();
      try{
          for(int i=5;i>=0;i--){
              System.out.println("The thread number is" + i);
              Thread.sleep(1000);
          }
      }catch (InterruptedException e){
          System.out.println("Main thread Implemented ");
      }
    }
}
