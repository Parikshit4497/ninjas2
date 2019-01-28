package challenge;

public class Case {


    private String model;
    private  String Manufacturer;
    private  String powerSupply;
    private  Dimensions dimensions;
    public Case(String model,String Manufacturer,String powerSupply,Dimensions dimensions)
    {
        this.model=model;
        this.Manufacturer=Manufacturer;
        this.powerSupply=powerSupply;
        this.dimensions=dimensions;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
