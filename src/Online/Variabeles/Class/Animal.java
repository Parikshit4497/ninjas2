package Online.Variabeles.Class;

public class Animal {
    private String name;
    private int brain ;
    private int body;
    private int size;
    private int weight;
    public Animal(String name ,int brain,int body ,int size,int weight)
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
}

