package OopsPackage;

public class Box4 {
    double width;
    double height;
    double length;
    public double volume()
    {
        return width*height*length;
    }
}
class BoxDemo4
{
    public static void main(String[] args) {
        Box4 b1= new Box4();
        Box4 b2= new Box4();
        b1.width=30;
        b1.length=20;
        b1.height=10;

        b2.length=10;
        b2.height=30;
        b2.width=40;
        double vol1=b1.volume();
        double vol2=b2.volume();
        System.out.println("The volume of the  box is: " + vol1);
        System.out.println("The volume of the box is :" + vol2);
    }
}