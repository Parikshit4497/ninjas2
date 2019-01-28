package challenge;

public class Room{

    private String colurOfwalls;
    private int noOfwindows;
    private int noOfdoors;
    private int noOfAc;
    private WashRoom washRoom;
    private  Furniture furniture;
    private Bed BED;
    Room(String colurOfwalls,int noOfAc,int noOfdoors,int noOfwindows,WashRoom washRoom,Furniture furniture,Bed BED)
    {
        this.colurOfwalls=colurOfwalls;
        this.noOfAc=noOfAc;
        this.noOfdoors=noOfdoors;
        this.noOfwindows=noOfwindows;
        this.washRoom=washRoom;
        this.furniture=furniture;
        this.BED=BED;
    }
    public  void  LightisOn(String status)
    {
        System.out.println("Are the lights in te room turned on: " + status);
    }
    public void WindowsClose(String statusOfWindows)
    {
        System.out.println("Are the windows of the room are closed :" +statusOfWindows);
    }


    public Bed getBED() {
        return BED;
    }

    public void setBED(Bed BED) {
        this.BED = BED;
    }

    public String getColurOfwalls() {
        return colurOfwalls;
    }

    public void setColurOfwalls(String colurOfwalls) {
        this.colurOfwalls = colurOfwalls;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public int getNoOfAc() {
        return noOfAc;
    }

    public void setNoOfAc(int noOfAc) {
        this.noOfAc = noOfAc;
    }

    public int getNoOfdoors() {
        return noOfdoors;
    }

    public void setNoOfdoors(int noOfdoors) {
        this.noOfdoors = noOfdoors;
    }

    public int getNoOfwindows() {
        return noOfwindows;
    }

    public void setNoOfwindows(int noOfwindows) {
        this.noOfwindows = noOfwindows;
    }

    public WashRoom getWashRoom() {
        return washRoom;
    }

    public void setWashRoom(WashRoom washRoom) {
        this.washRoom = washRoom;
    }
}
