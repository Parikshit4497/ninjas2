package OopsPackage.Inheritance;

public class Box11 {
    double width;
    double length;
    double height;
    Box11(){
        length=-1;
        width=-1;
        height=-1;
    }
    Box11(double w,double h,double l)
    {
        length=l;
        width=w;
        height=h;
    }
    Box11(double len)
    {
        width=height=length=len;
    }
    Box11(Box11 o)
    {
        width=o.width;
        length=o.length;
        height=o.height;
    }
    double Volume()
    {
        return  length*width*height;
    }
}
class Box11Weight extends Box11
{
    double weight;
    Box11Weight (Box11Weight o)
    {
        super(o);
        weight=o.weight;
    }
    Box11Weight()
    {
        super();
        weight=-1;
    }
    Box11Weight(double w,double h,double l,double we)
    {
        super(w,h,l);
        weight=we;
    }
    Box11Weight(double len,double we)
    {
      super(len);
      weight=we;
    }
}
class Box11WeightUse
{
    public static void main(String[] args) {
        Box11Weight b1= new Box11Weight();
        Box11Weight b2=new Box11Weight(4,5,6,7);
        Box11Weight b3=new Box11Weight(7,9);
        Box11Weight b4 =new Box11Weight(b3);
        System.out.println("The volume of the first box is: " + b1.Volume());
        System.out.println("The weight of the first box is:" + b1.weight);
        System.out.println("The volume of the second box is:" + b2.Volume());
        System.out.println("The weight of the second  box is:" + b2.weight);
        System.out.println("The volume of the third box is:" + b3.Volume());
        System.out.println("The weight of the  third box is:" + b3.weight);
        System.out.println("The volume of the fourth box is:" + b4.Volume());
        System.out.println("The weight of the fourth box is:" + b4.weight);
    }
}