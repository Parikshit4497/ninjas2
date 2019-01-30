package OopsPackage.TryCatch;
class Finally{
    static void DemoA(){
        try {
            System.out.println("Inside Try demo A");
            throw new RuntimeException("Demo");
        }finally {
            System.out.println("Inside finally demoA");
        }
    }
    static void DemoB(){
        try {
            System.out.println("Inside demo B");
            return;
        }finally{
            System.out.println("Inside finally demo B");
        }
    }
    static  void demoC(){
        try{
            System.out.println("Inside demo C");
        }finally {
            System.out.println("Inside finally demo C");
        }
    }
}
public class FinallyDemo {
    public static void main(String[] args) {
        try{
            Finally.DemoA();
        }catch (NullPointerException e){
            System.out.println("Null pointer exception " + e);
        }finally {


            Finally.DemoB();
            Finally.demoC();
        }
    }

}
