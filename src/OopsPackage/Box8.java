package OopsPackage;

public class Box8 {
    double width ;
    double height;
    double  depth;
    Box8(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box8()
    {
        width=-1;
        depth=-1;
        height=-1;
    }
    Box8(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
        return width*height*depth;
    }

}
class OverloadCons
{
    public static void main(String[] args) {
        Box8 mybox1=new Box8(7,8,9);
        Box8 mybox2=new Box8();
        Box8 mybox3=new Box8(9);
        double vol1;
        vol1=mybox1.volume();
        System.out.println("The volume of the first box is: " + vol1);
        double vol2=mybox2.volume();
        System.out.println("The volume of the second box is:" + vol2);
        double vol3=mybox3.volume();
        System.out.println("The volume of the third box is:" + vol3);
    }
}