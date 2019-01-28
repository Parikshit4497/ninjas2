package OopsPackage;

public class OverloadTest1 {
    public void  Volume(double a)
    {
        System.out.println("The volume of the cube is;" + a*a*a);
    }
    public void Volume(double l,double b,double h)
    {
        System.out.println("The volume of the cuboid :" + l*b*h);
    }
    public void Volume(float r,float h)
    {
        System.out.println("The volume of the cylinder is: " + 3.1413*r*r*h);
    }
    public void Volume(float r)
    {
        System.out.println("The volume of the sphere is: " + (4/3)*3.14143*r*r*r);
    }
}
class OverloadTestDemo1
{
    public static void main(String[] args) {
        OverloadTest1 o1=new OverloadTest1();
        o1.Volume(4.66666666666);
        o1.Volume(1.111111, 2.67777777888888,5.6666666);
        o1.Volume(4.56f, 5.67f);
        o1.Volume(4.5f);
    }
}