package OopsPackage;

public class Box2 {
    double width ;
    double height;
    double length;
}
class BoxDemo2
{
    public static void main(String[] args) {
        Box2 b1= new Box2();
        Box2 b2=new Box2();
        b1.width=10;
        b1.length=20;
        b1.height=30;
        b2.height=20;
        b2.width=10;
        b2.length=40;
        double vol1=b1.height*b1.length*b1.width;
        double vol2=b2.height*b2.length*b2.width;
        System.out.println("The volume of the first box is: " + vol1);
        System.out.println("The volume of the second box is: " + vol2 );
    }
}
