package OopsPackage.Inheritance.InheritanceRevision;

public class Box13 {
    double width ;
    double length;
    double height;
    Box13()
    {
        width=-1;
        length=-1;
        height=-1;
    }
    Box13(double len)
    {
        height=length=width=len;
    }
    Box13(double length,double width,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    Box13(Box13 o)
    {
        length=o.length;
        width=o.height;
        height=o.width;
    }
    double Volume()
    {
        return  length*width*height;
    }
}
class Box13Weight13 extends Box13
{
    double weight;
    Box13Weight13(double weight,double height,double length,double width)
    {
        this.weight=weight;
        this.height=height;
        this.length=length;
        this.width=width;

    }
}
class Box13Use
{
    public static void main(String[] args) {
        Box13Weight13 b1=new Box13Weight13(4,5,6,7);
        Box13Weight13 b2=new Box13Weight13(8,9,10,11);
        System.out.println("The volume of first box is:"+ b1.Volume());
        System.out.println("The weight of the box is:"+ b1.weight);
        System.out.println("The volume of the second box is: "+b2.Volume());
        System.out.println("The weight of teh second box is: " +b2.weight);
    }
}