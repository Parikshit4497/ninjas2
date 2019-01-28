package challenge;

public class RoomMian {
    public static void main(String[] args) {
        DimensionOfBed dimBed=new DimensionOfBed(15,20,5);
        Bed newBed=new Bed("double bed",dimBed);
        Furniture newFurniture=new Furniture(5,3,1,2,1,newBed);
         DimensionsBathroom  dimBath =new DimensionsBathroom(25,40,60);
         WashRoom   newWashroom =new WashRoom("indian","hindware","rainfall",2,1,2,dimBath);
         Room newRoom=new Room("blue",2,1,4,newWashroom,newFurniture,newBed);
         newRoom.LightisOn("off");
        System.out.println(newRoom.getColurOfwalls());
        newRoom.getBED().locationOfbed("northeast");
        newRoom.getFurniture().colourOfcouch("green");

    }
}
