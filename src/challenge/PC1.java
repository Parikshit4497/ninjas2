package challenge;

import challenge.Case1;
import challenge.Monitor1;
import challenge.MotherBoard1;

public class PC1 {
    private Case1 choosecase1;
   private  Monitor1 monitor1;
   private MotherBoard1 chooseMotherboard;
   public   PC1(Case1 choosecase1,Monitor1 monitor1,MotherBoard1 chooseMotherboard)
    {
        this.choosecase1=choosecase1;
        this.chooseMotherboard=chooseMotherboard;
        this.monitor1=monitor1;
    }
    public MotherBoard1 getChooseMotherboard() {
        return chooseMotherboard;
    }

    public void setChooseMotherboard(MotherBoard1 chooseMotherboard) {
        this.chooseMotherboard = chooseMotherboard;
    }



    public Case1 getChoosecase1() {
        return choosecase1;
    }

    public void setChoosecase1(Case1 choosecase1) {
        this.choosecase1 = choosecase1;
    }

    public Monitor1 getMonitor1() {
        return monitor1;
    }

    public void setMonitor1(Monitor1 monitor1) {
        this.monitor1 = monitor1;
    }
}
