package challenge;
public class MotherBoard1 {
    private String model;
    private String Manufactures;
    private String BIOS;
    private  int ramslots;
    private int cardslots;
    MotherBoard1(String model,String Manufactures,String BIOS,int ramslots,int cardslots)
    {
        this.model=model;
        this.Manufactures=Manufactures;
        this.BIOS=BIOS;
        this.cardslots=cardslots;
        this.ramslots=ramslots;
    }
    public  void loadProgram(String loadProgram)
    {
        System.out.println("The program tis" +loadProgram +" Program is now loaded");
    }
    public String getBIOS() {
        return BIOS;
    }

    public void setBIOS(String BIOS) {
        this.BIOS = BIOS;
    }

    public int getCardslots() {
        return cardslots;
    }

    public void setCardslots(int cardslots) {
        this.cardslots = cardslots;
    }

    public String getManufactures() {
        return Manufactures;
    }

    public void setManufactures(String manufactures) {
        Manufactures = manufactures;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamslots() {
        return ramslots;
    }

    public void setRamslots(int ramslots) {
        this.ramslots = ramslots;
    }
}
