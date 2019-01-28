package OOPSPRACT.Thread;

public class ThreadExtend extends Thread {
    ThreadExtend(){
        super("Demo Thread");
        System.out.println("The child thread is " +this);
        start();
    }
    public void  run(){
        try{
            for(int i=5;i>=0;i--){
                System.out.println("The child thread counter " + i);
                Thread.sleep(500);

            }
        }catch ( InterruptedException e){
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting childe thread");
    }

}
class ThreadDemoImpl {
    public static void main(String[] args) {
        new ThreadExtend();
        try{
            for(int i=5;i>=0;i--){
                System.out.println("Main thread " +i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Thread has been implemented ");
        }
        System.out.println("Exiting Main thread");
    }
}