package OopsPackage.TryCatch;
class Throw {
    static void demoThrow() {
        try {
            throw new NullPointerException("Demo");
        } catch ( NullPointerException e) {
            System.out.println("Inside catch for class Throw");
            throw  e;
        }
    }
}

public class ThrowDemo {
    public static void main(String[] args) {
        try{
            Throw.demoThrow();
        }catch (NullPointerException e){
            System.out.println("Null pointer exception caught " + e);
        }
    }
}
