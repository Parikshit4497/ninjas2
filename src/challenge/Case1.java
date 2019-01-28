package challenge;

public class Case1 {
    private String model;
 private    String manufactres;
   private String powersupply;
   private  Dimesions1 dimensions;
    public Case1(String model,String manufactres,String powersupply,Dimesions1 dimensions)
    {
        this.model=model;
        this.manufactres=manufactres;
        this.dimensions=dimensions;
        this.powersupply=powersupply;
    }

    public Dimesions1 getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimesions1 dimensions) {
        this.dimensions = dimensions;
    }

    public String getManufactres() {
        return manufactres;
    }

    public void setManufactres(String manufactres) {
        this.manufactres = manufactres;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public void setPowersupply(String powersupply) {
        this.powersupply = powersupply;
    }
}
