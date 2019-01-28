package OopsPackage;

public class Box7 {
    double width;
    double height;
    double length;
    Box7()
    {
        height=30;
        length=20;
        width=40;
    }
    Box7(double height,double length,double width)
    {
        this.height=height;
        this.width=width;
        this.length=length;
    }
    public double Volume()
    {
        return width*height*length;
    }
}
class BoxDemo7Use
{
    public static void main(String[] args) {
        Box7 b1=new Box7(2,3,6);
        Box7 b2=new Box7(3,4,5);
        Box7 b3 =new Box7();
        System.out.println("The volume of the first box is:" +b1.Volume());
        System.out.println("The volume of the second box is:" +b2.Volume());
        System.out.println("The volume of the third box is:" +b3.Volume());
    }

}