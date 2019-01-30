package OopsPackage.TryCatch;
class MyException extends  Exception{
    int detail;
    MyException(int  a){
        detail=a;
    }

    @Override
    public String toString() {
        return "My exception " +detail+" thrown";
    }
}
public class MyExceptionDemo {
    static void myTest(int a) throws MyException {
        System.out.println("Inside mytest function comuted on " +a);

            if(a>10) throw new MyException(a);
    }
    public static void main(String[] args) {
        try{
            myTest(1);
            myTest(20);
        }catch (MyException e){
            System.out.println("The exception thrown is " + e);
        }

    }
}
