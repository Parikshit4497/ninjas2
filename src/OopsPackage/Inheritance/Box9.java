package OopsPackage.Inheritance;

public class Box9 {
    double width;
    double length;
    double height;
    Box9()
    {
        width=-1;
        length=-1;
        height=-1;
    }
    Box9(double width,double length,double height)
    {
        this.height=height;
        this.width=width;
        this.length=length;
    }
    Box9(double len)
    {
        length=height=width=len;
    }
    Box9(Box9 o)
    {
       length= o.length;
       width=o.width;
       height=o.width;
    }
        double Volume()
        {
            return  length*width*height;
        }
}
class BoxWeight extends Box9
{
    double weight;
    BoxWeight(double w,double l,double h,double we)
    {
        weight=we;
        length =l;
        width=w;
        height=h;
    }
}
class Box9Use
{
    public static void main(String[] args) {
        BoxWeight b1=new BoxWeight(4,6,7,8);
        BoxWeight  b2=new BoxWeight(9 ,10 ,11,12);
        System.out.println("The volume of the first box is:" + b1.Volume() );
        System.out.println("The weight of the first box is:"+ b1.weight);
        System.out.println("The volume of the second is: " + b2.Volume());
        System.out.println("The weight of the second box is " + b2.weight);
    }
}