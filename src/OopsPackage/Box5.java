package OopsPackage;

public class Box5 {
    double width;
    double height;
    double length;
    public double Volume()
    {
        return width*length*height;
    }
    public void setVolume(double height,double length,double width)
    {
        this.height=height;
        this.length=length;
        this.width=width;

    }
}
class Box5Use
{
    public static void main(String[] args) {
        Box5 b1 =new Box5();
        Box5 b2= new Box5();
        b1.setVolume(20,30,40);
        b2.setVolume(30,40,60);
        double vol1=b1.Volume();
        double vol2=b2.Volume();
        System.out.println("The volume of the first box is: " + vol1);
        System.out.println("The volume of the second box is: " + vol2);
    }
}