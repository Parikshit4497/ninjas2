package challenge;

import StringsAnd2dArray.WavePattern;

public class MianRoom {
    public static void main(String[] args) {
        Wall wall1 =new Wall("West");
        Wall wall2=new Wall("East");
        Wall wall3=new Wall("North");
        Wall wal4=new Wall("South");
        Ceiling ceiling=new Ceiling(12,"Red");
        Bed1 newBed=new Bed1("Modern",4,3,2,1);
        Lamp newLamp=new Lamp("Classic",false,75);
        Bedroom newBedroom=new Bedroom(wall1,wall2,wall3,wal4,ceiling,newBed,newLamp,"tims");
        newBedroom.makeUpBed();
        newBedroom.getLamp().turnOn();

    }
}
