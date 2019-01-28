package challenge;

public class Dogs extends  Animal {

    private int eyes;
    private  int legs;
    private  int tail;
    private  int teeth;
    private  String coat;
   /* public Dogs(int body, String name, int brain, int size, int weight) {
        super(body,name,brain,size,weight);
    }*/
    /*All dogs have one brain and one body so there is no point forcing it on the programmer to a
    * add those when we can give the a default value and we will also add parameters th
    * at are specific to class dog */
    public Dogs( String name, int size, int weight,int tail,int legs,int teeth,String coat ,int eyes) {
        super(1,name,1,size,weight);
    this.coat=coat;
    this.eyes=eyes;
    this.legs=legs;
    this.tail=tail;
    }
    public  void chew()
    {
        System.out.println("Dog.chew() called:");
    }
    public  void  eat()
    {
        System.out.println("Dog.eat()called");
        chew();
        super.eat();
    }
    public void  walk() {
        System.out.println("Inside Dog.walk()");
        move(5);
    }
    public void run()
    {
        System.out.println("Inside Dog.run()");
       super.move(10);
    }
    public void moveLegs(int speed)
    {
        System.out.println("Dogs.moveLegs() called");
    }
  /*  public void move(int speed)
    {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }*/
}