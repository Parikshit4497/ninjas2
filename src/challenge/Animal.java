package challenge;

public class Animal {
    private String name;
    private int brain ;
    private int body;
    private int size;
    private int weight;

    public Animal(int body,String name,int brain,int size,int weight ) {
        this.body = body;
        this.name = name;
        this.size=size;
        this.brain=brain;
        this.weight=weight;
    }
public void move(int speed)
{
    System.out.println("Inside animal.move(),Animal is moving at speed:" +speed);
}
public void eat()
{
    System.out.println("Animal.eat called");
}
    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
