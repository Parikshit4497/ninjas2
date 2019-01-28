package challenge;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2 ;
    private Wall wall3;
    private  Wall wall4;
    private Ceiling ceiling;
    private Bed1 bed1;
    private Lamp lamp;
    public Bedroom(Wall wall1,Wall wall2,Wall wall3,Wall wall4,Ceiling ceiling ,Bed1 bed1,Lamp lamp ,String name)
    {
        this.bed1=bed1;
        this.ceiling=ceiling;
        this.name=name;
        this.wall1=wall1;
        this.wall2=wall2;
        this.wall1=wall3;
        this.wall4=wall4;
        this.lamp=lamp;
    }
    public Lamp getLamp()
    {
        return this.lamp;
    }
    public void makeUpBed()
    {
        System.out.println("Bedroom making bed");
        bed1.make();
    }
}
