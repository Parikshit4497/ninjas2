package challenge;

public class Animal1 {
    private String name ;
    private int brain ;
    private int body;
    private int size;
    private int weight;
    public Animal1(String name ,int brain ,int body,int size,int weight)
    {
        this.name=name;
        this.brain=brain;
        this.body=body;
        this.size=size;
        this.weight=weight;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
    public void eat()
    {
        System.out.println("Animal.eat() called");
    }
    public void move(int speed)
    {
        System.out.println("Animal.move() called Animal is moving at :" + speed);
    }
}
class Dog extends Animal1
{
    private int eyes;
    private int legs;
    private int tail;
    private  int teeth;
    private String coat ;
    public Dog(String name,int size,int weight,int eyes,int legs,int tail,int teeth,String coat )
    {
        super( name,1,1,weight,size);
        this.coat=coat;
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
    }
    private void chew()
    {
        System.out.println("Dog.chew() called");
    }
    public  void  eat()
    {
        System.out.println("Dog.eat()");
        chew();
        super.eat();
    }
    public void walk()
    {
        System.out.println("Dog.walk() called");
        move(5);
    }
    private void movelegs(int speed)
    {
        System.out.println("Dogs.run() called");
    }
    public void move(int speed)
    {
        System.out.println("Dogs.move called");
        movelegs(speed);
        super.move(10);
    }
    public void run()
    {
        System.out.println("Dog.run() called");
        move(10);
    }

}
class Fish1 extends Animal1
        {
             private int gills ;
             private int eyes;
             private  int fins;
              Fish1(String name,int brain,int body,int size,int weight,int gills,int fins,int eyes)
             {
                 super(name,1,1,size,weight);
                 this.eyes=eyes;
                 this.fins=fins;
                 this.gills=gills;

             }
             private void rest()
             {

             }
             private void moveMuscles()
             {

             }
             private void moveBackFin()
             {

             }
             private void swim(int speed)
             {
                 moveMuscles();
                 moveBackFin();
                 super.move(speed);
             }
        }
class MainAnim
{
    public static void main(String[] args) {
        Animal1     animal=new Animal1("Animal",1,1,1,5);
        Dog dog =new Dog("yorkie",8,30,6,4,1,20,"longsilky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}