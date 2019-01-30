package OopsPackage.TryCatch;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;
        try{
            a=0;
            d=42/0;
        }catch(ArithmeticException e){
            System.out.println("Division by Zero ");
        }
        System.out.println("After catch statement ");
    }
}
