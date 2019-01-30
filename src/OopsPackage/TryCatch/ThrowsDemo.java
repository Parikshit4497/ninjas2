package OopsPackage.TryCatch;

class Throws{
    static void demoThrow() throws NullPointerException{
        System.out.println("inside demoThrow()");
        throw new NullPointerException("Demo");
    }
}
public class ThrowsDemo {
    public static void main(String[] args) {
        try{
            Throws.demoThrow();
        }catch (NullPointerException e){
            System.out.println("Null pointer exception caught " + e);
        }
    }
}
