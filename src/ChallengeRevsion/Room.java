package ChallengeRevsion;

import challenge.WashRoom;

public class Room {
    Bathroom bathroom;
    Wall wall1;
    Wall  wall2;
    Wall wall3;
    Wall wall4;
    Ceiling ceiling;
    Bed  bed1;
    int noOfswitches;
    int noOffans;
    int nOoflights;
     lamp lamp1;
    Room(Bathroom bathroom ,Wall wall1,Wall wall2 ,Wall wall3,Wall wall4,Ceiling ceiling ,Bed  bed1,int noOfswitches,int noOffans,int nOoflights,lamp lamp1)
    {
        this.bathroom=bathroom;
        this.wall1=wall1;
        this.wall2=wall2;
        this.wall3=wall3;
        this.wall4=wall4;
        this.bed1=bed1;
        this.ceiling=ceiling;
        this.noOfswitches=noOfswitches;
        this.noOffans=noOffans;
        this.nOoflights=nOoflights;
        this.lamp1=lamp1;
    }

}
class lamp
{
    private String style;
    private boolean battery;
    private int globalrating;
    lamp(String style,boolean battery,int globalrating)
    {
        this.battery=battery;
        this.globalrating=globalrating;
        this.style=style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalrating() {
        return globalrating;
    }

    public String getStyle() {
        return style;
    }
}
class Bed
{
    private double length;
    private  double width;
    private  double depth;
    private  String typeOfmatess;
    private String bedsheetcolor;
    private int noOfpillows;
    Bed(double length,double width,double depth,String typeOfmatess,String bedsheetcolor,int noOfpillows)
    {
        this.bedsheetcolor=bedsheetcolor;
        this.depth=depth;
        this.noOfpillows=noOfpillows;
        this.typeOfmatess=typeOfmatess;
        this.length=length;
        this.width=width;
    }

    public String getBedsheetcolor() {
        return bedsheetcolor;
    }

    public double getDepth() {
        return depth;
    }

    public double getLength() {
        return length;
    }

    public int getNoOfpillows() {
        return noOfpillows;
    }

    public String getTypeOfmatess() {
        return typeOfmatess;
    }

    public double getWidth() {
        return width;
    }
}
class Bathroom
{
    private boolean door=false;
    private int noOfswitches;
    private  int mirrors ;
    private  int NoOftaps;
    private String typeOfpot;
    private boolean stateOfswitch;
    private boolean shower;

    Bathroom(int noOfswitches,int mirrors,int noOftaps,boolean stateOfswitch,String typeOfpot,boolean shower, boolean door)
    {
            this.door=door;
            this.mirrors=mirrors;
            this.noOfswitches=noOfswitches;
            this.NoOftaps=noOftaps;
            this.shower=shower;
            this.typeOfpot=typeOfpot;

            this.stateOfswitch=stateOfswitch ;  }

    public boolean isDoor() {
        return door;
    }

    public int getMirrors() {
        return mirrors;
    }

    public int getNoOfswitches() {
        return noOfswitches;
    }

    public int getNoOftaps() {
        return NoOftaps;
    }

    public boolean isShower() {
        return shower;
    }

    public String getTypeOfpot() {
        return typeOfpot;
    }
    public void openDoor (boolean door)
    {
        System.out.println("Do you wish to open the door :" + door);
    }
    public void  switchOnOff(boolean stateOfswitch)
    {
        System.out.println("Is the state switch on or switch off: "+ stateOfswitch);
    }

}
class Wall
{
    private  double  length;
    private  double width ;
    private double height;
    private String direction;
    Wall(double length,double width,double height,String direction)
    {
        this.length=length;
        this.width=width;
        this.direction=direction;
        this.height=height;
    }

    public String getDirection() {
        return direction;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
class Ceiling
{
     private  double length;
     private double width;
    private String color;



    Ceiling(double length, double width, String color)
    {
         this.color=color;
         this.length=length;
         this.width=width;
    }
    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
class Room1
{
    public static void main(String[] args) {
        Wall wall1 =new Wall(9,5,8,"north");
        Wall wall2=new Wall(9,5,8,"south");
        Wall wall3=new Wall(9,5,8,"east");
        Wall wall4=new Wall(9,5,8,"West");
        Ceiling ceil=new Ceiling(9,8,"red");
        Bed bed1=new Bed(9,8,7,"sleepwell","pink",5);
        lamp lamp=new lamp("fjk",true,7);
        Bathroom  bathroom=new Bathroom(7,1,4,true,"English",true,true);
        Room room=new Room(bathroom,wall1,wall2,wall3,wall4,ceil,bed1,5,6,7,lamp);
        room.bathroom.openDoor(true);
        room.bathroom.switchOnOff(false);
    }
}