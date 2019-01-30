package OopsPackage.TryCatch;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
        int a=args.length;
        int b=42/a;
        int c[]={1};
        c[42]=99;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception caught is " + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception ");
        }
    }
}
