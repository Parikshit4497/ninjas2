package challenge;

public class MainMonitor {
    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20,20,3);
        Case theCase  =new Case("220B","Dell","240",dimensions);
        Monitor theMonitor =new Monitor("27inch ","Acer",27,new Resolution(2540,14400));
        MotherBoard theMotherBoard =new MotherBoard("BJ-200","Aseus",4,6,"v 2.44");
           PC thePC =new PC(theCase,theMonitor,theMotherBoard);
           thePC.getMonitor().drawPixelAt(1500,1200,"red");
           theMotherBoard.loadProgram("Windows 1.0");
           thePC.getMotherBoard().loadProgram("linux");
           thePC.getTheCase().getPowerSupply();
    }
}
