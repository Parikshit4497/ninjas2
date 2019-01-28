package challenge;

public class Figure {
    double dim1;
    double dim2;
    Figure(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
    double Area()
    {
        System.out.println("Area of figure is undefine:");
        return 0;
    }
}
class Rectangle extends Figure
{
    Rectangle(double a,double b)
    {
        super(a,b);
    }
    double  Area()
    {
        return  dim1*dim2;
    }
}
class Triangle extends Figure
{
    Triangle(double a,double b)
    {
        super(a,b);
    }
    double Area()
    {
        return dim1*dim2/2;
    }
}
class FindArea
{
    public static void main(String[] args) {
        Figure figure=new Figure(4,5);
        Rectangle rect=new Rectangle(8,9);
        Triangle tri =new Triangle(5,6);
        Figure figu ;
        figu=rect;
        System.out.println("Area is :"+ figu.Area());
        figu=tri;
        System.out.println("Area is :" +figu.Area());
        figu=figure;
        System.out.println("Area is : " +figu.Area());
    }
}