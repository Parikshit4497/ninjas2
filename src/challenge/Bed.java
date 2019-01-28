package challenge;

public class Bed {
     private String bedtype;
     private   DimensionOfBed dimensionOfBed ;
     private String directionOfbed;
     Bed(String bedtype,DimensionOfBed dimensionOfBed)
     {
         this.dimensionOfBed=dimensionOfBed;
         this.bedtype=bedtype;
     }

     public void locationOfbed(String directionofbed)
     {
         System.out.println("The bed is facing :" +directionofbed+" direction");
     }
    public String getBedtype() {
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype;
    }

    public DimensionOfBed getDimensionOfBed() {
        return dimensionOfBed;
    }

    public void setDimensionOfBed(DimensionOfBed dimensionOfBed) {
        this.dimensionOfBed = dimensionOfBed;
    }
}
