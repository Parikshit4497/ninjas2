package challenge;

public class CarMian {
    public static void main(String[] args) {
        Ignis i1=new Ignis("ignis base","v 12",0,200,654000,"6 stroke",1.74,1.36,260,6,4,false,4,4);
        System.out.println("The name of the car is:"+ i1.name);
        System.out.println("The name of the engine is :" +i1.getEngine());
        System.out.println("The type of engine is: "+ i1.getEngine_type());
        System.out.println("The top speed of teh car is:"+i1.getMax_speed());
        System.out.println("The price of teh car is :" +i1.getPrice());
        System.out.println("The number of gears in the car are :"+i1.getNo_gears());
        System.out.println("Th number of the doors of the car is:"+i1.getDoors());
        System.out.println("The number of wheels in the  car are: " + i1.getWheel());
        i1.accelerate(20);


    }
}
