package ChallengeRevsion;

import challenge.Dimensions;

public class Case {
    private String model;
    private String manufacturer;
    private  String powerSupply;
    private Dimensions11 dimensions11;
    public  Case(String model,String manufacturer,String powerSupply,Dimensions11 dimensions11)
    {
               this.dimensions11=dimensions11;
               this.manufacturer=manufacturer;
               this.powerSupply=powerSupply;
               this.model=model;
    }

    public Dimensions11 getDimensions11() {
        return dimensions11;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
    public void pressPowerButton()
    {
        System.out.println("The powerSupply is connected ");
    }
}
