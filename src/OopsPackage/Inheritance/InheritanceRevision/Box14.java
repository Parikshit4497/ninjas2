package OopsPackage.Inheritance.InheritanceRevision;

public class Box14 {
   private double width;
    private double length;
    private  double height;
    Box14()
    {
        length=-1;
        width=-1;
        height=-1;
    }
    Box14(double len)
    {
        length=width=height=len;
    }
    Box14(double l,double w,double h)
    {
        length=l;
        width=w;
        height=h;
    }
    Box14(Box14 O)
    {
        length=O.length;
        width=O.width;
        height=O.height;
    }
    public double Volume()
    {
     return  length*width*height;
    }

}
class weightBox14 extends Box14
{
    double weight;
    weightBox14()
    {
        super();
        weight=-1;
    }
    weightBox14(double len,double weight)
    {
        super(len);
        this.weight=weight;
    }
    weightBox14(double l,double w,double h,double we)
    {
        super(l,w,h);
        weight=we;
    }
    weightBox14(weightBox14 o)
    {
        super(o);
        weight=o.weight;
    }
}
class weightBox14Use
{
    public static void main(String[] args) {
        weightBox14 w1=new weightBox14(4,5,6,7);
        weightBox14 w2=new weightBox14(6,7);
        weightBox14 w3=new weightBox14();
        weightBox14 w4=new weightBox14(w2);
        System.out.println("The volume of the first box is: " + w1.Volume());
        System.out.println("The weight of the first box is: " + w1.weight);
        System.out.println("The volume of the  second box is: "+ w2.Volume());
        System.out.println("The weight of the second box is: " + w2.weight );
        System.out.println("The volume of the third box is: " + w3.Volume());
        System.out.println("The weight of the third box is: " + w3.weight);
        System.out.println("The volume of the fourth box is: " + w4.Volume());
        System.out.println("The weight of the fourth box is:" + w4.weight);


    }
}