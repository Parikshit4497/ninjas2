package OopsPackage;

public class Box {
    double width ;
    double length;
    double height;
}
class BoxDemo1
{
    public static void main(String[] args) {
        Box b1=new Box();
        b1.height=10;
        b1.width=20;
        b1.length=30;

        double vol=b1.height*b1.width*b1.length;
        System.out.println("The volume of the box is: " + vol);
    }
}
