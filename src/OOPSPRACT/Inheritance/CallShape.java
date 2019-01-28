package OOPSPRACT.Inheritance;

class Shape{
     int x;
    int y;
    void points(){
        System.out.println("The points in the figure are " +"X"+x+"Y"+y);
    }
    void showpoints(){
        System.out.println("Show points on the given figure");
    }
    void fillingpoints(){
        System.out.println("The function is filling the foreground");
    }
    void foreground(){
        System.out.println("Filling the foreground with the specified colour ");
    }
    void backgroundcolor(){
        System.out.println("The colour of the background is ");
    }
    void area(){
        System.out.println("The area of the given shape ");
    }
    void perimeter (){
        System.out.println("The perimeter of the given shape is ");
    }

}
class Rectangle extends Shape{
     void area() {
         System.out.println("The area of rectangle is given by l*b");
     }
     void perimeter(){
         System.out.println("The perimeter of the given figure is  2*(l+b)");
     }
     void lengthAndBreadth(){
         System.out.println("The dimensions of the rectangle can be understood using its length and breadth");
     }
}
class Circle extends Shape{
  void area(){
      System.out.println("The area of the circle can be given by pi*r*r");
  }
  void perimeter(){
      System.out.println("The perimeter of the given circle is given by 2*pi*r");
  }
  void  radius(){
      System.out.println("The dimensions of the circle can be understood using its radius");
  }
}
class Square extends Shape{
void area(){
    System.out.println("The area of square is given by l*l");
}
void perimeter(){
    System.out.println("The perimeter of square is given by 4*l");
}
void length(){
    System.out.println("The dimensions of the square can be understood from its length");
}
}

public class CallShape {
    void callShape(Shape shape){
        shape.backgroundcolor();
        shape.fillingpoints();
      //  shape.points();
        shape.showpoints();
        shape.foreground();

        if( shape instanceof Circle){
            Circle circle= (Circle)shape;
            circle.x=9;
            circle.y=9;
            circle.area();
            circle.perimeter();
            circle.radius();
            circle.points();
        }else if(shape instanceof Square){
            Square sqaure=(Square)shape;
            sqaure.area();
            sqaure.perimeter();
            sqaure.length();
            sqaure.x=9;
            sqaure.y=8;
            sqaure.points();
        }else if(shape instanceof  Rectangle){
            Rectangle rectangle =(Rectangle)shape;
            rectangle.area();
            rectangle.perimeter();
            rectangle.lengthAndBreadth();
            rectangle.x=9;
            rectangle.y=10;
            rectangle.points();
        }

    }
    public static void main(String[] args) {
        CallShape c1=new CallShape();
        c1.callShape(new Rectangle());
        c1.callShape(new Circle());
        c1.callShape(new Square());
    }
}