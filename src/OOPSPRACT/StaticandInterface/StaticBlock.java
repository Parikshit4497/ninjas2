package OOPSPRACT.StaticandInterface;

class T1 extends Object{
    int ee ;
    static T1 e1;
    public void finalize(){
        e1=this;
        System.out.println("I will call when object is ready to end " +this);
    }
    static int n=1000;
    static{
        System.out.println("Init block1");
    }
    static {
        System.out.println("Init block2");
    }
    static String collectCollegeInfoFromDB(){
        return "srcc";
    }
    static{
        n=100;
        System.out.println("I will call when class is loaded" +n+collectCollegeInfoFromDB());
    }
    static{
        System.out.println("Static block");
    }
    int m;
    T1(){
        m=100;
        System.out.println("T1 constructor");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        T1 obj=new T1();
        System.out.println(obj.m);
        obj=null;
        System.gc();
        for(int i=0;i<10;i++){
            System.out.println("I is" + i );
        }
        if(T1.e1==null){
            obj=T1.e1;
            System.out.println("Reborn" +obj.m);
        }
    }
}
