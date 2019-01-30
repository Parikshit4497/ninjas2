package OopsPackage.TryCatch;

class CheckTryCatch{
    static  void test(int a){
        try{
            if(a==1){
                a=a/a-a;
            }
            if(a==2){
                int c[]= {1};
                c[42]=99;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception " + e);
        }
    }
}
public class MethNestTry {
    public static void main(String[] args) {
        int a=args.length;
        try {
            int b = 42 / a;
            System.out.println("Value of a is" + a);
            CheckTryCatch.test(a)                   ;
        }catch (ArithmeticException e){
            System.out.println("The arithmetic exception is " + e);
        }
    }
}

