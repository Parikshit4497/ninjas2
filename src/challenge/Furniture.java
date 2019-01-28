package challenge;

public class Furniture {
    private int noOfalmirahs;
    private int noOfshelves;
    private int couches;
    private int tables ;
    private int  noOfvase;
    private  Bed bedINroom;

    public Furniture(int noOfalmirahs, int noOfshelves, int couches, int tables, int  noOfvase, Bed bedINroom)
    {
        this.couches=couches;
        this.noOfalmirahs=noOfalmirahs;
        this.noOfvase=noOfvase;
        this.tables=tables;
        this.noOfshelves=noOfshelves;
        this.bedINroom=bedINroom;
    }

    public Bed getBedINroom() {
        return bedINroom;
    }

    public void setBedINroom(Bed bedINroom) {
        this.bedINroom = bedINroom;
    }

    public void  tableColour(String colour)
    {
        System.out.println("The colour of the table is:" + colour );
    }
    public  void colourOfcouch(String couchColour)
    {
        System.out.println("The colour of the couch is:" + couchColour);
    }

    public int getCouches() {
        return couches;
    }

    public void setCouches(int couches) {
        this.couches = couches;
    }

    public int getNoOfalmirahs() {
        return noOfalmirahs;
    }

    public void setNoOfalmirahs(int noOfalmirahs) {
        this.noOfalmirahs = noOfalmirahs;
    }

    public int getNoOfshelves() {
        return noOfshelves;
    }

    public void setNoOfshelves(int noOfshelves) {
        this.noOfshelves = noOfshelves;
    }

    public int getNoOfvase() {
        return noOfvase;
    }

    public void setNoOfvase(int noOfvase) {
        this.noOfvase = noOfvase;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }
}
