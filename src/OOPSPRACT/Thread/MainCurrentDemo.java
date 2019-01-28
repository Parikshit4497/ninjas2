package OOPSPRACT.Thread;

public class MainCurrentDemo {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        t.setName("First Thread");
        try{
            for(int n=5;n>=0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}
