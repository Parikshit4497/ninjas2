package OopsPackage.Inheritance;

public class Box12 {
    double width;
    double length;
    double height;
    Box12()
    {
        length=-1;
        width=-1;
        height=-1;
    }
    Box12(Box12 o)
    {
        width=o.width;
        height=o.height;
        length=o.length;
    }
    Box12(double len)
    {
        width=height=length=len;
    }
    Box12(double length,double width ,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
   double Volume()
   {
       return  length*height*width;
   }

}
class Box12WeightBox extends Box12
{
    double weight;
    Box12WeightBox()
    {
        super();
        weight=-1;
    }
    Box12WeightBox(double len,double weight)
    {
        super(len);
        this.weight=weight;
    }
    Box12WeightBox(double length,double width,double height,double weight)
    {
        super(length,width,height);
        this.weight=weight;

    }
    Box12WeightBox(Box12WeightBox o)
    {
        super(o);
        weight=o.weight;
    }
}
class  Box12Shipment extends Box12WeightBox
{
    double cost;
    Box12Shipment()
    {
        super();
        cost=-1;
    }
    Box12Shipment(Box12Shipment o)
    {
        super(o);
        cost=o.cost;
    }
    Box12Shipment(double len,double w,double c)
    {
        super(len,w);
        cost=c;
    }
    Box12Shipment(double length,double width,double height,double weight,double cost)
    {
        super(length,width,height,weight);
        this.cost=cost;
    }
}
class Bos12ShipmentUse
{
    public static void main(String[] args) {
        Box12Shipment b1=new Box12Shipment(12,23,45,56,78);
        Box12Shipment b2=new Box12Shipment();
        Box12Shipment b3=new Box12Shipment(5,6,7);
        Box12Shipment b4=new Box12Shipment(b3);
        System.out.println("The volume of the first box is: "+ b1.Volume());
        System.out.println("The weight of the first box is:" + b1.weight);
        System.out.println("The cost of the first shipment :" + b1.cost);
        System.out.println();
        System.out.println("The volume of the second box is: "+ b2.Volume());
        System.out.println("The weight of the second box is:" + b2.weight);
        System.out.println("The cost of the second  shipment :" + b2.cost);
        System.out.println();
        System.out.println("The volume of the third box is: "+ b3.Volume());
        System.out.println("The weight of the third  box is:" + b3.weight);
        System.out.println("The cost of the third shipment :" + b3.cost);
        System.out.println();
        System.out.println("The volume of the fourth box is: "+ b4.Volume());
        System.out.println("The weight of the fourth  box is:" + b4.weight);
        System.out.println("The cost of the fourth shipment is :" + b4.cost);
        System.out.println();
    }
}