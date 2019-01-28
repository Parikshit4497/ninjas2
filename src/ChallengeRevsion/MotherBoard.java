package ChallengeRevsion;

public class MotherBoard {
    private String model;
    private String manufacture;
    private int cardslots;
    private String bios;
    public MotherBoard(String model,String manufacture,String bios,int cardslots)
    {
        this.manufacture=manufacture;
        this.bios=bios;
        this.cardslots=cardslots;
        this.model=model;
    }
              public  void loadProgram(String programName)
              {
                  System.out.println("Program" + programName + "is now loading ....");
              }
     public String getBios() {
        return bios;
    }

    public int getCardslots() {
        return cardslots;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }
}
