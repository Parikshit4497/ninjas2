package OopsPackage;

public class Box3 {
    double width;
    double length;
    double height;

    public void volume()
    {
        double vol=width*height*length;
        System.out.println("Th volume of the box is:" + vol);
    }

}
class Box3Use
{
    public static void main(String[] args) {
        Box3 b1=new Box3();
        Box3 b2=new Box3();
        b1.length=20;
        b1.width=30;
        b1.height=40;
        b2.width=40;
        b2.height=30;
        b2.length=50;
        b1.volume();
        b2.volume();
    }
}