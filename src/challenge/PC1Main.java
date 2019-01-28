package challenge;

public class PC1Main {
    public static void main(String[] args){

        Dimesions1 getDimension1=new Dimesions1(890,578,456);
        Case1 newcase=new Case1("dell","dell","1540 mha",getDimension1);
        MotherBoard1 chooseMotherBoard=new MotherBoard1("pavillion","hp","Intel",4,6);
        Monitor1  monitor1 =new Monitor1("INSPIRON","HP",27,new Resolution1(2540,6790));
        PC1  newPc=new PC1(newcase,monitor1,chooseMotherBoard);
        newPc.getChooseMotherboard().loadProgram("Windows");
        newPc.getMonitor1().drawPixelAt(50,60,"red");
        System.out.println( newPc.getChooseMotherboard().getBIOS());
        System.out.println(newPc.getChoosecase1().getManufactres());
    }
}
