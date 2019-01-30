package OopsPackage.TryCatch;

public class ChainExcDemo {
    static  void exceptionDemo() throws NullPointerException{
        NullPointerException e=new NullPointerException("Detail");
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            exceptionDemo();
        }catch (NullPointerException e){
            System.out.println("The exception thrown is " + e);
            System.out.println("The cause of the exception is" + e.getCause());
        }
    }
}
