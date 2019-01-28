package challenge;

public class WashRoom {


    private  String toiletType;
    private String SinkType;
    private String showerType;
    private  int noOfMirrors;
    private int noOfbuckets;
    private  int noOftowelStands;
    private DimensionsBathroom dimensionsBathroom;
    WashRoom(String toiletType,String Sinktype,String showerType,int noOfbuckets,int noOftowelStands,int noOfMirrors,DimensionsBathroom dimensionsBathroom )
    {
        this.noOfMirrors=noOfMirrors;
        this.dimensionsBathroom=dimensionsBathroom;
        this.showerType=showerType;
        this.noOfbuckets=noOfbuckets;
        this.noOftowelStands=noOftowelStands;
        this.toiletType=toiletType;
        this.SinkType=Sinktype;
    }

    public DimensionsBathroom getDimensionsBathroom() {
        return dimensionsBathroom;
    }

    public void setDimensionsBathroom(DimensionsBathroom dimensionsBathroom) {
        this.dimensionsBathroom = dimensionsBathroom;
    }

    public int getNoOfbuckets() {
        return noOfbuckets;
    }

    public void setNoOfbuckets(int noOfbuckets) {
        this.noOfbuckets = noOfbuckets;
    }

    public int getNoOfMirrors() {
        return noOfMirrors;
    }

    public void setNoOfMirrors(int noOfMirrors) {
        this.noOfMirrors = noOfMirrors;
    }

    public int getNoOftowelStands() {
        return noOftowelStands;
    }

    public void setNoOftowelStands(int noOftowelStands) {
        this.noOftowelStands = noOftowelStands;
    }

    public String getShowerType() {
        return showerType;
    }

    public void setShowerType(String showerType) {
        this.showerType = showerType;
    }

    public String getSinkType() {
        return SinkType;
    }

    public void setSinkType(String sinkType) {
        SinkType = sinkType;
    }

    public String getToiletType() {
        return toiletType;
    }

    public void setToiletType(String toiletType) {
        this.toiletType = toiletType;
    }
}
