package OopsPackage;

public class ClassImplement {
    double number;
    double cost;
    public void getData(double number,double cost)
    {
        this.number=number;
        this.cost=cost;
    }
    public void displayData()
    {
        System.out.println("The number of items are: " + number);
        System.out.println("The cost of each item: " +cost);
    }
}
class  ClassUse
{
    public static void main(String[] args) {
        ClassImplement c1=new ClassImplement();
        c1.getData(50,40);
        c1.displayData();

    }
}