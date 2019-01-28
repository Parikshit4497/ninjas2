package OopsPackage;

public class Box6 {
    double height;
    double width;
    double length;
    Box6()
    {
        height=10;
        width=30;
        length=40;
    }
    public double Volume()
    {
        return height*width*length;
    }
}
class Box6Demo
{
    public static void main(String[] args) {
        Box6 B1 =new Box6();
        Box6 B2 =new Box6();
        double vol1=B1.Volume();
        double vol2=B2.Volume();
        System.out.println("The volume of the first box is:" + vol1);
        System.out.println("The volume of the second box is:" + vol2);

    }
}