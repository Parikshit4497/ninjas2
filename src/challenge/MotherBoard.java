package challenge;

public class MotherBoard {
    private String model;
    private String Manufacturere;
    private int ramslots ;
    private int cardslots;
    private String BIOS;
    MotherBoard(String model,String Manufactres,int ramslots,int cardslots,String BIOS)
    {
        this.BIOS=BIOS;
        this.model=model;
        this.Manufacturere=Manufactres;
        this.ramslots=ramslots;
        this.cardslots=cardslots;
    }

    public void loadProgram(String programName)
    {
        System.out.println("The program is:" +programName+" is now loading :");
    }
    public String getManufacturere() {
        return Manufacturere;
    }

    public void setManufacturere(String manufacturere) {
        Manufacturere = manufacturere;
    }

    public int getCardslots() {
        return cardslots;

    }

    public void setCardslots(int cardslots) {
        this.cardslots = cardslots;
    }

    public String getBIOS() {
        return BIOS;
    }

    public void setBIOS(String BIOS) {
        this.BIOS = BIOS;
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
