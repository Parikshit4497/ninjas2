package OopsPackage.Inheritance;

public class Box10 {
    double width;
    double length;
    double height;
    Box10()
    {   width=-1;
        length=-1;
        height=-1;
    }
    Box10(double width,double length,double height)
    {
        this.length=length;
        this.height=height;
        this.width=width;
    }
    Box10(double len)
    {
        width=height=length=len;
    }
    Box10(Box10 obj)
    {
        length=obj.length;
        width=obj.width;
        height=obj.height;
    }
    double Volume()
    {
        return length*width*height;
    }

}
class Box10weight extends Box10
{
    double weight ;
    Box10weight(double length,double weight,double height,double width)
    {
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
    }

}
class   RefDemo
{
    public static void main(String[] args) {
        Box10weight weightbox=new Box10weight(3,5,7,9);
        Box10 plainbox=new Box10();
        double vol;
        vol=weightbox.Volume();
        System.out.println("The volume of the box is: " + vol);
        System.out.println("The weight of the box is: " + weightbox.weight);
        System.out.println();
      /* plainbox=weightbox;
         vol=plainbox.Volume();
         System.out.println("Volume of plainbox is: " + vol);
         System.out.println("Weight of plainbox is: " + plainbox.weight); */
      /* This code gives error as the superclass does not have access to members of subclass*/
    }
}