package ChallengeRevsion;


public class PCmain {
    public static void main(String[] args) {
        Dimensions11 thedimesnions=new Dimensions11(20,20,5);
        Case  thecase=new Case("2286","Dell","240",thedimesnions);
        Monitor monitor=new Monitor("27 inch Beast ","Acer",27,new Resolution2(2540,1440));
        MotherBoard theMotherboard=new MotherBoard("BJ-200","Asues","4",6);
        PC thePC =new PC(thecase,monitor,theMotherboard);
        thePC.getMonitor().drawPixelAt(5,7,"red");
        thePC.getMotherBoard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
