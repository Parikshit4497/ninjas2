package OopsPackage.Inheritance;

public class Box15 {
    private double length;
    private  double width;
    private double height;
    Box15()
    {
        length=-1;
        width=-1;
        height=-1;
    }
    Box15(double len)
    {
        length=width=height=len;
    }
    Box15(double l,double w,double h)
    {
        length=l;
        width=w;
        height=h;
    }
    Box15(Box15 o)
    {
        length=o.length;
        width=o.width;
        height=o.height;
    }
    double Volume()
    {
        return  length*width*height;
    }
}
class Box15Weight extends Box15
{
     double weight;
    Box15Weight()
    {
        super();
        weight=-1;
    }
    Box15Weight(double len,double weight)
    {
        super(len);
        this.weight=weight;
    }
    Box15Weight (double l,double w,double h,double we)
    {
        super(l,w,h);
        weight=w;
    }
    Box15Weight(Box15Weight o)
    {
        super(o);
        weight=o.weight;
    }
}
class shipment extends Box15Weight
{
    double cost;
    shipment()
    {
        super();
        cost=-1;
    }
    shipment(double len,double we,double c)
    {
        super(len,we);
        cost=c;
    }
    shipment(double l,double w,double h,double we,double c)
    {
        super(l,w,h,we);
        cost=c;
    }
    shipment(shipment s) {
        super(s);
        cost=s.cost;
    }
}
class shipmentUse
{
    public static void main(String[] args) {
        shipment s1 = new shipment(4, 5, 6, 7, 8);
        shipment s2 = new shipment(5, 6, 7);
        shipment s3 = new shipment();
        shipment s4 = new shipment(s2);
        System.out.println("The volume of the first box is: " + s1.Volume());
        System.out.println("The cost  of the first box is:" + s1.cost);
        System.out.println("The weight of the box is:" + s1.weight);
        System.out.println("The volume of the second box is: " + s2.Volume());
        System.out.println("The cost  of the second box is:" + s2.cost);
        System.out.println("The weight of the second is:" + s2.weight);

        System.out.println("The volume of the third box is: " + s3.Volume());
        System.out.println("The cost  of the third box is:" + s3.cost);
        System.out.println("The weight of the third box is:" + s3.weight);
        System.out.println("The volume of the  fourth box is: " + s4.Volume());
        System.out.println("The cost  of the fourth box is:"+ s4.cost);
        System.out.println("The weight of the fourth is:" + s4.weight);
    }
}